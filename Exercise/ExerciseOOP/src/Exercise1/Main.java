package Exercise1;

public class Main {
    public static void main(String[] args) {
        CadresManager cadresManager=new CadresManager();
        cadresManager.addCadres("khoa",15,"male","ádufga");
        cadresManager.addEngineer("thi",156,"male","sduiasg","math");
        System.out.println(cadresManager.getCadresByName("thi"));
        cadresManager.displayCadres();
    }
}
