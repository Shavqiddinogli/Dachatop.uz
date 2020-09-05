package dachatop.uz.repository;

import dachatop.uz.entity.PaymentInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInformationRepository extends JpaRepository<PaymentInformation, Integer> {
}
