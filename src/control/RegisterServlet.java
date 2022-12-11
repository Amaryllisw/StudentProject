package control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.DataBaseUtils;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
        DataBaseUtils db = new DataBaseUtils();
        String queryUser = "SELECT * FROM user";
        String insertSql = "INSERT into user (username, password, role) values(?,?,?)";
        try {
            PreparedStatement psmt = db.insert(insertSql);
            ResultSet rs = db.getResult(queryUser);
            while(rs.next()) {
                if (rs.getString("username").equals(username)) {
                    resp.sendRedirect("register.jsp?err=-1");
                    return;
                }
            }
            psmt.setString(1, username);
            psmt.setString(2, password);
            psmt.setString(3, role);
            psmt.execute();
            resp.sendRedirect("login.jsp");
        } catch (Exception e) {

        }
    }
}
