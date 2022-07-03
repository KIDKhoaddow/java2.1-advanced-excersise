package model.Course;

<<<<<<< HEAD
import model.User.Student;
import model.User.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
    private  int idCourse;
    private  String nameCourse;
    private  int numberStudent;
    private List<Student> studentList=new ArrayList<>(numberStudent);
    private String teacherName;
    private CourseShift.Shift courseShift;
    private double coursePrice;

    public Course(){

    }

    public Course(int idCourse, String nameCourse, int numberStudent, List<Student> studentList, String teacherName, CourseShift.Shift courseShift, double coursePrice) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.numberStudent = numberStudent;
        this.studentList = studentList;
        this.teacherName = teacherName;
        this.courseShift = courseShift;
        this.coursePrice = coursePrice;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public CourseShift.Shift getCourseShift() {
        return courseShift;
    }

    public void setCourseShift(CourseShift.Shift courseShift) {
        this.courseShift = courseShift;
=======
import model.Class.EnglishClass;
import service.Course.CourseServiceIMPL;
import service.user.UserServiceIMPL;

import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {
    private  int id;
    private  String courseId;
    private  String courseName="";
    private  double coursePrice;
    private CourseStatus status;
    private  CourseType type;

    public Course() {
    }

    public Course( String courseName, double coursePrice ,CourseType type) {
        try {
            id =Integer.parseInt( CourseServiceIMPL.courseList.get(CourseServiceIMPL.courseList.size()-1).getCourseId().substring(4));
        }catch (Exception e){
            id=0;
        }
        this.courseId ="CRSE"+(++id);
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.status=CourseStatus.PREPARE;
        this.type=type;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        try {
            return courseName;
        }catch (Exception e){
            return "";
        }
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
>>>>>>> 6ba14ee (Exercise)
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", nameCourse='" + nameCourse + '\'' +
                ", numberStudent=" + numberStudent +
                ", studentList=" + studentList +
                ", teacherName='" + teacherName + '\'' +
                ", courseShift=" + courseShift +
                ", coursePrice=" + coursePrice +
=======
    public CourseStatus getStatus() {
        return status;
    }

    public void setStatus(CourseStatus status) {
        this.status = status;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Course{" +
                ", courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", coursePrice=" + coursePrice +
                ", status=" + status +
                ", type=" + type +
>>>>>>> 6ba14ee (Exercise)
                '}';
    }
}
