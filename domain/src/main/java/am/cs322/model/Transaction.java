package am.cs322.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "transactions")
public class Transaction {
    public Transaction() {

    }
    public Transaction(TransactionType type, User user) {
        this.type = type;
        this.user = user;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private TransactionType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
}