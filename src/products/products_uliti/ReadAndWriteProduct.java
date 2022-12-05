package mobile.uliti;

import mobile.model.AuthenticPhone;
import mobile.model.HandCarriedPhone;
import mobile.model.Mobile;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteMobile {
    public static <E> void writeList(List<E> eList, String pathFile, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : eList) {
                if (e instanceof HandCarriedPhone) {
                    bufferedWriter.write(((HandCarriedPhone) e).toGetData());
                    bufferedWriter.newLine();
                }
                if (e instanceof AuthenticPhone) {
                    bufferedWriter.write(((AuthenticPhone) e).toGetData());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Mobile> readFileList(String pathFile) {
        List<Mobile> mobileList = new LinkedList<>();
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
                if (array.length == 7) {
                    if ((array[6].contains("Quốc tê")) || (array[6].contains("Toàn quốc"))) {
                        mobileList.add(new AuthenticPhone(array[0], array[1], array[2], Integer.parseInt(array[3]), array[4], array[5], (array[6])));
                    } else {
                        mobileList.add(new HandCarriedPhone(array[0], array[1], array[2], Integer.parseInt(array[3]), array[4], array[5], array[6]));
                    }
                }
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mobileList;
    }
}
