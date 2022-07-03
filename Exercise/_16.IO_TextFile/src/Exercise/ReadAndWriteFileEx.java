package Exercise;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFileEx {
    public ArrayList<String> readFromFile(String filePath) throws IOException {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (Exception e){
            System.out.println("Lỗi không đọc được file");;
        }
        BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
        ArrayList<String> arrayList=new ArrayList<>();
        String line="";
        while((line=bufferedReader.readLine())!=null){
            arrayList.add(line);
            line="";
        }
        bufferedReader.close();
        return arrayList;
    }
    public  void writeToFile(ArrayList<String> arrayList,String filePath) throws IOException {
        File file=new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (Exception e){
            System.out.println("Lỗi không đọc được file");;
        }
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
        for (String element :arrayList) {
            bufferedWriter.write(element+"\n");
        }
        bufferedWriter.close();

    }

}
