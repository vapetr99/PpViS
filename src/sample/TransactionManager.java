package sample;

public class TransactionManager implements ITransactionManager {

    private TransactionLogger transactionLogger;

    public TransactionManager(TransactionLogger transactionLogger) {
        this.transactionLogger = transactionLogger;
    }


    TransactionResult transact(Action[] action){
        return null;
    }


    @Override
    public TransactionResult withdrawFunds(String userId, int amount) {
        return null;
    }

    @Override
    public TransactionResult replenishFunds(String userId, int amount) {
        return null;
    }

    @Override
    public void transferFunds(String sourceUserId, String targetUserId, int amount) {

    }
}
