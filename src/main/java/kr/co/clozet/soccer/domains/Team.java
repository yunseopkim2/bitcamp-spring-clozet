package kr.co.clozet.soccer.domains;

import com.sun.istack.NotNull;
import kr.co.clozet.soccer.services.TeamService;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="teams")
public class Team {

    @Id
    @Column(name = "team_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long teamNo;
    @Column(nullable = false) private String teamId;
    @Column(nullable = false) private String stadiumId;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String origYyyy;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;

    @OneToMany(mappedBy = "team")
    List<Player> players = new ArrayList<>();


}
