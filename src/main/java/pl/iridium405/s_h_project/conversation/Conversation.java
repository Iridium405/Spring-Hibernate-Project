package pl.iridium405.s_h_project.conversation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import pl.iridium405.s_h_project.message.Message;
import pl.iridium405.s_h_project.user.User;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "conversations")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private List<Message> messages;

    private User user;

    private User friend;

    @NotBlank
    @Column(nullable = false)
    private User sentBy;

    @NotBlank
    @Column(nullable = false)
    private User sentTo;


    List<User> users;

}
