package personnnel.personnnel_uliti;

import patient.patient_model.Often;
import patient.patient_model.Patient;
import patient.patient_model.Vip;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWritePatient {
    public static <E> void writePatienttList(List<E> eList, String pathFile, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : eList) {
                if (e instanceof Often) {
                    bufferedWriter.write(((Often) e).getDataPatient());
                    bufferedWriter.newLine();
                }
                if (e instanceof Vip) {
                    bufferedWriter.write(((Vip) e).getDataPatient());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Patient> readPatientList(String pathFile) {
        List<Patient> patientList = new LinkedList<>();
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
                    patientList.add(new Often(array[0], array[1], array[2],array[3], array[4], array[5], array[6]));
                }
                if (array.length == 8){
                        patientList.add(new Vip(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]));
                    }
                }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return patientList;
    }
}
