package kr.co.clozet.clozet.repositories;

import kr.co.clozet.clozet.domains.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : kr.co.clozet.clozet.repositories
 * fileName       : BoardRepository
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
interface BoardRepositoryCustom{

}
@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
