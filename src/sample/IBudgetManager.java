package sample;

public interface IBudgetManager {

     User findUserWithId(String id);

    User findUserWithName(String name);
    User createAdmin(String name, String password);
    User createUser(String name,String password);
     Rule getUserRules(String userId);
     void setUserRules(String userId, Rule []rules);
    TransactionResult withdrawFunds(String str);
    TransactionResult replenishFunds(String str);
    String getUserHistory(String userId);
    String getCommonHistory();
    String getAllHistory();
}
