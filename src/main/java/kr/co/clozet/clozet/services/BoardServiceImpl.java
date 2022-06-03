package kr.co.clozet.clozet.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName    : kr.co.clozet.clozet.services
 * fileName       : BoardServiceImpl
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    @Override
    public List<Board> findAll() {
        return null;
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Board> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Messenger count() {
        return null;
    }

    @Override
    public Messenger delete(Board board) {
        return null;
    }

    @Override
    public Messenger save(Board board) {
        return null;
    }

    @Override
    public Optional<Board> findByDate(String date) {
        return Optional.empty();
    }

    @Override
    public Messenger existsById(String userid) {
        return null;
    }

    @Override
    public Messenger getOne(Long id) {
        return null;
    }

    @Override
    public Optional<Board> findByUserId(String userId) {
        return Optional.empty();
    }

    @Override
    public Messenger update(Board board) {
        return null;
    }
}
