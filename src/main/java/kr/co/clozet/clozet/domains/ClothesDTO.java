package kr.co.clozet.clozet.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;


/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : ClothesDTO
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
public class ClothesDTO {
    @ApiModelProperty(position = 1) private long clothesId;

}
