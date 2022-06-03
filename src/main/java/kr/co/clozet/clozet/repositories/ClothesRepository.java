package kr.co.clozet.clozet.repositories;

import kr.co.clozet.clozet.domains.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : kr.co.clozet.clozet.repositories
 * fileName       : ClothesController
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
interface ClothesRepositoryCustom{

}

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
