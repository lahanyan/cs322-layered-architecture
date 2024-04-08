package am.cs322.model;

public class TransactionDTO {
    private String fullName;
    private Long userId;
    private TransactionType type;


    public String getFullName() {
        return fullName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getType() {
        if (TransactionType.debit == type) {
            return "debit";
        }
        return "credit";
    }
}