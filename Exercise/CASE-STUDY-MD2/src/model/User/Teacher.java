package model.User;

<<<<<<< HEAD
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
=======
import config.ConfigReadAndWriteFile;
import model.Class.EnglishClass;
import model.Class.Shift;
import service.user.UserServiceIMPL;

import java.io.Serializable;

public class Teacher extends User implements Serializable {
    private static int id;
    private String teacherId;
    private double teacherSalary = 0.0;
    private EnglishClass firstEnglishClass;
    private EnglishClass secondEnglishClass;


    public Teacher(String userFullName, String userName, String userPassword,
                   String userEmail, int userAge, String userPhoneNumber, String userAddress, Gender gender) {
        super(userFullName, userName, userPassword, userEmail, userAge, userPhoneNumber, userAddress, gender);
        try {

            id = Integer.parseInt(UserServiceIMPL.teacherList.get(UserServiceIMPL.teacherList.size() - 1).getUserId().substring(4));
        } catch (Exception e) {
            id = 0;
        }
        this.teacherId = "TCHR" + String.valueOf(++id);

    }


    public EnglishClass getFirstEnglishClass() {
        return firstEnglishClass;
    }

    public boolean setFirstEnglishClass(EnglishClass firstEnglishClass) {
        EnglishClass temp = this.firstEnglishClass;
        this.firstEnglishClass = firstEnglishClass;
        if (!checkShift()) {
            this.firstEnglishClass = temp;
            return false;
        } else {
            temp = null;
            return true;
        }
    }

    public EnglishClass getSecondEnglishClass() {
        return secondEnglishClass;
    }

    public boolean setSecondEnglishClass(EnglishClass secondEnglishClass) {
        EnglishClass temp = this.secondEnglishClass;
        this.secondEnglishClass = secondEnglishClass;
        if (!checkShift()) {
            this.secondEnglishClass = temp;
            return false;
        } else {
            temp = null;
            return true;
        }
    }

    public boolean getStatus() {
        return secondEnglishClass == null || firstEnglishClass == null;
    }

    public double getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String idTeacher) {
        this.teacherId = idTeacher;
    }

    public String getFirstCourseName() {
        return firstEnglishClass.getCourseName();
    }

    public String getFirstClassName() {
        return firstEnglishClass.getClassName();
    }

    public String getFirstRoomName() {
        return firstEnglishClass.getRoomName();
    }

    public Shift getFirstShift() {
        return firstEnglishClass.getShift();
    }

    public String getSecondCourseName() {
        return secondEnglishClass.getCourseName();
    }

    public String getSecondClassName() {
        return secondEnglishClass.getClassName();
    }

    public String getSecondRoomName() {
        return secondEnglishClass.getRoomName();
    }

    public Shift getSecondShift() {
        return secondEnglishClass.getShift();
    }

    private boolean checkShift() {
        return firstEnglishClass.getShift() != secondEnglishClass.getShift();
    }
    public  boolean checkShiftCanAdd(Shift shift){
        if(shift==Shift.SHIFT1){
            if(getFirstShift()==Shift.SHIFT2){
                return  true;
            }else return getSecondShift() == Shift.SHIFT2;
        }else if(shift==Shift.SHIFT2){
            if(getFirstShift()==Shift.SHIFT1){
                return  true;
            }else return getSecondShift() == Shift.SHIFT1;
        }
        return false;
>>>>>>> 6ba14ee (Exercise)
    }
}
