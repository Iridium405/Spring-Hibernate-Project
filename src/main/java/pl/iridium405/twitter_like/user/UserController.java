package pl.iridium405.twitter_like.user;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.iridium405.twitter_like.tweet.Tweet;
import pl.iridium405.twitter_like.tweet.TweetService;

import java.util.List;

@Controller
@Log
public class UserController {

    private final UserService userService;
    private final TweetService tweetService;

    public UserController(UserService userService, TweetService tweetService) {
        this.userService = userService;
        this.tweetService = tweetService;
    }

    @GetMapping("/my-account")
    private String myAccountPage(Model model) {
        List<Tweet> userTweets = tweetService.getAllByUserId(1L);
        model.addAttribute("userTweets", userTweets);
        return "my-account";
    }

}
