package kr.co.clozet.clozet.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Clothes;
import kr.co.clozet.clozet.domains.User;
import kr.co.clozet.clozet.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName    : kr.co.clozet.clozet.services
 * fileName       : ClothesService
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
public interface ClothesService {
    List<Clothes> findAll();
    List<Clothes> findAll(Sort sort);
    Page<Clothes> findAll(Pageable pageable);

    Messenger count();

    Messenger delete(Clothes clothes);

    Messenger save(Clothes clothes);

    Optional<Clothes> findByDate(String date);

    Messenger existsById(String userid);

    Messenger getOne(Long id);
    //custom

    Optional<Clothes> findByUserId(String userId);

    Messenger update(Clothes clothes);
}
