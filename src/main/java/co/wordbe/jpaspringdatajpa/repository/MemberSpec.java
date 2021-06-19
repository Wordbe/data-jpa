package co.wordbe.jpaspringdatajpa.repository;

import co.wordbe.jpaspringdatajpa.entity.Member;
import co.wordbe.jpaspringdatajpa.entity.Team;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;

public class MemberSpec {

    public static Specification<Member> teamName(final String teamName) {
        return (root, query, builder) -> {
            if (!StringUtils.hasText(teamName)) {
                return null;
            }

            Join<Member, Team> team = root.join("team", JoinType.INNER);// 회원과 조인
            return builder.equal(team.get("name"), teamName);
        };
    }

    public static Specification<Member> username(final String username) {
        return (root, query, builder) -> builder.equal(root.get("username"), username);
    }
}
