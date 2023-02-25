package mobile.information.model.container;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mobile.information.constant.ResultCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDto {
    private String code;
    private String description;

    public ResultDto(ResultCode code) {
        this.code = code.name();
        this.description = code.name();
    }
}
