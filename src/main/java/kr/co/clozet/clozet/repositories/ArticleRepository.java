package kr.co.clozet.clozet.repositories;

import kr.co.clozet.clozet.domains.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : kr.co.clozet.clozet.repositories
 * fileName       : ArticleRepository
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
interface ArticleRepositoryCustom{

}
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
