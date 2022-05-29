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
public class Boards {
    @Id @GeneratedValue @Column(name = "board_no")
    private long boardNo;
    @Column @NotNull private boolean like;
    @Column @NotNull private String season;
    @Column @NotNull private String color;
    @Column @NotNull private boolean open;
    @Column @NotNull private String picture;
    @Column @NotNull private String comment;
    @Column @NotNull private String height;
    @Column @NotNull private String weight;
    @Column @NotNull private String createdDate;
    @Column @NotNull private String inquiry;
    @Column @NotNull private String title;
    @Column @NotNull private String contents;

    @OneToMany(mappedBy = "boards")
    List<Articles> articles = new ArrayList<>();
    @OneToMany(mappedBy = "boards")
    List<Clothes> clothes = new ArrayList<>();
}
