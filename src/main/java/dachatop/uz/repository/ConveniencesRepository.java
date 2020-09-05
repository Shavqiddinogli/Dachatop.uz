package dachatop.uz.repository;

import dachatop.uz.entity.Conveniences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConveniencesRepository extends JpaRepository<Conveniences, Integer> {
}
