package dachatop.uz.repository;

import dachatop.uz.entity.VideoLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoLinkRepository extends JpaRepository<VideoLink, Integer> {

}
