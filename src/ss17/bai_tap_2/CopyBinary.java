package ss17.bai_tap_2;

import java.io.*;

public class CopyBinary {
    public static void copyFileBinary(String source, String target){
        try {
            FileInputStream fis = new FileInputStream(source);
            ObjectInputStream ois = new ObjectInputStream(fis);
            FileOutputStream fos = new FileOutputStream(target);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ois.readObject());
            ois.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void targetFileLength(String target){
        System.out.println(target.length());
    }
}
