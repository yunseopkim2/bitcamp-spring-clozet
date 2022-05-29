package kr.co.clozet.clozet.domains;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.List;

/**
 * packageName: kr.co.clozet.auth.domains
 * fileName        : UserDto
 * author           : kimyunseop
 * date               : 2022-05-24
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-05-24  kimyunseop   최초 생성
 */
@Component @Data
public class UserDTO {
    @ApiModelProperty(position = 1) private long userId;
    @ApiModelProperty(position = 2) String username;
    @ApiModelProperty(position = 3) String password;
    @ApiModelProperty(position = 4) String name;
    @ApiModelProperty(position = 5) String email;
    @ApiModelProperty(position = 6) String phone;
    @ApiModelProperty(position = 7) String birth;
    @ApiModelProperty(position = 8) String nickname;
    @ApiModelProperty(position = 9) private String token;
    @ApiModelProperty(position = 10) private List<Role> roles;
}
