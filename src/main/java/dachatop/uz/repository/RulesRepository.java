package dachatop.uz.repository;

import dachatop.uz.entity.Rules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulesRepository extends JpaRepository<Rules, Integer> {
}
