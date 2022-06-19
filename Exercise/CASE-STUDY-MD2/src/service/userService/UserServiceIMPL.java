package service.userService;

import model.User.Student;
import model.User.Teacher;
import model.User.User;

import java.util.List;
import java.util.Stack;

public class UserServiceIMPL implements IUserService{
    public static  String PATH_USER;
    public static  List<User> userList;

    public static  String PATH_LOGGING;
    public static  List<User> userLoggingList;


    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public List<User> findAllLogging() {
        return userLoggingList;
    }
    @Override
    public User findById(int id) {
        for (User element:userList) {
            if(id==element.getUserID()){
                return element;
            }
        }
        return null;
    }

    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public boolean existByUserName(String userName) {
        for (User element:userList) {
            if(element.getName().equals(userName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteById(int id) {
        for (User element:userList) {
           if(element.getUserID()==id){
               userList.remove(id);
           }
        }
    }

    @Override
    public void editById(int id) {

    }

    @Override
    public void saveLogging(User user) {
        userLoggingList.add(user);
    }

    @Override
    public void logout() {
    }

    @Override
    public int getNumberUser() {
        return  userList.size();
    }

    @Override
    public void dispById(int id) {
        System.out.println(findById(id));
    }

    @Override
    public void dispAll() {
        for (User element: userList) {
            System.out.println(element);
        }

    }
}
