package pl.iridium405.s_h_project.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(Long id);

    List<User> findAllByBirth(LocalDate birth);

    List<User> findAllByEmail(String email);


}
