package pl.iridium405.s_h_project.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import pl.iridium405.s_h_project.conversation.Conversation;
import pl.iridium405.s_h_project.tweet.Tweet;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private String firstName;

    private String lastName;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birth;

    @Email
    @NotBlank
    private String email;

    private List<Tweet> tweets;

    private List<Conversation> conversations;

    private List<User> friends;

}
