package pl.iridium405.twitter_like.user;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void save(User user);

    void update(User user);

    void delete(User user);

    User getById(Long id);

    User getByUserName(String username);

}
