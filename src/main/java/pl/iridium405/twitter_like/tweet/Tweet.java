package pl.iridium405.s_h_project.tweet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import pl.iridium405.s_h_project.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Length(min = 10, max = 200)
    private String content;


    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime published;


    @ManyToOne(targetEntity = User.class)
    private User user;

}
