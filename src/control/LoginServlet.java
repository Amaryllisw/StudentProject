package control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import utils.DataBaseUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String inputName = req.getParameter("username");
        String inputPwd = req.getParameter("password");
        DataBaseUtils db = new DataBaseUtils();
        String sql = "SELECT * FROM aa";
        try {
            ResultSet rs = db.getResult(sql);
            while (rs.next()) {
                String name = rs.getString("username");
                String pwd = rs.getString("password");
                if (name.equals(inputName) && pwd.equals(inputPwd)) {
                    // 登录成功
                    HttpSession session = req.getSession();
                    session.setAttribute("username", name);
                    resp.sendRedirect("index.jsp");
                    return;
                }
            }
            resp.sendRedirect("login.jsp?err=-1");
        } catch (SQLException e) {
        }
    }
}
