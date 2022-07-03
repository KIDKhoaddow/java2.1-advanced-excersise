package view.AdminView.User.Edit;

import controller.UserController;
import model.User.Student;
import model.User.User;
import service.Class.EnglishClassServiceIMPL;
import service.Course.CourseServiceIMPL;
import service.user.UserServiceIMPL;
import view.Common.CommonView;

import java.util.Scanner;

public class EditView {
    UserServiceIMPL userServiceIMPL = new UserServiceIMPL();
    UserController userController = new UserController();
    CourseServiceIMPL courseServiceIMPL = new CourseServiceIMPL();
    EnglishClassServiceIMPL englishClassServiceIMPL = new EnglishClassServiceIMPL();


    public EditView(CommonView commonView, Scanner scanner) {
        commonView.showMessage("============ EDIT USER FORM ============");
        commonView.showMessage("1.Edit User Profile ");
        commonView.showMessage("2.Edit Student");
        commonView.showMessage("3.Edit Teacher");
        commonView.showMessage("4.Back ");
        String selection = commonView.inputString(scanner);
        while (true) {
            if (userController.checkInputNumber(1, 4, selection)) {
                break;
            } else {
                commonView.showMessage("Wrong number!Try Again Please :");
                selection = commonView.inputString(scanner);
            }
        }
        switch (Integer.parseInt(selection)) {
            case 1:
                new EditUser(commonView, scanner);
                new EditView(commonView, scanner);
                break;
            case 2:
                new EditStudent(commonView, scanner);
                new EditView(commonView, scanner);
            case 3:
            case 4:
                return;
        }
    }






}
