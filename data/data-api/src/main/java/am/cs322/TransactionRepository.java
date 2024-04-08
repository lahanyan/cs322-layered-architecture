package am.cs322.transactionrepository;

import am.cs322.model.Transaction; 
import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}