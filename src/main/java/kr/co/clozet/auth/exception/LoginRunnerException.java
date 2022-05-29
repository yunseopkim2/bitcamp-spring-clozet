package kr.co.clozet.auth.exception;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-24
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-05-24   kimyunseop   최초 생성
 */
public class LoginRunnerException extends RuntimeException {
    private static final long SerializableUID = 1L;

    public LoginRunnerException() {
        super();
    }

    public LoginRunnerException(String msg) {
        super(msg);
    }
}