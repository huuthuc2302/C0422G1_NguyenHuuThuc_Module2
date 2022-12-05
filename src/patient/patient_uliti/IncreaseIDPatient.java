package account.account_uliti;

import account.account_model.Account;

import java.util.List;

public class IncreaseIDAccount {

    private static final String PATH_FILE_ACCOUNT = "src/account/account_data/Account.csv";

    public static int increaseID() {

        List<Account> accountList = ReadAndWriteAccount.readAccountList(PATH_FILE_ACCOUNT);
        int id;
        if (accountList.isEmpty()) id = 1;
        else {
            boolean flag;
            do {
                flag = false;
                id = Integer.parseInt(accountList.get(accountList.size() - 1).getId()) + 1;
                for (Account c : accountList) {
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
