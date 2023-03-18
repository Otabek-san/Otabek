package mobile.information.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.http.HttpStatus;

public enum ResultCode {
    ok(HttpStatus.OK),
    internal_server(HttpStatus.INTERNAL_SERVER_ERROR),
    bad_request(HttpStatus.BAD_REQUEST),
    invalid_credentials(HttpStatus.BAD_REQUEST),
    cannot_be_null(HttpStatus.BAD_REQUEST),
    user_not_found(HttpStatus.NOT_FOUND),
    user_exists(HttpStatus.NOT_ACCEPTABLE),
    password_un_match(HttpStatus.NOT_ACCEPTABLE),
    region_not_found(HttpStatus.NOT_FOUND),
    relative_not_found(HttpStatus.NOT_FOUND);

    private final HttpStatus status;

    ResultCode(HttpStatus status) {
        this.status = status;
    }

    @JsonValue
    public HttpStatus getStatus() {
        return status;
    }

}
