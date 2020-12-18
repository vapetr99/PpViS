package sample;



public class BudgetManager implements IBudgetManager{

     User user = new User();
     Account account = new Account();
     TransactionManager transactionManager = new TransactionManager();
     TransactionLogger transactionLogger = new TransactionLogger();


    @Override
    public User findUserWithId(String id) {
        return null;
    }

    @Override
    public User findUserWithName(String name) {
        return null;
    }

    @Override
    public User createAdmin(String name, String password) {
        return null;
    }

    @Override
    public User createUser(String name, String password) {
        return null;
    }

    @Override
    public Rule getUserRules(String userId) {
        return null;
    }

    @Override
    public void setUserRules(String userId, Rule[] rules) {
    }


    @Override
    public TransactionResult withdrawFunds(String str) {
        return null;
    }

    @Override
    public TransactionResult replenishFunds(String str) {
        return null;
    }

    @Override
    public String getUserHistory(String userId) {
        return null;
    }

    @Override
    public String getCommonHistory() {
        return null;
    }

    @Override
    public String getAllHistory() {
        return null;
    }
}
