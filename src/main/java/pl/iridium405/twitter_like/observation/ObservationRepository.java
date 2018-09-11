package pl.iridium405.twitter_like.observation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ObservationRepository extends JpaRepository<Observation, Long> {

}