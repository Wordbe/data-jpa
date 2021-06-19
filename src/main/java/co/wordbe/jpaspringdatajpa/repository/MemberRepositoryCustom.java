package co.wordbe.jpaspringdatajpa.repository;

import co.wordbe.jpaspringdatajpa.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
