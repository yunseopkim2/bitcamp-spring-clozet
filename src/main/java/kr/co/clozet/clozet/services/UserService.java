package kr.co.clozet.clozet.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Users;
import kr.co.clozet.clozet.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO login(UserDTO user);
    Messenger logout();
    List<Users> findAll();
    List<Users> findAll(Sort sort);
    Page<Users> findAll(Pageable pageable);

    Messenger count();

    Messenger delete(Users user);

    Messenger save(UserDTO user);

    Optional<Users> findById(String userid);

    Messenger existsById(String userid);

    Messenger getOne(Long id);
    //custom

    List<Users> findByUserName(String name);

    Messenger update(Users user);
}
