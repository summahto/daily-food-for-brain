package com.summahto.multipledatasources.repository.member;

import com.summahto.multipledatasources.model.member.Member;
import org.springframework.data.repository.CrudRepository;


public interface MemberRepository extends CrudRepository<Member, Long> {

}
