package pl.iridium405.twitter_like.tweet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public interface TweetRepository extends JpaRepository<Tweet, Long> {

    Tweet findById(Long id);

    List<Tweet> findAllByUser_Id(Long id);

    List<Tweet> findAllByPublishedAfter(LocalDateTime published);

    List<Tweet> findAllByPublishedBefore(LocalDateTime published);

    List<Tweet> findAllByPublishedBetween(LocalDateTime start, LocalDateTime stop);

    Tweet findFirstByPublishedBefore(LocalDateTime now);

    List<Tweet> findAllByUser_IdAndPublishedBetween(Long id, LocalDateTime start, LocalDateTime stop);

}
