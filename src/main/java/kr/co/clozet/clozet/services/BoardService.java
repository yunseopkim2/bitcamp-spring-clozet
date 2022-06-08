package kr.co.clozet.clozet.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Board;
import kr.co.clozet.clozet.domains.Clothes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName    : kr.co.clozet.clozet.services
 * fileName       : BoardService
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
public interface BoardService {
    List<Board> findAll();
    List<Board> findAll(Sort sort);
    Page<Board> findAll(Pageable pageable);

    Messenger count();

    Messenger delete(Board board);

    Messenger save(Board board);

    Optional<Board> findByDate(String date);

    Messenger existsById(String userid);

    Messenger getOne(Long id);
    //custom

    Board findByUserId(String userId);

    Messenger update(Board board);
}


