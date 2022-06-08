package kr.co.clozet.clozet.domains;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @Id @GeneratedValue @Column(name = "clothes_id")
    private long clothesId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "closet_id")
    private Closet closet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "clothes")
    private Color color;

    @OneToOne(mappedBy = "clothes")
    private Weather weather;

    @OneToOne(mappedBy = "clothes")
    private Style style;

    @OneToOne(mappedBy = "clothes")
    private Event event;    
}
