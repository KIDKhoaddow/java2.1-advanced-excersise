package view.AdminView.User.Edit;

import controller.UserController;
import model.User.User;
import service.user.UserServiceIMPL;
import view.Common.CommonView;

import java.util.Scanner;

public class EditUser {
    UserController userController = new UserController();
    UserServiceIMPL userServiceIMPL = new UserServiceIMPL();

    public EditUser(CommonView commonView, Scanner scanner) {
        String id = commonView.inputString("Step 1  Enter User ID You Want Edit (User+ID):", scanner);
        int position = userServiceIMPL.findUserById(id);
        User user = UserServiceIMPL.userList.get(position);
        while (true) {
            if (user == null) {
                commonView.showMessage("Wrong or don't exist User Id,try again please");
                id = commonView.inputString("Enter Id You Want Edit :", scanner);
                user = userServiceIMPL.findById(id);
            } else {
                break;
            }
        }
        commonView.displayObject(user);
        commonView.showMessage("Step 2 : Enter Your Option");
        commonView.showMessage("1.Edit Name");
        commonView.showMessage("2.Edit Age");
        commonView.showMessage("3.Edit PhoneNumber");
        commonView.showMessage("4.Edit Address");
        commonView.showMessage("5.Edit Email");
        commonView.showMessage("6.Edit Gender");
        commonView.showMessage("7.Edit UserName");
        commonView.showMessage("8.Edit Password");
        commonView.showMessage("9.Back Form");
        String selection = commonView.inputString(scanner);
        if (userController.chooseEditUserSelection(commonView, scanner, position, selection)) {
            new EditUser(commonView, scanner);
        } else {
            return;
        }
    }
}
