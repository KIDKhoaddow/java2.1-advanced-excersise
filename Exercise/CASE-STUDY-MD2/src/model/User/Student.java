package model.User;

public class Student extends User {
    private final Role.RoleName roleStudent = Role.RoleName.STUDENT;
    private String roomName;
    private String teacherName;
    private String courseName;

    public Student() {
        super();
    }

    public Student(int userID, String userName, String userPhoneNumber, String userEmail, String userPassword) {
        super(userID, userName, userPhoneNumber, userEmail, userPassword);
    }

    @Override
    public String toString() {
        return "Student{" +
                "userRole=" + roleStudent +
                ", userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

    public String toStringReciptUser() {
        return roleStudent + "{" +
                roleStudent + "ID = " + userID + "," +
                roleStudent + "Name = " + userName + '\'' + "}\n";
    }

    public String toStringCourse() {
        return roleStudent + "{" +
                roleStudent + "ID =" + userID + "\'" + "," +
                roleStudent + "Name =" + userName + "\'" + ',' +
                roleStudent + "Email =" + userEmail + "\'" + "," +
                roleStudent + "Phone =" + userPhoneNumber + "\'" + "}\n";
    }
}
