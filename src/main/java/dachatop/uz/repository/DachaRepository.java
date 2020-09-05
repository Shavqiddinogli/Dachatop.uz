package dachatop.uz.repository;

import dachatop.uz.entity.Dacha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DachaRepository extends JpaRepository<Dacha, Integer> {

}
