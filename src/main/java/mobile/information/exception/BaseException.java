package mobile.information.exception;

import mobile.information.constant.ResultCode;
import org.springframework.http.HttpStatus;

public class BaseException extends RuntimeException {
    private ResultCode code;
    private HttpStatus status;

    public BaseException() {
    }

    public BaseException(ResultCode code, String message) {
        this.code = code;
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public BaseException(ResultCode code) {
        this.code = code;
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public BaseException(ResultCode code, HttpStatus status) {
        this.code = code;
        this.status = status;
    }

    public ResultCode getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
