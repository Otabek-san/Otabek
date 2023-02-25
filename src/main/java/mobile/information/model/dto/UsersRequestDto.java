package mobile.information.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Created by Otabek N.
 * Date: 25.02.2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UsersRequestDto {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String nationality;
    private String marriageStatus;
    private Boolean children;
    private Integer fromAge;
    private Integer tillAge;
    private String telegram;
    private String phoneNumber;
    private String city;
    private String country;
    private String moreInfo;
}
