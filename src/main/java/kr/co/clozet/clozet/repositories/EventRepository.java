package kr.co.clozet.clozet.repositories;

import kr.co.clozet.clozet.domains.Clothes;
import kr.co.clozet.clozet.domains.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : kr.co.clozet.clozet.repositories
 * fileName       : EventRepository
 * author         : kimyunseop
 * date           : 2022-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-08        kimyunseop       최초 생성
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
