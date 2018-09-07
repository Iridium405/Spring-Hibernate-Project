package pl.iridium405.twitter_like.tweet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TweetRepository extends JpaRepository<Tweet, Long> {

    Tweet findById(Long id);

    List<Tweet> findAllByUser_Id(Long id);




}
