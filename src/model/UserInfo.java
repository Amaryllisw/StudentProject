package model;

public class UserInfo {
    private String stuId; // 学号
    private String username; // 姓名
    private String password; // 密码
    private String role; // 角色



    public UserInfo() {

    }

    public UserInfo(String stuId, String username, String password, String role) {
        this.stuId = stuId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
