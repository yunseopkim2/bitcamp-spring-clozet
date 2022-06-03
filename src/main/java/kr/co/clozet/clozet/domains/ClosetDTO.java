package kr.co.clozet.clozet.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : ClosetDTO
 * author         : kimyunseop
 * date           : 2022-06-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-03        kimyunseop       최초 생성
 */
@Component
@Data
public class ClosetDTO {
    @ApiModelProperty(position = 1) private long closetId;
    @ApiModelProperty(position = 2) String clothesClassfication;

}
