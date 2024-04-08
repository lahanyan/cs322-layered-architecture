package am.cs322.transaction;


import am.cs322.model.transaction.CreateTransactionRequest;
import am.cs322.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bank")
public class TransactionControllerImpl implements TransactionController {


    TransactionService transactionService;

    public TransactionControllerImpl(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/credit")
    public String createCreditAccount(@RequestBody CreateTransactionRequest request) {
        boolean value = transactionService.createCreditAccount(request.userId());

        return value ? "Credit" : "Cannot create Credit Account";
    }

    @PostMapping("/debit")
    public String createDebitAccount(@RequestBody CreateTransactionRequest request) {
        boolean value = transactionService.createDebitAccount(request.userId());

        return value ? "Debit" : "Cannot create Debit Account";
    }

}


