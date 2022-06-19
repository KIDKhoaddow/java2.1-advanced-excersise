package model.Course;

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
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

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
                '}';
    }
}
