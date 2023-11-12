package models;

public class Admin {
    private String adminAccount;
    private String adminPassword;

    public Admin() {
        this.adminAccount = "admin";
        this.adminPassword = "admin";
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
