package furama_resort.util.regex;

import furama_resort.models.person.Customer;
import furama_resort.models.person.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class Regex {

    public static final String REGEX_NAME = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
    public static final String REGEX_ID_CARD = "^[0-9]{9}$";
    public static final String REGEX_PHONE_NUMBER = "^(84)|0[0-9]{9}$";
    public static final String REGEX_EMAIL = "^[a-z0-9]+@[a-z]+\\.[a-z]{2,4}$";

    public static Scanner sc = new Scanner(System.in);
    //Kiểm tra nhập vào có phải số hay không
    public static int inputIntNumber(){
        int num;
        while (true){
            try {
                num = Integer.parseInt(sc.nextLine());
                return num;
            }catch (NumberFormatException e){
                System.err.println("Nhập lại");
            }
        }
    }

    public static int inputIDEmployee(List<Employee> listEmployee){
        int id;
        int count;
        while (true){
            count = 0;
            id = inputIntNumber();
            for (Employee employee : listEmployee) {
                if (id == employee.getId()){
                    System.out.println("Trùng ID, mời nhập lại:");
                    count++;
                    break;
                }
            }
            if (count == 0){
                return id;
            }
        }
    }

    public static int inputIDCustomer(List<Customer> customerList){
        int id;
        int count;
        while (true){
            count = 0;
            id = inputIntNumber();
            for (Customer customer : customerList) {
                if (id == customer.getId()){
                    System.out.println("Trùng ID, mời nhập lại:");
                    count++;
                    break;
                }
            }
            if (count == 0){
                return id;
            }
        }
    }

    public static String inputName(){
        return RegexData.regexStr(sc.nextLine(),REGEX_NAME,"Bạn đã nhập sai định dạng");
    }

    public static String inputIdCard(){
        return RegexData.regexStr(sc.nextLine(),REGEX_ID_CARD,"Bạn đã nhập sai định dạng");
    }

    public static String inputPhoneNumber(){
        return RegexData.regexStr(sc.nextLine(),REGEX_PHONE_NUMBER,"Bạn đã nhập sai định dạng");
    }

    public static String inputEmail(){
        return RegexData.regexStr(sc.nextLine(),REGEX_EMAIL,"Bạn đã nhập sai định dạng");
    }

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year < 18 || year > 100){
            throw new Exception();
        }
    }

    public static String getDateOfBirth(){
        String dateOfBirth;
        while (true){
            try {
                dateOfBirth = sc.nextLine();
                dateTimeCheck(dateOfBirth);
                break;
            } catch (Exception e) {
                System.err.println("Ngày sinh phải có dạng dd/MM/yyyy");
            }
        }
        return dateOfBirth;
    }


}
