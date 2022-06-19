package service.courseService;

import model.Course.Course;
import model.User.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CourseServiceIMPL implements ICourseService{
    private static  String PATH_COURSE;
    private static   List<Course> courseList;


    @Override
    public List<Course> findAll() {
        return courseList;
    }

    @Override
    public Course findById(int id) {
        for (Course element:courseList) {
            if(element.getIdCourse()==id){
                return element;
            }
        }
        return null;
    }

    @Override
    public void save(Course course) {
        courseList.add(course);
    }

    @Override
    public void deleteById(int id) {
        System.out.println(courseList.remove(courseList.indexOf(findById(id))));
    }

    @Override
    public void editById(int id) {

    }

    @Override
    public void dispById(int id) {
        System.out.println(findById(id));
    }

    @Override
    public void dispAll() {
        for (Course element:courseList) {
            System.out.println(element);
        }
    }

    @Override
    public boolean existedByCourseName(String courseName) {
        for (Course element:courseList) {
            if (element.getNameCourse().equals(courseName)){
                return true;
            }
        }

        return false;
    }

    @Override
    public int getNumberCourse() {
        return courseList.size();
    }
}
