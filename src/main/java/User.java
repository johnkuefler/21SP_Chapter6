/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class User {
    private String email;
    private String userName;
    private String password;
    private float dailyLoggedOnHours;
    
    public User() {
        email = "";
        userName = "";
        password = "";
        dailyLoggedOnHours = 0;
    }

    public User(String email, String userName, String password, float dailyLoggedOnHours) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.dailyLoggedOnHours = dailyLoggedOnHours;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getDailyLoggedOnHours() {
        return dailyLoggedOnHours;
    }

    public void setDailyLoggedOnHours(float dailyLoggedOnHours) {
        this.dailyLoggedOnHours = dailyLoggedOnHours;
    }
    
    public double calculateYearlyLoggedOnHours() {
        return this.dailyLoggedOnHours * 365;
    }
}
