package Exercise1;

public class Engineer extends Cadres{
    private String fieldTraining;

    public Engineer() {
    }

    public Engineer(String name, int age, String gender, String address, String fieldTraining) {
        super(name, age, gender, address);
        this.fieldTraining = fieldTraining;
    }

    public String getFieldTraining() {
        return fieldTraining;
    }

    public void setFieldTraining(String fieldTraining) {
        this.fieldTraining = fieldTraining;
    }

    @Override
    public String toString() {
        return "Engineer{" +"\n"+
                "Name = "   +super.getName()    +"\n"+
                "Age = "    +super.getAge()     +"\n"+
                "Gender = " +super.getGender()  +"\n"+
                "Address = "+super.getAddress() +"\n"+
                "FieldTraining=" + this.fieldTraining +'}';
    }
}
