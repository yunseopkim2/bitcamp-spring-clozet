package kr.co.clozet.clozet.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : Articles
 * author         : kimyunseop
 * date           : 2022-05-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-27        kimyunseop       최초 생성
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "articles")
@Component
@Entity
public class Article {
    @Id @Column(name = "article_id")
    @GeneratedValue private long articleId;
    @Column @NotNull private String title;
    @Column(name = "written_date") @NotNull private String writtenDate;
    @Column @NotNull private String inquiry;
    @Column @NotNull private String open;
    @Column @NotNull private String contents;
    @Column @NotNull private String picture;
    @Column @NotNull private String height;
    @Column @NotNull private String weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

}
