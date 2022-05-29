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
 * fileName       : Clothes
 * author         : kimyunseop
 * date           : 2022-05-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-27        kimyunseop       최초 생성
 */
@Table(name = "clothes")
@Builder
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Clothes {
    @Id @GeneratedValue @Column(name = "clothes_no")
    private long clothesNo;
    @Column @NotNull private String season;
    @Column @NotNull private String color;
    @Column @NotNull private String date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "closet_no")
    Closet closet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_no")
    Boards boards;
}
