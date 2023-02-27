package mobile.information.interceptor;

import mobile.information.constant.ResultCode;
import mobile.information.exception.BaseException;
import mobile.information.model.container.ResponseContainer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
/*import org.springframework.security.core.context.SecurityContextHolder;*/
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorAdvice {
    private Logger logger = LogManager.getLogger(ErrorAdvice.class);

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> get(RuntimeException e) {
        /*var name = SecurityContextHolder.getContext().getAuthentication().getName();*/
        var error = new ResponseContainer(ResultCode.internal_server, "");
        logger.error(e.getMessage(), e);
        if (e instanceof BaseException ex) {
            error = new ResponseContainer(ex.getCode(), null);
        }
        return ResponseEntity.ok(error);
    }
}
