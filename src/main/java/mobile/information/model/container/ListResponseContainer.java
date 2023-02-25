package mobile.information.model.container;

/*
 * Created by Otabek N.
 * Date: 13.12.2022
 */

import lombok.Data;
import mobile.information.constant.ResultCode;

import java.util.List;

@Data
public class ListResponseContainer<T> extends BaseResponse {
    private List<T> content;

    public ListResponseContainer(List<T> content) {
        this.result = new ResultDto(ResultCode.ok);
        this.content = content;
    }
}
