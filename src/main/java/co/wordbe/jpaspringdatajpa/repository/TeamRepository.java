package co.wordbe.jpaspringdatajpa.repository;

import co.wordbe.jpaspringdatajpa.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
