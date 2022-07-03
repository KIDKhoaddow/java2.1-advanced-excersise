package view.AdminView;
import controller.UserController;
import service.user.UserServiceIMPL;
import view.AdminView.Course.CourseView;
import view.AdminView.EnglishClass.EnglishClassView;
import view.AdminView.User.UserListView;
import view.Common.CommonView;

import java.util.Scanner;

public class AdminView {
    UserController userController=new UserController();
    public AdminView(CommonView commonView, Scanner scanner) {
        new LoginAdminView(commonView,scanner);
        commonView.showMessage("============ Function ============");
        commonView.showMessage("1. User list ");
        commonView.showMessage("2. Room list");
        commonView.showMessage("3. Course list");
        commonView.showMessage("4. Receipt list");
        commonView.showMessage("5. English Class List");
        String selection= commonView.inputString(scanner);
        while(true){
            if(userController.checkInputNumber(1,5,selection)){
               break;
            }else {
                commonView.showMessage("Wrong number , chose again please ");
                selection= commonView.inputString(scanner);
            }
        }
        switch (Integer.parseInt(selection)){
            case 1: new UserListView(commonView,scanner); new AdminView(commonView,scanner);break;
            case 2:
            case 3: new CourseView(commonView,scanner);new AdminView(commonView,scanner);break;
            case 4:
            case 5: new EnglishClassView(commonView,scanner);new AdminView(commonView,scanner);break;


        }

    }




}
