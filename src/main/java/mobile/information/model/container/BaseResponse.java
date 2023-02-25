package mobile.information.model.container;

import lombok.Data;
import lombok.NoArgsConstructor;
import mobile.information.constant.ResultCode;

@Data
@NoArgsConstructor
public class BaseResponse {
    protected ResultDto result;

    public BaseResponse(ResultCode code) {
        this.result = new ResultDto(code.name(), code.name());
    }

    public BaseResponse(ResultDto result) {
        this.result = result;
    }
}
