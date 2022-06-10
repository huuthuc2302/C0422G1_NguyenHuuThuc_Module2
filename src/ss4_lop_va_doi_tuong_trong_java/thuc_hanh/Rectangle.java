package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;
            // Lớp hình chữ nhật
import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {

    }
    //Tạo lớp Rectangle, khai báo các thuộc tính (properties),
    // định nghĩa các phương thức khởi tạo (contructors).
    public Rectangle(double  width, double height){
        this.width = width;
        this.height = height;
    }
    //Định nghĩa các phương thức getArea(), getPerimeter(), display()
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height * this.width) * 2;
    }
    public String display(){
        return "chiều rộng = " + width + " , chiều cao = " + height ;

    }

    public static void main(String[] args) {
        //Khai báo các biến lưu kích thước hình chữ nhật và gán giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài");
        double height = scanner.nextDouble();

        //Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);

        //Gọi các phương thức của lớp Rectangle thông qua đối tượng rectangle
        // đã tạo để hiển thị các thông số của hình chữ nhật
        System.out.println("Hình chữ nhật của bạn có : " + rectangle.display());
        System.out.println("Chu vi hình chữ nhật " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật " + rectangle.getArea());
    }

}
