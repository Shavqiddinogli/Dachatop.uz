package dachatop.uz.repository;

import dachatop.uz.entity.VillasAdress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillasAdressRepository extends JpaRepository<VillasAdress, Integer> {

}
