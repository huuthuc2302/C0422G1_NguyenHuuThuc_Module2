package ss12_java_collection_framework.thuc_hanh_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "Hà Nội");
        Student student2 = new Student("Hùng",21, "Đà Nẵng");
        Student student3 = new Student("Hà",22, "Hồ Chí Minh");
        Student student4 = new Student("Thìn", 24, "Gia Lai");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student4);

        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        students.add(student4);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
