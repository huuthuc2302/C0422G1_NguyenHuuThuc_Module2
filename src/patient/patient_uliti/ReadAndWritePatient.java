package account.account_uliti;

import account.account_model.Account;
import account.account_model.Pay;
import account.account_model.Save;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteAccount {
    public static <E> void writeAccountList(List<E> eList, String pathFile, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : eList) {
                if (e instanceof Save) {
                    bufferedWriter.write(((Save) e).getDataAccount());
                    bufferedWriter.newLine();
                }
                if (e instanceof Pay) {
                    bufferedWriter.write(((Pay) e).getDataAccount());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Account> readAccountList(String pathFile) {
        List<Account> accountList = new LinkedList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        String[] array = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) continue;
                array = line.split(",");
                if (array.length == 8) {
                    accountList.add(new Save(array[0], array[1], array[2],array[3], array[4], array[5], array[6], array[7]));
                }
                if (array.length == 6){
                        accountList.add(new Pay(array[0], array[1], array[2], array[3], array[4], array[5]));
                    }
                }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accountList;
    }
}
