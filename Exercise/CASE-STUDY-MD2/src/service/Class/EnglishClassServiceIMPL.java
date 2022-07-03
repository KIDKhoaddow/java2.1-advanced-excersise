package service.Class;

import config.ConfigReadAndWriteFile;
import model.Class.EnglishClass;
import model.Class.EnglishClassStatus;
import model.Class.Shift;
import model.Course.Course;
import model.Room.Room;
import model.User.Teacher;
import service.user.UserServiceIMPL;
import view.AdminView.User.Edit.EditUser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EnglishClassServiceIMPL implements IEnglishClassService {
    public static String PATH_CLASS = ConfigReadAndWriteFile.PATH + "englishClass.txt";
    public static List<EnglishClass> englishClassList = new ConfigReadAndWriteFile<EnglishClass>().readFromFile(PATH_CLASS);

    @Override
    public void save(EnglishClass englishClass) {
        englishClassList.add(englishClass);
    }

    @Override
    public void edit(int index, EnglishClass englishClass) {
        englishClassList.set(index,englishClass);
        saveClassList();
    }

    @Override
    public boolean delete(String id, EnglishClass englishClass) {
        return englishClassList.remove(findById(id));
    }

    @Override
    public boolean existedClassById(String classId) {
        for (EnglishClass element:englishClassList) {
            if(element.getClassId().equals(classId)){
                return true ;
            }
        }
        return false;
    }

    @Override
    public boolean existedClassByName(String className) {
        for (EnglishClass element:englishClassList) {
            if(element.getClassName().equals(className)){
                return true ;
            }
        }
        return false;
    }

    public boolean existedClass(String classId, ArrayList<EnglishClass> englishClassList) {
        for (EnglishClass element:englishClassList) {
            if(element.getClassId().equals(classId)){
                return true ;
            }
        }
        return false;
    }
    @Override
    public List<EnglishClass> findAll() {
        return englishClassList;
    }
    @Override
    public EnglishClass findById(String id) {
        for (EnglishClass element:englishClassList) {
            if(element.getClassId().equals(id)){
                return element;
            }
        }
        return null ;
    }

    public List<EnglishClass> findEnglishClassStartAndPrepare() {
        return  englishClassList.stream().filter(englishClass -> englishClass.getStatus()==EnglishClassStatus.END)
                .collect(Collectors.toList());
    }
    public  int findClassByIndex(String index){
        for (int i = 0; i <englishClassList.size() ; i++) {
           if( englishClassList.get(i).getClassId().equals(index)){
               return i;
           }
        }
        return -1;
    }
    public EnglishClass findClassByIndex(int index) {

        return englishClassList.get(index);
    }



    @Override
    public void displayById(String id) {
        System.out.println(findById(id));
    }

    @Override
    public void displayALl() {
        for (EnglishClass element : englishClassList) {
            System.out.println(element);
        }
    }

    @Override
    public void identifiedTeacher(String id, String teacherName) {

    }


    @Override
    public String getClassName(int index) {
        return englishClassList.get(index).getClassName();
    }

    @Override
    public String getTeacherName(int index) {
        return englishClassList.get(index).getTeacherName();
    }

    @Override
    public String getCourseName(int index) {
        return englishClassList.get(index).getCourseName();
    }

    @Override
    public String getRoomName(int index) {
        return englishClassList.get(index).getRoomName();
    }

    @Override
    public Shift getClassShift(int index) {
        return englishClassList.get(index).getShift();
    }

    @Override
    public ArrayList<EnglishClass> getEnglishClassAvailable(Course course) {
        return (ArrayList<EnglishClass>) englishClassList.stream()
                .filter(x->((x.getNumberStudent()>=x.getNumberSlot())
                        &&(x.getStatus()!= EnglishClassStatus.PREPARE)
                        &&(x.getCourseName().equals(course.getCourseName()))))
                .collect(Collectors.toList());
    }

    @Override
    public int getNumberSlot(int index) {
        return englishClassList.get(index).getNumberSlot();
    }

    @Override
    public EnglishClass editTeacher(int index, Teacher teacher) {
         englishClassList.get(index).setTeacher(teacher);
        return  englishClassList.get(index);
    }

    @Override
    public EnglishClass editRoom(int index, Room room) {
        englishClassList.get(index).setRoom(room);
        return englishClassList.get(index);
    }

    @Override
    public EnglishClass editCourse(int index, Course course) {
        englishClassList.get(index).setCourse(course);
        return englishClassList.get(index);
    }

    @Override
    public EnglishClass editClassName(int index, String className) {
        englishClassList.get(index).setClassName(className);
        saveClassList();
        return englishClassList.get(index);
    }

    @Override
    public EnglishClass editTeacherName(int index, Teacher teacher) {
        englishClassList.get(index).setTeacher(teacher);
        saveClassList();
        return englishClassList.get(index);
    }

    @Override
    public EnglishClass editCourseName(int index, Course course) {
        if(englishClassList.get(index).setCourse(course)){
            saveClassList();
            return englishClassList.get(index);
        }
        return null;
    }

    @Override
    public EnglishClass editRoomName(int index, Room room) {
        englishClassList.get(index).setRoom(room);
        saveClassList();
        return englishClassList.get(index);
    }

    @Override
    public void saveClassList() {
        new ConfigReadAndWriteFile<EnglishClass>().writeToFile(PATH_CLASS, englishClassList);
    }

    @Override
    public boolean containsStudentFromClass(int indexClass, int indexStudent) {
        String nameClass = UserServiceIMPL.studentList.get(indexStudent).getClassName();
        boolean check = getClassName(indexClass).equals(nameClass);
        return check;
    }
}

