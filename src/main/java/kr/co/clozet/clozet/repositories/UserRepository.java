package kr.co.clozet.clozet.repositories;


import kr.co.clozet.clozet.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

interface UserCustomRepository{
  // 000. 사용자 비밀번호와 이메일을 수정하시오

}

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUsername(String name);
}
