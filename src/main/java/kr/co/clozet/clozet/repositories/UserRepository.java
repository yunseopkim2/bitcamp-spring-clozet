package kr.co.clozet.clozet.repositories;


import kr.co.clozet.clozet.domains.User;
import org.junit.jupiter.api.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

interface UserCustomRepository{
  // 000. 사용자 비밀번호와 이메일을 수정하시오
    @Modifying(clearAutomatically = true)
    @Query(value = "update User u set u.email =: email where u.userId",
    nativeQuery = true)
    String update( @Param("email") String email);

    @Query(value = "select username from User")
    List<User> findUsername();

}

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository{

    Optional<User> findByUsername(String name);

  @Override
  List<User> findUsername();
}
