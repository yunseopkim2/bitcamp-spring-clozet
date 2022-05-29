package kr.co.clozet.auth.domains;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-23
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 22022-05-23  kimyunseop   최초 생성
 */
@Getter @Builder
public class Messenger {
    private String message, code, token;
    private int status;
}
