package view.AdminView;

import view.Common.CommonView;
import view.Common.LoginView;

import java.util.Scanner;

public class LoginAdminView {
    public LoginAdminView(CommonView commonView, Scanner scanner) {
        commonView.showMessage("============ LOGIN FORM ============");
        String name= commonView.inputString("Enter your Name :",scanner);
        String password= commonView.inputString("Enter your Password :",scanner);
        if(name.equals("Admin")&&password.equals("Admin")){
            commonView.showMessage("Login Success");
            return;
        }else {
            commonView.showMessage("Login failed ! Please check your Name or Pasword!");
            new LoginAdminView(commonView,scanner);
        }
    }

}
