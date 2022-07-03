package model.User;

<<<<<<< HEAD
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
=======
import config.ConfigReadAndWriteFile;
import service.user.UserServiceIMPL;

import java.io.File;
import java.io.Serializable;

public class User implements Serializable {
    private int id;
    protected String userId;
    protected String userFullName;
    protected String userName;
    protected String userPassword;
    protected String userEmail;
    protected int userAge;
    protected String userPhoneNumber;
    protected String userAddress;
    protected Role userRole;
    protected Gender userGender;

    public User() {

    }

    public User(String userFullName, String userName, String userPassword,
                String userEmail, int userAge, String userPhoneNumber,
                String userAddress,Gender gender) {
        try {
            id = Integer.parseInt( UserServiceIMPL.userList.get(UserServiceIMPL.userList.size()-1 ).getUserId().substring(4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            id = 0;
        }
        this.userId = "User" + String.valueOf(++id);

        this.userFullName = userFullName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userAge = userAge;
        this.userPhoneNumber = userPhoneNumber;
        this.userAddress = userAddress;
        this.userGender=gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserName() {
        try{
            return userName;
        }catch (Exception e){
            return userName="";
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
>>>>>>> 6ba14ee (Exercise)
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

<<<<<<< HEAD

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


=======
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }


    public Gender getUserGender() {
        return userGender;
    }

    public void setUserGender(Gender userGender) {
        this.userGender = userGender;
    }

}
>>>>>>> 6ba14ee (Exercise)
