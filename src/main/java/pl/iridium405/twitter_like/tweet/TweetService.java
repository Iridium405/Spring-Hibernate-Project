package pl.iridium405.twitter_like.tweet;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TweetService {

    void save(Tweet tweet);

    void update(Tweet tweet);

    void delete(Tweet tweet);

    Tweet getById(Long id);

    List<Tweet> getAllByUserId(Long id);
}