package Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Nhập đường dẫn file: ");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//
//        ReadAndWriteFileExample readfileEx = new ReadAndWriteFileExample();
//        readfileEx.readFileText(path);
//
//
//        ReadAndWriteFileExample readAndWriteFile = new ReadAndWriteFileExample();
//        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
//        int maxValue = findMax(numbers);
//        readAndWriteFile.writeFile("result.txt", maxValue);

        String filePath="test.text";
        String fileCopy="copy.text";
        ReadAndWriteFileEx readAndWriteFileEx=new ReadAndWriteFileEx();
        readAndWriteFileEx.writeToFile(readAndWriteFileEx.readFromFile(filePath),fileCopy);




        String fileCSV="coutries.csv";
        File file =new File(fileCSV);



        BufferedReader br = null;
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            String line;
            br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static List<Country> parseCsvLine(String csvLine) {
        List<Country> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(new Country(Integer.parseInt(splitData[0]),splitData[1],splitData[2]));
            }
        }
        return result;
    }

    private static void printCountry(List<Country> country) {
        for (Country element:country) {
            System.out.println(element);
        }

    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
