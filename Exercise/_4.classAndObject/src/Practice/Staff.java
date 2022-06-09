package Practice;

public class Staff {
    private int idStaff;//thuộc tính id của Staff  , dạng số nguyên , khả năng truy cập dữ liệu là privated
    private  String nameStaff;//thuộc tính name của Staff , dạng  chuỗi ,...
    private  int ageStaff;
    private  String genderStaff;
    private  double salaryStaff;//Thuộc tính lương của Staff , dạng sô thực , khả năng truy cập dữ liệu là private

    //
    public Staff(int idStaff, String nameStaff, int ageStaff, String genderStaff, double salaryStaff) {

        this.idStaff = idStaff;
        this.nameStaff = nameStaff;
        this.ageStaff = ageStaff;
        this.genderStaff = genderStaff;
        this.salaryStaff = salaryStaff;
    }

    public Staff() {
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public int getAgeStaff() {
        return ageStaff;
    }

    public void setAgeStaff(int ageStaff) {
        this.ageStaff = ageStaff;
    }

    public String getGenderStaff() {
        return genderStaff;
    }

    public void setGenderStaff(String genderStaff) {
        this.genderStaff = genderStaff;
    }

    public double getSalaryStaff() {
        return salaryStaff;
    }

    public void setSalaryStaff(double salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "idStaff=" + idStaff +
                ", nameStaff='" + nameStaff + '\'' +
                ", ageStaff=" + ageStaff +
                ", genderStaff='" + genderStaff + '\'' +
                ", salaryStaff=" + salaryStaff +
                '}';
    }
}
