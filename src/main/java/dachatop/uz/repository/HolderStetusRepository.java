package dachatop.uz.repository;

import dachatop.uz.entity.HolderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolderStetusRepository extends JpaRepository<HolderStatus, Integer> {

}
