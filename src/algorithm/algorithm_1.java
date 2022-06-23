package algorithm;

import java.util.Scanner;
//Chương trình sửa lại xâu kí tự:
//
//        Cho một xâu kí tự s gồm nhiều từ. Trong đó mỗi từ sẽ được bắt đầu bởi một kí tự in hoa.
//        Vì một lí do gì đó, người ta quên chèn các khoảng trắng giữa các từ.
//        Hãy viết chương trình sửa lại xâu kí tự đó theo yêu cầu sau:
//        Tách các từ, và thêm 1 kí tự cách (space) giữa 2 từ liên tiếp
//        Chuyển đổi các kí tự in hoa thành kí tự in thường
//        Ví dụ:
//        Với s = "CodegymDaNang", thì kết quả amendTheSentence(s) = "codegym da nang"
//        Với s = "Hello", thì kết quả amendTheSentence(s) = "hello"

public class algorithm_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = scanner.nextLine();
        System.out.println("Chuỗi sau khi sửa là: " + solution(str));
    }
    public static String solution(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                result += " " + (char)(str.charAt(i) + 32);
            } else {
                result += str.charAt(i);
            }
        }
        return result.trim();
    }
}
