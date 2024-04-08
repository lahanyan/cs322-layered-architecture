package am.cs322;
import am.cs322.transactionrepository.TransactionRepository;
import am.cs322.userrepository.UserRepository;

import am.cs322.model.Transaction;
import am.cs322.model.TransactionType;
import am.cs322.model.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService{
    TransactionRepository transactionRepository;
    private final UserRepository userRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, UserRepository userRepository) {
        this.transactionRepository = transactionRepository;
        this.userRepository = userRepository;
    }

    @Override
    public boolean createDebitAccount(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        user.ifPresent(userE -> transactionRepository.save(new Transaction(TransactionType.debit, userE)));

        return user.isPresent();
    }

    @Override
    public boolean createCreditAccount(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        user.ifPresent(userE -> transactionRepository.save(new Transaction(TransactionType.credit, userE)));

       return user.isPresent();
    }
}