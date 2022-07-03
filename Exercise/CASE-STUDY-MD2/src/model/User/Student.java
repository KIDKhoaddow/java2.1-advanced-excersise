package model.User;

<<<<<<< HEAD
public class Student extends User {
    private final Role.RoleName roleStudent = Role.RoleName.STUDENT;
    private String roomName;
    private String teacherName;
    private String courseName;

    public Student() {
        super();
    }

    public Student(int userID, String userName, String userPhoneNumber, String userEmail, String userPassword) {
        super(userID, userName, userPhoneNumber, userEmail, userPassword);
    }

    @Override
    public String toString() {
        return "Student{" +
                "userRole=" + roleStudent +
                ", userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

    public String toStringReciptUser() {
        return roleStudent + "{" +
                roleStudent + "ID = " + userID + "," +
                roleStudent + "Name = " + userName + '\'' + "}\n";
    }

    public String toStringCourse() {
        return roleStudent + "{" +
                roleStudent + "ID =" + userID + "\'" + "," +
                roleStudent + "Name =" + userName + "\'" + ',' +
                roleStudent + "Email =" + userEmail + "\'" + "," +
                roleStudent + "Phone =" + userPhoneNumber + "\'" + "}\n";
    }
=======
import config.ConfigReadAndWriteFile;
import model.Class.EnglishClass;
import model.Class.EnglishClassStatus;
import model.Class.Shift;
import model.Course.Course;
import service.user.UserServiceIMPL;

import java.io.Serializable;

public class Student extends User implements Serializable {

    private static int id;
    private String studentId;
    private EnglishClass englishClass;

    public Student(String userFullName, String userName, String userPassword, String userEmail,
                   int userAge, String userPhoneNumber, String userAddress,Gender gender) {
        super(userFullName, userName, userPassword, userEmail, userAge, userPhoneNumber, userAddress,gender);
        try {
            id = Integer.parseInt(UserServiceIMPL.studentList.get(UserServiceIMPL.studentList.size() - 1).getUserId().substring(3));
        } catch (Exception e) {
            id = 0;
        }
        this.studentId = "STU" + String.valueOf(++id);
    }

    public EnglishClass getEnglishClass() {
        return englishClass;
    }

    public boolean setEnglishClass(EnglishClass englishClass) {
        this.englishClass.setNumberStudent(this.englishClass.getNumberStudent() - 1);
        boolean checkNumberSlot =englishClass.getNumberStudent() < englishClass.getNumberSlot();
        boolean checkClassStatus=englishClass.getStatus()==EnglishClassStatus.PREPARE;
        if(checkNumberSlot&&checkClassStatus){
            englishClass.setNumberStudent(englishClass.getNumberStudent() + 1);
            this.englishClass = englishClass;
            return true;
        }else {
            return false;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        try {
            return englishClass.getCourseName();
        }catch (Exception e){
            return "";
        }
    }

    public String getTeacherName() {
        try {
            return englishClass.getTeacherName();
        }
        catch (Exception e){
            return "";
        }
    }

    public String getRoomName() {
        try {
            return englishClass.getRoomName();
        }catch (Exception e){
            return "";
        }
    }

    public String getClassName() {
        try {
            return englishClass.getClassName();
        }catch (Exception e){
            return "";
        }
    }

    public Shift getShift() {
        try {
            return englishClass.getShift();
        }catch (Exception e){
            return Shift.Null;
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "userId='" + userId + '\'' +
                ", userFullName='" + userFullName + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userGender=" + userGender +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userRole=" + userRole +
                ", studentId='" + studentId + '\'' +
                '}';
    }
>>>>>>> 6ba14ee (Exercise)
}
