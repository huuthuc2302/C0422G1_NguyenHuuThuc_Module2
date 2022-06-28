package ss17.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
//            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hà Duyên", "Đà Nẵng"));
        students.add(new Student(2, "Đức Trọng", "Quảng Nam"));
        students.add(new Student(3, "Minh Đức", "Đà Nẵng"));
        students.add(new Student(4, "Như Vinh", "Quảng Nam"));

        writeToFile("src/ss17/thuc_hanh/student.csv", students);
        List<Student> studentDataFromFile = readDataFromFile("src/ss17/thuc_hanh/student.csv");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
