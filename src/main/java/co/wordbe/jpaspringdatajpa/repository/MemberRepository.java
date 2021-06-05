package co.wordbe.jpaspringdatajpa.repository;

import co.wordbe.jpaspringdatajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
