package TravelAgencyInformationSystem;


public class Admin {
    private String adminName;  //data members for login
    private String password;

    // set get methods:
    public void setAdmin(String adminName){
        this.adminName =adminName;
    }
    public String getAdminName() {
        return adminName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}

