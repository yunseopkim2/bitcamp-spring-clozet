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
public class Articles {
    @Id @Column(name = "article_no")
    @GeneratedValue private long articleNo;
    @Column @NotNull private String title;
    @Column @NotNull private String creatDate;
    @Column @NotNull private String inquiry;
    @Column @NotNull private String open;
    @Column @NotNull private String contents;
    @Column @NotNull private String picture;
    @Column @NotNull private String height;
    @Column @NotNull private String weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    Users user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_no")
    Boards boards;

}
