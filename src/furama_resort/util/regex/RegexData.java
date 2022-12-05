package furama_resort.util.regex;

import java.util.Scanner;

public class RegexData {
    public static Scanner sc = new Scanner(System.in);

    // hàm check tổng quát
    public static String regexStr(String temp, String regex, String error){
        boolean check = true;
        do{
            if (temp.matches(regex)){
                check = false;
            }else {
                System.out.println(error);
                temp = sc.nextLine();
            }
        }while (check);
        return temp;
    }
}
