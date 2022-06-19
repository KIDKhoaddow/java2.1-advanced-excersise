package service.studentService;


import model.User.Student;
import service.IGenericService;

import java.util.List;

public interface IStudentService extends IGenericService <Student> {
        boolean existedByStudentName(String studentName);
        int getNumberStudent();



}
