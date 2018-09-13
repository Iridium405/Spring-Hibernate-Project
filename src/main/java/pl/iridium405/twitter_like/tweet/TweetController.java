package pl.iridium405.twitter_like.tweet;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.iridium405.twitter_like.user.User;
import pl.iridium405.twitter_like.user.UserService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
@Log
public class TweetController {

    private final TweetService tweetService;
    private final UserService userService;

    public TweetController(TweetService tweetService, UserService userService) {
        this.tweetService = tweetService;
        this.userService = userService;
    }


    @GetMapping("/new-tweet")
    private String newTweetGet(Model model) {
        User user = userService.getById(1L);
        model.addAttribute("user", user);
        Tweet tweet = new Tweet();
        model.addAttribute("tweet", tweet);
        return "new-tweet-like";
    }

    @PostMapping("/new-tweet")
    private String addTweetPost(@ModelAttribute Tweet tweet) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedNow = now.format(formatter);

        tweet.setPublished(now);
        tweet.setPublishedString(formattedNow);
        tweet.setUser(userService.getById(1L));
        tweetService.save(tweet);
        return "home";
    }

}