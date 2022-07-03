package service.Course;

import model.Course.Course;
import model.Course.CourseStatus;
import model.Course.CourseType;
import model.User.Student;
import service.IGenericService;

import java.util.ArrayList;
import java.util.List;

public interface ICourseService extends IGenericService<Course> {
    boolean existedCourseName(String courseName);
    boolean existedCourseId(String courseId);
    int findCourseById(String id);
    Course findCourseByName(String courseName);

    Course editCourseName(int index, String courseName);

    Course editCoursePrice(int index, double coursePrice);
    Course editCourseStatus(int index , CourseStatus courseStatus);
    Course editCourseType(int index , CourseType courseType);

    void saveCourseList();

    String getCourseName(int indexCourse);

    double getCoursePrice(int index);
    ArrayList<Course> findCoursePrepare();

}
