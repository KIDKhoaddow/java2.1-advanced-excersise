package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManager {
    private ArrayList<Staff> staffs=new ArrayList<Staff>();
    Scanner scanner= new Scanner(System.in);
    public boolean status=true;
    public void workMenu(){

        while (status)
        {
            chooseManipulatingArray(scanner);
        }
    }

    public  void    chooseManipulatingArray(Scanner scanner){
        System.out.println("---------------------Menu---------------------");
        System.out.println("1.Thêm phần tử vào mảng");
        System.out.println("2.Sửa phần tử trong mảng");
        System.out.println("3.Xóa phần tử trong mảng");
        System.out.println("4.Hiển thị các phần tử trong mảng");
        System.out.println("5.Thoát");
        System.out.print("Lựa chọn của bạn là:");
        int choice =scanner.nextInt();
        switch (choice){
            case 1: {addStaff(scanner);break;}
            case 2: {updateStaff(scanner) ; break;}
            case 3: {removeStaffById(scanner); break;}
            case 4: {showStaff(); break;}
            case 5: {status=false;exit(); break;}
        }
    }


    private void addStaff(Scanner scanner){
        System.out.print("Xin hãy nhập id :");
        int id=scanner.nextInt();
        System.out.print("xin hãy nhập tên:");
        String name=scanner.next();
        System.out.print("Xin hãy nhập tuổi :");
        int age=scanner.nextInt();
        System.out.print("Xin hãy nhập giới tính :");
        String gender=scanner.next();
        System.out.print("Xin hãy nhập lương:");
        double salary=scanner.nextDouble();
        Staff staff=new Staff(id,name,age,gender,salary);
        staffs.add(staff);

    }
    private void updateStaff(Scanner scanner){
        System.out.println("---------------------");
        System.out.println("1.Update Name");
        System.out.println("2.Update Age");
        System.out.println("3.Update Gender");
        System.out.println("4.Update Salary");
        System.out.println("5.Update All");
        System.out.println("6.Previous");
        System.out.print("Lựa chọn của bạn là :");
        int choice =scanner.nextInt();
        switch (choice){
            case 1:{updateName(scanner);updateStaff(scanner);break;}
            case 2:{updateAge(scanner);updateStaff(scanner);break;}
            case 3:{updateGender(scanner);updateStaff(scanner);break;}
            case 4:{updateSalary(scanner);updateStaff(scanner);break;}
            case 5:{updateAll(scanner);updateStaff(scanner);break;}
            case 6:{workMenu();break; }
        }
    }

    private  int getIdForUpdate(Scanner scanner){
        System.out.println("---------------------");
        System.out.print("Nhập id mà bạn muốn làm việc với thành phần : ");
        int idForUpdate=scanner.nextInt();
        return idForUpdate;
    }

    private  void  updateAll(Scanner scanner){
        updateName(scanner);
        updateAge(scanner);
        updateGender(scanner);
        updateSalary(scanner);
    }
    private  void updateName(Scanner scanner){
        int id=getIdForUpdate(scanner);
        for (Staff staff : staffs) {
            if (staff.getIdStaff() == id) {
                System.out.println(staff.getNameStaff());
                System.out.println("Bạn muốn sửa tên này thành :");
                scanner.nextLine();
                String nameUpdate = scanner.nextLine();
                staff.setNameStaff(nameUpdate);
                break;
            }
        }
    }


    private  void updateAge(Scanner scanner){
        int id =getIdForUpdate(scanner);
        for (Staff staff : staffs) {
            if (staff.getIdStaff() == id) {
                System.out.println(staff.getAgeStaff());
                System.out.println("Bạn muốn sửa tuổi này thành :");
                scanner.nextLine();
                int ageUpdate = scanner.nextInt();
                staff.setAgeStaff(ageUpdate);
                break;
            }
        }
    }
    private  void updateGender(Scanner scanner){
        int id =getIdForUpdate(scanner);
        for (Staff staff : staffs) {
            if (staff.getIdStaff() == id) {
                System.out.println(staff.getGenderStaff());
                System.out.println("Bạn muốn sửa giới tính này thành :");
                scanner.nextLine();
                String genderUpdate = scanner.nextLine();
                staff.setGenderStaff(genderUpdate);
                break;
            }
        }
    }
    private  void updateSalary(Scanner scanner){
        int id =getIdForUpdate(scanner);
        for (Staff staff : staffs) {
            if (staff.getIdStaff() == id) {
                System.out.println(staff.getSalaryStaff());
                System.out.println("Bạn muốn sửa lương này thành :");
                scanner.nextLine();
                int salaryUpdate = scanner.nextInt();
                staff.setSalaryStaff(salaryUpdate);
                break;
            }
        }
    }

    private  int checkId(int id){
        for (Staff staff:staffs) {
            if(staff.getIdStaff()==id){
                return staffs.indexOf(staff);
            }
        }
        return -1;
    }


    private void removeStaffById(Scanner scanner){
        int id=getIdForUpdate(scanner);
        staffs.remove(checkId(id));

     }


    private   void   showStaff(){
        for (Staff staff:staffs) {
            if(staff!=null){
            System.out.println(staff.toString());
            }
        }
    }


    private  void exit(){
        System.out.println("---------------------------------");
        System.out.println("Đã thoát chương trình");
    }


}
