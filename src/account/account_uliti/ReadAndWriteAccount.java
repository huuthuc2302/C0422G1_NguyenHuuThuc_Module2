package products.products_uliti;

import mobile.model.AuthenticPhone;
import mobile.model.HandCarriedPhone;
import mobile.model.Mobile;
import products.products_model.Export;
import products.products_model.Import;
import products.products_model.Products;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteProduct {
    public static <E> void writeProductsList(List<E> eList, String pathFile, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : eList) {
                if (e instanceof Export) {
                    bufferedWriter.write(((Export) e).getDataProducts());
                    bufferedWriter.newLine();
                }
                if (e instanceof Import) {
                    bufferedWriter.write(((Import) e).getDataProducts());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Products> readProductsList(String pathFile) {
        List<Products> productsList = new LinkedList<>();
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
                    productsList.add(new Export(array[0], array[1], array[2],array[3], array[4], array[5], array[6]));
                }
                if (array.length == 8){
                        productsList.add(new Import(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]));
                    }
                }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productsList;
    }
}
