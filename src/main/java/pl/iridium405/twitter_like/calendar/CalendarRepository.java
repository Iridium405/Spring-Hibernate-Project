package pl.iridium405.twitter_like.calendar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}
