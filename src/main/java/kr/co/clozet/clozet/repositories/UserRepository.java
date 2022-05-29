package kr.co.clozet.clozet.repositories;


import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

interface UserCustomRepository{
  // 000. 사용자 비밀번호와 이메일을 수정하시오

}

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

    Optional<Users> findByUsername(String name);
}
