package Exercise1;

public class Worker extends Cadres{
    private int level=1;

    public Worker() {
    }

    public Worker(int level) {
        this.level = level;
    }

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Engineer{" +"\n"+
                "Name = "   +super.getName()    +"\n"+
                "Age = "    +super.getAge()     +"\n"+
                "Gender = " +super.getGender()  +"\n"+
                "Address = "+super.getAddress() +"\n"+
                "Level=" + this.level +'}';
    }
}
