package Exercise1;

import java.util.ArrayList;

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

}
