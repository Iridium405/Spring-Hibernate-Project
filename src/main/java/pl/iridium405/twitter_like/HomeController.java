package pl.iridium405.twitter_like;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    private String homePage(){
        return "home";
    }

    @GetMapping("/conversations")
    private String conversationsPage() {
        return "conversations";
    }

    @GetMapping("/watching")
    private String watchingPage() {
        return "watching";
    }

    @GetMapping("/calendar")
    private String calendarPage() {
        return "calendar";
    }



    @GetMapping("/settings")
    private String propertiesPage() {
        return "settings";
    }

    @GetMapping("/logout")
    private String logoutPage() {
        return "logout";
    }

}