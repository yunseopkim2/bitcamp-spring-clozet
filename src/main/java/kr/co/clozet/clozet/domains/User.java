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
public class User {
    @Id @GeneratedValue @Column(name = "user_id")
    private long userId;
    @Column @NotNull private String username;
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

    @OneToOne(mappedBy = "user")
    private Closet closet;

}
