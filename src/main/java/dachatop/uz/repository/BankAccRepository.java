package dachatop.uz.repository;

import dachatop.uz.entity.BankAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccRepository extends JpaRepository<BankAcc, Integer> {
}
