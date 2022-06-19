package service.teacherService;

import model.User.Teacher;
import service.IGenericService;

public interface ITeacherService extends IGenericService<Teacher> {
    boolean existedByName(String teacherName);
    int getNumberTeacher();

}
