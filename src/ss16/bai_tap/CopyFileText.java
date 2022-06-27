package ss16.bai_tap;

import ss12_java_collection_framework.thuc_hanh_2.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> readFile(String pathFile) {
        List<String> list = new ArrayList<>();


        File file = new File(pathFile);
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line ;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                list.add(line);
            }
            bufferedReader.close();
        }catch (IOException e ){
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(List<String> list, String pathFile,boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try{
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size()  ; i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//null
        list = readFile("src/ss16/bai_tap/source.txt");
        writeFile(list,"src/ss16/bai_tap/target.txt",true);
    }
}
