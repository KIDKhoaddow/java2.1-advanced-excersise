package service.managerService;

import model.Course.Course;
import model.Room.Room;
import model.User.Student;
import model.User.Teacher;

import java.util.ArrayList;
import java.util.HashMap;

public class ManagerServiceIMPL {
    private HashMap<Course,ArrayList<Student>> managerCourse=new HashMap<>();
    private HashMap<Teacher,HashMap<Course, ArrayList<Student>>> mangerTeacher=new HashMap<>();
    private HashMap<Room,HashMap<Course,ArrayList<Student>>> managerRoom=new HashMap<>();

    public void addStudentToCourse(Course course, Student student){
        managerCourse.get(course).add(student);
    }
    public void addCourseToTeacher(Teacher teacher, HashMap<Course,ArrayList<Student>> mangerCourse){
        mangerTeacher.put(teacher,mangerCourse);

    }
    public  void  addCourseToRoom(Room room,HashMap<Course,ArrayList<Student>> managerCourse){
        managerRoom.put(room,managerCourse);
    }

    public void updateTeacherManger(){

    }
}
