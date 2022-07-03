package Exercise1;

import java.util.ArrayList;
<<<<<<< HEAD

public class CadresManager {
    public ArrayList<Cadres> cadres=new ArrayList<>();

    public void addCadres(){
        cadres.add(new Cadres());
    }
    public void addEngineer(){
        cadres.add(new Engineer());
    }
    public void addWorker(){
        cadres.add( new Worker());
    }
    public void  addOfficer(){
        cadres.add(new Officer());
    }

    public void addCadres(String name,int age,String gender,String address){
        cadres.add(new Cadres(name,age,gender,address));
    }
    public void addEngineer(String name,int age,String gender,String address,String fieldTraining){
        cadres.add(new Engineer(name,age,gender,address,fieldTraining));
    }
    public void addWorker(String name,int age,String gender,String address,int level){
        cadres.add( new Worker(name, age, gender, address, level));
    }
    public void  addOfficer(String name,int age,String gender,String address,String task){
        cadres.add(new Officer(name,age,gender,address,task));
    }
    public Cadres getCadresByName(String name){
        for (Cadres element:cadres) {
            if(element.getName().equals(name)){
                return element;
            }
        }
        return null;
    }
    public  void  displayCadres(){
        for (Cadres element:cadres) {
            System.out.println(element+"\n");
        }
    }

=======
import java.util.List;
import java.util.stream.Collectors;

public class CadresManager {
    public ArrayList<Cadres> cadres;

    public  CadresManager(){
        this.cadres=new ArrayList<>();
    }
    public List<Cadres> searchCadresByName(String name){
        return  this.cadres.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
    }
    public  void showListInfoOfCadres(){
        this.cadres.forEach(o->System.out.println((o.toString())));
    }

    public void addCadres(String khoa, int i, String male, String ádufga) {
    }

    public void addEngineer(String thi, int i, String male, String sduiasg, String math) {
    }

    public boolean getCadresByName(String thi) {
    }

    public void displayCadres() {
    }
>>>>>>> 6ba14ee (Exercise)
}
