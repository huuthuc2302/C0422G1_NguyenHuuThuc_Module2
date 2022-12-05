package mobile.uliti;

import mobile.model.Mobile;

import java.util.List;

public class IncreaseID {

    private static final String PATH_FILE_PHONE = "src/mobile/data/Mobile.csv";

    public static int increaseID() {

        List<Mobile> mobileList = ReadAndWriteMobile.readFileList(PATH_FILE_PHONE);
        int id;
        if (mobileList.isEmpty()) id = 1;
        else {
            boolean flag;
            do {
                flag = false;
                id = Integer.parseInt(mobileList.get(mobileList.size() - 1).getId()) + 1;
                for (Mobile c : mobileList) {
                    if (Integer.parseInt(c.getId()) == id) {
                        id++;
                        flag = true;
                    }
                }
            } while (flag);
        }
        return id;
    }
}
