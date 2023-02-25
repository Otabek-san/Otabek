package mobile.information.model.container;

import lombok.Data;
import lombok.NoArgsConstructor;
import mobile.information.constant.ResultCode;

@Data
@NoArgsConstructor
public class ResponseContainer<T> extends BaseResponse {
    private T content;

    public ResponseContainer(T content) {
        this.result = new ResultDto(ResultCode.ok);
        this.content = content;
    }

    public ResponseContainer(ResultCode code, T content) {
        this.result = new ResultDto(code);
        this.content = content;
    }
}
