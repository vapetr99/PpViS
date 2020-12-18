package sample;

public interface ITransactionResult {

    TransactionResult withdrawFunds(String userId, int amount);
    TransactionResult replenishFunds(String userId,int amount);
    void transferFunds(String sourceUserId, String targetUserId, int amount);

}
