package pl.iridium405.twitter_like.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

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
    @Length(min = 3, max = 30)
    @Column(nullable = false, unique = true, name = "username")
    private String username;

    @Length(min = 6)
    @Column(name = "password")
    private String password;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "birth")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birth;

    @Email
    @NotBlank
    @Column(nullable = false, unique = true, name = "email")
    private String email;


//    @Column(name = "conversations")
//    @OneToMany
//    private List<Conversation> conversations;

//    @Column(name = "friends")
//    private List<User> friends;

}
