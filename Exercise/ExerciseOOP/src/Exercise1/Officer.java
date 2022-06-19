package Exercise1;

public class Officer extends Cadres{
    private  String task;

    public Officer() {
    }

    public Officer(String task) {
        this.task = task;
    }

    public Officer(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Officer{" +"\n"+
                "Name = "   +super.getName()    +"\n"+
                "Age = "    +super.getAge()     +"\n"+
                "Gender = " +super.getGender()  +"\n"+
                "Address = "+super.getAddress() +"\n"+
                "Level=" + task +'}';
    }
}
