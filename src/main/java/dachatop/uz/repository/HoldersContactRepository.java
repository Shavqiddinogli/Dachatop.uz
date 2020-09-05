package dachatop.uz.repository;

import dachatop.uz.entity.HoldersContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoldersContactRepository  extends JpaRepository<HoldersContact, Integer> {
}
