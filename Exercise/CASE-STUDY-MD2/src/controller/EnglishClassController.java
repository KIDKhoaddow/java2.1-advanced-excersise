package controller;

import java.time.LocalDateTime;

import model.Class.EnglishClass;
import model.Class.Shift;
import model.Course.Course;
import model.User.Teacher;
import service.Class.EnglishClassServiceIMPL;
import service.Course.CourseServiceIMPL;
import service.user.UserServiceIMPL;
import view.AdminView.Course.AddCourseView;
import view.AdminView.Course.DeleteCouresView;
import view.AdminView.Course.EditCourseView;
import view.AdminView.EnglishClass.AddEnglishClassView;
import view.AdminView.EnglishClass.DeleteEnglishClassView;
import view.AdminView.EnglishClass.DisplayEnglishClassView;
import view.AdminView.EnglishClass.EditEnglishClassView;
import view.Common.CommonView;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EnglishClassController {
    UserServiceIMPL userServiceIMPL = new UserServiceIMPL();
    EnglishClassServiceIMPL classServiceIMPL = new EnglishClassServiceIMPL();
    CourseServiceIMPL courseServiceIMPL = new CourseServiceIMPL();

    LocalDateTime localDateTime = LocalDateTime.now();

    public void chooseFunction(CommonView commonView, Scanner scanner) {
        commonView.showMessage("============ ENGLISH CLASS FORM ============");
        commonView.showMessage("1.Add English Class");
        commonView.showMessage("2.Edit English Class");
        commonView.showMessage("3.Delete English Class");
        commonView.showMessage("4.Display English Class");
        commonView.showMessage("5.Back");
        String selection = commonView.inputString(scanner);
        while (true) {
            if (!checkInputNumber(1, 5, selection)) {
                selection = commonView.inputString("Wrong number try again please ", scanner);
            } else {
                break;
            }
        }
        switch (Integer.parseInt(selection)) {
            case 1:
                new AddEnglishClassView(commonView, scanner);
                break;
            case 2:
                new EditEnglishClassView(commonView, scanner);
                break;
            case 3:
                new DeleteEnglishClassView(commonView, scanner);
                break;
            case 4:
                new DisplayEnglishClassView(commonView, scanner);
                break;
            case 5:
                return;
        }
        chooseFunction(commonView, scanner);
    }

    public Shift addEnglishClassShift(CommonView commonView, Scanner scanner) {
        commonView.showMessage("Please Enter the number you want to choose shift:");
        commonView.showMessage("1. Shift 1(Monday-Wednesday-Friday)");
        commonView.showMessage("2. Shift 2(Tuesday-Thursday-Saturday");
        String selection = commonView.inputString(scanner);
        while (true) {
            if (!checkInputNumber(1, 2, selection)) {
                selection = commonView.inputString("Wrong number , try again please:", scanner);
            } else {
                break;
            }
        }
        switch (Integer.parseInt(selection)) {
            case 1:
                return Shift.SHIFT1;
            case 2:
                return Shift.SHIFT2;
            default:
                return Shift.Null;
        }
    }

    public String addEnglishClassName(CommonView commonView, Scanner scanner, Shift shift) {
        commonView.showMessage("Class+Date+Shift");
        String month = String.valueOf(localDateTime.getMonthValue());
        String year = String.valueOf(localDateTime.getYear()).substring(2);
        String className = "Class" + month + year + shift;
        commonView.showMessage(className);
        return className;
    }

    public int AddNumberSlot(CommonView commonView, Scanner scanner) {
        String numberSlot = commonView.inputString("Enter the number Slot you want to set :", scanner);
        while (true) {
            if (!checkNumber(numberSlot)) {
                numberSlot = commonView.inputString("Wrong number ,try again please : ", scanner);
            } else {
                break;
            }
        }
        return Integer.parseInt(numberSlot);
    }

    public EnglishClass addEnglishClass(CommonView commonView, Scanner scanner, Shift shift, String className, int numberSlot) {
        EnglishClass englishClass = new EnglishClass(className, numberSlot, shift);
        classServiceIMPL.save(englishClass);
        return englishClass;
    }

    public boolean checkNumber(String number) {
        return Pattern.matches("^[0-9]+", number);
    }

    public void saveNewClass(CommonView commonView, Scanner scanner, String className, int numberSlot, Shift shift) {
        EnglishClass englishClass = new EnglishClass(className, numberSlot, shift);
        classServiceIMPL.save(englishClass);
        commonView.displayObject(englishClass);
        commonView.showMessage("Add English Class Complete !");

    }

    public int findEnglishClass(CommonView commonView, Scanner scanner) {
        return 0;
    }

    private boolean checkInputNumber(int min, int max, String number) {
        String maxNumber = String.valueOf(max);
        String minNumber = String.valueOf(min);

        return Pattern.matches("[" + minNumber + "-" + maxNumber + "]", number);
    }
//    public  EnglishClass editTeacher(CommonView commonView , Scanner scanner){
//
//        commonView.showMessage("");
//    }

    public int findClass(CommonView commonView, Scanner scanner) {
        commonView.showMessage("You just can be edit Class Start and Prepare Status");
        commonView.showMessage("You can't be edit Class with End Status");
        ArrayList<EnglishClass> englishClassList = (ArrayList<EnglishClass>)
                classServiceIMPL.findEnglishClassStartAndPrepare();
        for (EnglishClass element : englishClassList) {
            commonView.displayObject(element);
        }

        String classId = commonView.inputString("Please enter the Class Id you want to edit : ", scanner);
        while (true) {
            if (!classServiceIMPL.existedClass(classId, englishClassList)) {
                classId = commonView.inputString("The Class id has failed , try again please :", scanner);
            } else {
                break;
            }
        }
        return classServiceIMPL.findClassByIndex(classId);
    }

    public void chooseFunctionEdit(CommonView commonView, Scanner scanner, int indexClass) {
        commonView.showMessage("1.Edit Name ");
        commonView.showMessage("2.Edit Teacher ");
        commonView.showMessage("3.Edit Course");
        commonView.showMessage("4.Edit Room");
        commonView.showMessage("5.Edit Shift");
        commonView.showMessage("6.Edit Number Slot");
        commonView.showMessage("7.Edit Status");
        commonView.showMessage("8.Back");
        String selection = commonView.inputString(scanner);
        while (true) {
            if (!checkInputNumber(1, 8, selection)) {
                selection = commonView.inputString("Wrong number , try again please :", scanner);
            } else {
                break;
            }
        }
        switch (Integer.parseInt(selection)) {
            case 1:
                editName(commonView, scanner, indexClass);
            case 2:
                editTeacher(commonView, scanner, indexClass);
            case 3:
                editCourse(commonView, scanner, indexClass);
            case 4:
                editRoom(commonView, scanner, indexClass);
            case 5:
                editShift(commonView, scanner, indexClass);
            case 6:
                editNumberSlot(commonView, scanner, indexClass);
            case 7:
                editStatus(commonView, scanner, indexClass);
            case 8:
                return;
        }
        chooseFunction(commonView, scanner);
    }

    public EnglishClass editName(CommonView commonView, Scanner scanner, int indexClass) {
        EnglishClass englishClass = classServiceIMPL.findAll().get(indexClass);
        commonView.displayObject(englishClass);
        String className = englishClass.getClassName();
        Shift shift = englishClass.getShift();
        Shift shiftToDo = shift == Shift.SHIFT1 ? Shift.SHIFT2 : Shift.SHIFT1;
        String newClassName = className.substring(0, 9) + shiftToDo;
        if (isEditClassName(newClassName)) {

            commonView.showMessage("Your class can only change to " + shiftToDo);
            commonView.showMessage("1.Yes");
            commonView.showMessage("2.No");
            String selection = commonView.inputString(scanner);
            while (true) {
                if (!checkInputNumber(1, 2, selection)) {
                    selection = commonView.inputString("Wrong number , try again please: ", scanner);
                } else {
                    break;
                }
            }
            switch (Integer.parseInt(selection)) {
                case 1:
                    classServiceIMPL.editClassName(indexClass, newClassName);
                    break;
                case 2:
                    return classServiceIMPL.findClassByIndex(indexClass);
            }
        } else {
            commonView.showMessage("Your Class Name can not be change ! ");
            return classServiceIMPL.findClassByIndex(indexClass);
        }
        return classServiceIMPL.findClassByIndex(indexClass);

    }

    public boolean isEditClassName(String newClassName) {
        return !classServiceIMPL.existedClassByName(newClassName);

    }

    public EnglishClass editTeacher(CommonView commonView, Scanner scanner, int indexClass) {
        commonView.showMessage("You can only change teachers if the teacher still has a shift so" +
                " that they can teach at the same time as the class");
        ArrayList<Teacher> teacherList = (ArrayList<Teacher>) userServiceIMPL.findUserTeacherAvailable();
        Shift classShift = classServiceIMPL.getClassShift(indexClass);
        teacherList = (ArrayList<Teacher>) teacherList.stream()
                .filter(teacher -> !teacher.checkShiftCanAdd(classShift))
                .collect(Collectors.toList());
        for (Teacher element : teacherList) {
            commonView.displayObject(element);
        }
        String teacherId = commonView.inputString("Enter Teacher Id you want to change :", scanner);
        int teacherIndex = userServiceIMPL.findTeacherById(teacherId, teacherList);
        while (true) {
            if (teacherIndex == (-1)) {
                teacherId = commonView.inputString("Teacher Id failed ,try again please : ", scanner);
            } else {
                break;
            }
        }
        classServiceIMPL.editTeacher(indexClass, teacherList.get(teacherIndex));
        commonView.showMessage("Change Teacher success!");
        return classServiceIMPL.findClassByIndex(indexClass);
    }

    public EnglishClass editCourse(CommonView commonView, Scanner scanner, int indexClass) {
        ArrayList<Course> courseList = (ArrayList<Course>) courseServiceIMPL.findAll();
        for (Course element:courseList) {
            commonView.displayObject(element);
        }
        String courseID= commonView.inputString("Enter Course Id you want to change: ",scanner);

    }

    public EnglishClass editRoom(CommonView commonView, Scanner scanner, int indexClass) {

    }

    public EnglishClass editShift(CommonView commonView, Scanner scanner, int indexClass) {

    }

    public EnglishClass editNumberSlot(CommonView commonView, Scanner scanner, int indexClass) {

    }

    public EnglishClass editStatus(CommonView commonView, Scanner scanner, int indexClass) {

    }


}
