package view.AdminView.User;

import controller.UserController;
import model.User.Student;
import model.User.Teacher;
import model.User.User;
import service.user.UserServiceIMPL;
import view.AdminView.User.Edit.EditView;
import view.Common.CommonView;

import java.util.List;
import java.util.Scanner;

public class UserListView {
    UserServiceIMPL userServiceIMPL = new UserServiceIMPL();
    UserController userController = new UserController();

    public UserListView(CommonView commonView, Scanner scanner) {
        commonView.showMessage("============ UserList FORM ============");
        commonView.showMessage("1.Create User ");
        commonView.showMessage("2.Edit User ");
        commonView.showMessage("3.Display User list ");
        commonView.showMessage("4.Display Student List");
        commonView.showMessage("5.Display Teacher List ");
        commonView.showMessage("6.Remove User ");
        commonView.showMessage("7.Back");
        String selection = commonView.inputString(scanner);
        while (true) {
            if (userController.checkInputNumber(1, 7, selection)) {
                break;
            } else {
                commonView.showMessage("Wrong number!Try Again Please :");
                selection = commonView.inputString(scanner);
            }
        }
        switch (Integer.parseInt( selection)) {
            case 1:
                new RegisterView(commonView, scanner);
                new UserListView(commonView, scanner);
                break;
            case 2:
                new EditView(commonView, scanner);
                new UserListView(commonView, scanner);
                break;
            case 3:
                displayUserList(userServiceIMPL.findAll());
                new UserListView(commonView, scanner);
                break;
            case 4:
                displayStudentList(userServiceIMPL.findUserStudent());
                new UserListView(commonView, scanner);
                break;
            case 5:
                displayTeacherList(userServiceIMPL.findUserTeacher());
                new UserListView(commonView, scanner);
                break;
            case 6:

            case 7:
                return;
        }


    }


    public void displayUserList(List<User> userList) {
        System.out.format("+---------+-----------------+-----------------+-----------------+---------+-----+--------------+-------------------+---------------------------+%n");
        System.out.format("| User ID |       Name      |    Username     |     Password    |  Role   | Age | Phone Number |      Address      |             Email         |%n");
        System.out.format("+---------+-----------------+-----------------+-----------------+---------+-----+--------------+-------------------+---------------------------+%n");

        for (User element : userList) {
            displayUser(element);
        }
    }

    public void displayUser(User user) {
        String leftAlignFormat = "| %-7s | %-15s | %-15s | %-15s | %-7s | %-3d | %-12s | %-17s | %-25s |%n";
        System.out.format(leftAlignFormat, user.getUserId(), user.getUserFullName(), user.getUserName(),
                user.getUserPassword(), user.getUserRole(), user.getUserAge(),
                user.getUserPhoneNumber(), user.getUserAddress(), user.getUserEmail());
        System.out.format("+---------+-----------------+-----------------+-----------------+---------+-----+--------------+-------------------+---------------------------+%n");
    }

    public void displayStudentList(List<Student> studentList) {
        System.out.format("+------------+-----------------+-----------------+--------------+-----+---------------------------+----------------+-----------------+%n");
        System.out.format("| Student ID |       Name      |    Username     | Phone Number | Age |             Email         |    Course Name |    Class Name   |%n");
        System.out.format("+------------+-----------------+-----------------+--------------+-----+---------------------------+----------------+-----------------+%n");
        for (Student element : studentList) {
            displayStudent(element);
        }

    }

    public void displayStudent(Student student) {
        String leftAlignFormat = "| %-10s | %-15s | %-15s | %-12s | %-3d | %-25s | %-14s | %-15s |%n";
        System.out.format(leftAlignFormat, student.getStudentId(), student.getUserFullName(), student.getUserName(),
                student.getUserPhoneNumber(), student.getUserAge(), student.getUserEmail(), student.getCourseName(), student.getClassName());
        System.out.format("+------------+-----------------+-----------------+--------------+-----+---------------------------+----------------+-----------------+%n");

    }

    public void displayTeacherList(List<Teacher> teacherList) {
        System.out.format("+------------+-----------------+-----------------+--------------+-----+---------------------------+----------------+-----------------+----------+%n");
        System.out.format("| Teacher ID |       Name      |    Username     | Phone Number | Age |             Email         |    Class 1     |    Class 2      |   Salary |%n");
        System.out.format("+------------+-----------------+-----------------+--------------+-----+---------------------------+----------------+-----------------+----------+%n");
        for (Teacher element : teacherList) {
            displayTeacher(element);
        }

    }

    public void displayTeacher(Teacher teacher) {
        String leftAlignFormat = "| %-10s | %-15s | %-15s | %-12s | %-3d | %-25s | %-14s | %-15s | %-8f |-%n";
        System.out.format(leftAlignFormat, teacher.getTeacherId(), teacher.getUserFullName(), teacher.getUserAge(),
                teacher.getUserPhoneNumber(), teacher.getUserAddress(), teacher.getUserEmail(),
                teacher.getFirstClassName(), teacher.getSecondClassName(), teacher.getTeacherSalary());
        System.out.format("+------------+-----------------+-----------------+--------------+-----+---------------------------+----------------+-----------------+----------+%n");

    }

}
