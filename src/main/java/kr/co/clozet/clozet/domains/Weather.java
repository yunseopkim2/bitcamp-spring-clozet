package kr.co.clozet.clozet.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : Weather
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
@Table(name = "weathers")
@Entity
@Getter
@Component

public class Weather {
    @Id
    @Column(name = "weather_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long weatherId;
    @Column private String temperature;

    @OneToOne
    @JoinColumn(name = "clothes_id")
    private Clothes clothes;

}
