package kr.co.clozet.clozet.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : Event
 * author         : kimyunseop
 * date           : 2022-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-08        kimyunseop       최초 생성
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "events")
@Entity
@Getter
@Component
public class Event {
    @Id
    @Column(name = "event_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long event_id;
    @Column private String funeral;
    @Column private String wedding;

    @OneToOne
    @JoinColumn(name = "clothes_id")
    private Clothes clothes;
}
