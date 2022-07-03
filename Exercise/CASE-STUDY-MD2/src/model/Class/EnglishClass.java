package model.Class;

import model.Course.Course;
import model.Course.CourseStatus;
import model.Room.Room;
import model.User.Teacher;
import service.Class.EnglishClassServiceIMPL;
import service.user.UserServiceIMPL;
import java.util.ArrayList;
import java.util.List;

public class EnglishClass {
    private int id;
    private String classId;
    private String className="";
    private Teacher teacher;
    private Course course;
    private Room room;
    private Shift shift;
    private int numberStudent = 0;
    private int numberSlot;
    private EnglishClassStatus status;


    public EnglishClass(String className,int numberSlot,Shift shift) {
        try {
            id = Integer.parseInt(EnglishClassServiceIMPL.englishClassList
                    .get(EnglishClassServiceIMPL.englishClassList.size() - 1)
                    .getClassId().substring(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            id = 0;
        }
        this.classId = "Class" + String.valueOf(++id);
        this.className = className;
        this.numberSlot=numberSlot;
        this.shift=shift;
        this.status=EnglishClassStatus.PREPARE;
    }

    public String getClassId() {
        return classId;
    }

    public String getClassName() {
        try {
            return className;
        }catch (Exception e){
            return "";
        }
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public boolean setCourse(Course course) {
        if(course.getStatus()==CourseStatus.PREPARE){
            this.course = course;
            return true;
        }
        return false;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public int getNumberSlot() {
        return numberSlot;
    }

    public void setNumberSlot(int numberSlot) {
        this.numberSlot = numberSlot;
    }

    public String getTeacherName() {
        return teacher.getUserName();
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public String getRoomName() {
        return room.getRoomName();
    }
    public  int getNumberSeat(){
        return room.getRoomNumberSeat();
    }

    public EnglishClassStatus getStatus() {
        return status;
    }

    public void setStatus(EnglishClassStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EnglishClass{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", shift=" + shift +
                ", numberStudent=" + numberStudent +
                ", numberSlot=" + numberSlot +
                '}';
    }
}
