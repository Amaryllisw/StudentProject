package control;

import model.Score;
import utils.DataBaseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet("queryScore")
public class ScoreServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sql = "SELECT * FROM user";
        DataBaseUtils db = new DataBaseUtils();
        ArrayList<Map<String, Score>> lists = new ArrayList<>();
        try {
            ResultSet rs = db.getResult(sql);
            while (rs.next()) {
                int yuwen = rs.getInt("yuwen");
                int shuxue = rs.getInt("shuxue");
                int yingyu = rs.getInt("yingyu");
                String name = rs.getString("username");
                Score score = new Score(yuwen, shuxue, yingyu);
                Map<String, Score> map = new HashMap<>();
                lists.add((Map<String, Score>) map.put(name, score));
            }
//            req.getSession().setAttribute("scoremaps", maps);
        } catch (SQLException e) {

        }
    }
}
