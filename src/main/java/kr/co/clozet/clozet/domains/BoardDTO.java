package kr.co.clozet.clozet.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : BoardDTO
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
public class BoardDTO {
    @ApiModelProperty(position = 1) private long boardId;
    @ApiModelProperty(position = 2) boolean likes;
    @ApiModelProperty(position = 3) String userId;
    @ApiModelProperty(position = 4) String season;
    @ApiModelProperty(position = 5) String color;
    @ApiModelProperty(position = 6) String open;
    @ApiModelProperty(position = 7) String picture;
    @ApiModelProperty(position = 8) String comment;
    @ApiModelProperty(position = 9) private String height;
    @ApiModelProperty(position = 10) private String weight;
    @ApiModelProperty(position = 11) private String createdDate;
    @ApiModelProperty(position = 12) private String inquiry;
    @ApiModelProperty(position = 13) private String title;
    @ApiModelProperty(position = 14) private String contents;
}
