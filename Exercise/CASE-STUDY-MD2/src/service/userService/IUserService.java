package service.userService;

import model.Course.Course;
import model.User.Student;
import model.User.Teacher;
import model.User.User;
import service.IGenericService;

import java.util.List;
import java.util.Map;

public interface IUserService extends IGenericService<User> {
    boolean existByUserName(String userName);
    List<User> findAllLogging();
    void  saveLogging(User user);
    void logout();
    int getNumberUser();

}
