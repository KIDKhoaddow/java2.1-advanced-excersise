package model.User;

import model.Course.Course;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User{
    private final Role.RoleName role= Role.RoleName.TEACHER;
    private double salary=0.0;
    private ArrayList<Course> coursesList=new ArrayList<>(2);
    public Teacher() {
        super();
    }

    public Teacher(int userID, String name, String userPhoneNumber,
                   String userEmail, String userPassword,double salary) {
        super(userID, name, userPhoneNumber, userEmail, userPassword);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "role=" + role +
                ", salary=" + salary +
                ", userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
