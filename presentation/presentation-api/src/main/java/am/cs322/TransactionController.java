package am.cs322.transaction;

import am.cs322.model.transaction.CreateTransactionRequest;

public interface TransactionController {

    String createCreditAccount(CreateTransactionRequest request);

    String createDebitAccount(CreateTransactionRequest request);
}
