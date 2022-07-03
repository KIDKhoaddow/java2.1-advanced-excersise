package view.Common;

import model.User.User;
import service.user.UserServiceIMPL;

import java.util.List;
import java.util.Scanner;

public class LoginView {

    List<User> userList=UserServiceIMPL.userList;

    public LoginView(CommonView commonView, Scanner scanner) {
    }
}
