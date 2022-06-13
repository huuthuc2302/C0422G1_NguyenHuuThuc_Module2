package ss5_static_access_modifier.thuc_hanh;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //gọi phương thức thay đổi

        //tạo đối tượng
        Student s1 = new Student(111, "Hoàng");
        Student s2 = new Student(222, "Khánh");
        Student s3 = new Student(333, "Nam");

        //gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
