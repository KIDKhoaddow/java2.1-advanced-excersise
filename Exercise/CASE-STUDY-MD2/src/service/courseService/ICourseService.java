package service.courseService;

import model.Course.Course;
import model.User.User;
import service.IGenericService;

import java.util.List;

public interface ICourseService extends IGenericService<Course> {
    boolean existedByCourseName(String courseName);
    int getNumberCourse();

}