package service.teacherService;

import model.User.Teacher;
import model.User.User;

import java.util.List;

public class TeacherServiceIMPL implements ITeacherService{
    public static  String PATH_TEACHER;
    public static  List<Teacher> userTeacherList;


    @Override
    public List<Teacher> findAll() {
        return null;
    }

    @Override
    public void save(Teacher teacher) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void editById(int id) {

    }

    @Override
    public Teacher findById(int id) {
        return null;
    }

    @Override
    public boolean existedByName(String teacherName) {
        return false;
    }

    @Override
    public int getNumberTeacher() {
        return userTeacherList.size();
    }

    @Override
    public void dispById(int id) {
        System.out.println(findById(id));
    }

    @Override
    public void dispAll() {
        for (Teacher element:userTeacherList) {
            System.out.println(element);
        }
    }
}
