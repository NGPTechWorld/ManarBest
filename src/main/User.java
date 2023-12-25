package main;

public class User {
    private String fullName;
    private String password;
    private String yearborn;
    private String gendre;
    private int money;
    private boolean admin;
    public User(String fullName, String password, String yearborn, String gendre, int money) {
        this.fullName = fullName;
        this.password = password;
        this.yearborn = yearborn;
        this.gendre = gendre;
        this.money = money;
        this.admin=false;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getYearborn() {
        return yearborn;
    }
    public void setYearborn(String yearborn) {
        this.yearborn = yearborn;
    }
    public String getGendre() {
        return gendre;
    }
    public void setGendre(String gendre) {
        this.gendre = gendre;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
}
