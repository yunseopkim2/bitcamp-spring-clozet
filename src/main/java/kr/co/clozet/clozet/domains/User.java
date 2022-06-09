package kr.co.clozet.clozet.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.sun.istack.NotNull;
import kr.co.clozet.clozet.repositories.UserRepository;
import lombok.*;
import org.junit.jupiter.api.Test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : Users
 * author         : kimyunseop
 * date           : 2022-05-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-27        kimyunseop       최초 생성
 */
@Table(name = "users")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @Id @GeneratedValue @Column(name = "user_id")
    private long userId;
    @Column
    @NotNull private String username;
    @Column @NotNull private String password;
    @Column @NotNull private String name;
    @Column @NotNull private String birth;
    @Column @NotNull private String nickname;
    @Column @NotNull private String email;
    @Column @NotNull private String phone;

    @OneToMany(mappedBy = "user")
    List<Article> articles = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role> roles;

    @OneToMany(mappedBy = "user")
    List<Clothes> clothes = new ArrayList<>();


}
