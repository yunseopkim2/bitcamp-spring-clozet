package kr.co.clozet.clozet.domains;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : Role
 * author         : kimyunseop
 * date           : 2022-05-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-27        kimyunseop       최초 생성
 */
@Getter //read on 읽기만 가능
@RequiredArgsConstructor
public enum Role implements GrantedAuthority {
    ADMIN("ROLE_ADMIN", "관리자권한"),
    USER("ROLE_USER", "사용자권한"),
    UNKNOWN_USER("ROLE_UNKNOWN_USER", "알수없는 사용자")
    ;
    private final String code;
    private final String description;

    public static kr.co.clozet.clozet.domains.Role of(String code) {
        return Arrays.stream(kr.co.clozet.clozet.domains.Role.values())
                .filter(i -> i.getCode().equals(code))
                .findAny().orElse(UNKNOWN_USER);
    }

    @Override
    public String getAuthority() {
        return name();
    }
}
