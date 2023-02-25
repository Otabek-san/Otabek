package mobile.information.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mobile.information.model.domain.Users;

/*
 * Created by Otabek N.
 * Date: 25.02.2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UsersResponseDto {
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

    public UsersResponseDto(Users user) {
        this.id = user.getId();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.age = user.getAge();
        this.nationality = user.getNationality();
        this.marriageStatus = user.getMarriageStatus();
        this.children = user.getChildren();
        this.fromAge = user.getFromAge();
        this.tillAge = user.getTillAge();
        this.telegram = user.getTelegram();
        this.phoneNumber = user.getPhoneNumber();
        this.city = user.getCity();
        this.country = user.getCountry();
        this.moreInfo = user.getMoreInfo();
    }

}
