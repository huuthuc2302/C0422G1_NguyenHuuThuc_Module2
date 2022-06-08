package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        //khai báo 3 biến để lưu thông tin về :
        double money ;          //tiền gửi
        int month ;              //tháng gửi
        double interestRate ; //tỉ lệ lãi suất
        Scanner input = new Scanner(System.in); //tạo input để nhập liệu cho 3 biến khai báo

        //Nhập giá trị cho các biến
        System.out.println(" Nhập số tiền gửi ");
        money = input.nextDouble();
        System.out.println(" Nhập số tháng gửi ");
        month = input.nextInt();
        System.out.println(" Nhập lãi suất");
        interestRate = input.nextDouble();

        //Tính lãi suất nhận được
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("Tổng tiền lãi : " + totalInterest);
        }

    }
}
