package kr.co.clozet.clozet.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : Boards
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
@Table(name = "boards")
@Entity
public class Board {
    @Id @GeneratedValue @Column(name = "board_id")
    private long boardId;
    @Column private boolean likes;
    @Column private String userId;
    @Column @NotNull private String season;
    @Column private String color;
    @Column @NotNull private boolean open;
    @Column private String picture;
    @Column private String comment;
    @Column @NotNull private String height;
    @Column @NotNull private String weight;
    @Column(name = "created_date") @NotNull private String createdDate;
    @Column @NotNull private String inquiry;
    @Column @NotNull private String title;
    @Column @NotNull private String contents;

    @OneToMany(mappedBy = "board")
    List<Article> article = new ArrayList<>();

    @OneToMany(mappedBy = "board")
    List<Closet> closets = new ArrayList<>();
}
