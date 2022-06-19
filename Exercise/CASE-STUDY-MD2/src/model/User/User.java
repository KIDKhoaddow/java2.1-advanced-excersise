package model.User;

public class User {
    protected   int userID;
    protected   String userName;
    protected   String userPhoneNumber;
    protected   String userEmail;
    protected   String userPassword;

    public User() {
    }

    public User(int userID, String name, String userPhoneNumber, String userEmail,
                String userPassword) {
        this.userID = userID;
        this.userName = name;
        this.userPhoneNumber = userPhoneNumber;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", passWord='" + userPassword + '\'' +
                '}';
    }

}


