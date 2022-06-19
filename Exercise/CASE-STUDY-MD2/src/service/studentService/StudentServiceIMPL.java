package service.studentService;

import model.User.Student;
import model.User.User;

import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    public static  String PATH_STUDENT;
    public static List<Student> userStudentList;

    @Override
    public boolean existedByStudentName(String studentName) {
        return userStudentList.contains(studentName);
    }

    @Override
    public Student findById(int id) {
        for (Student element:userStudentList) {
            if(element.getUserID()==id){
                return element;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return userStudentList;
    }


    @Override
    public void save(Student student) {
        userStudentList.add(student);
    }

    @Override
    public void deleteById(int id) {
        System.out.println( userStudentList.remove(userStudentList.indexOf(findById(id))));
    }

    @Override
    public void editById(int id) {

    }

    @Override
    public int getNumberStudent() {
        return userStudentList.size();
    }

    @Override
    public void dispById(int id) {
        System.out.println(findById(id));
    }

    @Override
    public void dispAll() {
        for (Student element:userStudentList) {
            System.out.println(element);
        }
    }
}
