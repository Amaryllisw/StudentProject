package utils;

import java.sql.*;

public class DataBaseUtils {
    private String user = "root";
    private String password = "1234";
    private String url = "jdbc:mysql://1.12.77.135:3306/student";

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;

    public DataBaseUtils() {
        init();
    }
    void init() {
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            this.connection =
                    DriverManager.getConnection(url, user, password);
            this.statement = connection.createStatement();
        } catch (Exception e) {
        }
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getRs() {
        return rs;
    }

    public Connection getConnection() {
        if (connection == null) {
            init();
        }
        return connection;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    // 获取数据库数据
    public ResultSet getResult(String sql) throws SQLException {
        ResultSet rs = statement.executeQuery(sql);
        this.rs = rs;
        return rs;
    }


    // 添加数据
    public PreparedStatement insert(String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }
 }
