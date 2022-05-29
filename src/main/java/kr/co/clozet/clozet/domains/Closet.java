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
 * fileName       : Closet
 * author         : kimyunseop
 * date           : 2022-05-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-27        kimyunseop       최초 생성
 */
@Table(name = "closet")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Closet {
    @Id @GeneratedValue @Column(name = "closet_no")
    private long closetNo;
    @Column @NotNull private String clothesClassfication;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    Users user;

    @OneToMany(mappedBy = "closet")
    List<Clothes> clothes = new ArrayList<>();

}
