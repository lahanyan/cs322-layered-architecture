package am.cs322;

public interface TransactionService {

    boolean createDebitAccount(Long userId);

    boolean createCreditAccount(Long userId);
}