package pl.iridium405.twitter_like.tweet;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetServiceImpl implements TweetService {

    private final TweetRepository tweetRepository;

    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public void save(Tweet tweet) {
        tweetRepository.save(tweet);
    }

    @Override
    public void update(Tweet tweet) {
        tweetRepository.save(tweet);
    }

    @Override
    public void delete(Tweet tweet) {
        tweetRepository.delete(tweet);
    }

    @Override
    public Tweet getById(Long id) {
        return tweetRepository.findById(id);
    }

    @Override
    public List<Tweet> getAllByUserId(Long id) {
        return tweetRepository.findAllByUser_Id(id);
    }
}
