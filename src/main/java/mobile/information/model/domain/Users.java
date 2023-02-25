package mobile.information.model.domain;

import lombok.Data;
import mobile.information.model.BaseEntity;
import org.jetbrains.annotations.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * Created by Otabek N.
 * Date: 25.02.2023
 */
@Entity
@Data
@Table(name = "users")
public class Users extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private Integer age;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "marriage_status")
    private String marriageStatus;

    @Column(name = "children")
    private Boolean children;

    @Column(name = "from_age")
    private Integer fromAge;

    @Column(name = "till_age")
    private Integer tillAge;

    @Nullable
    @Column(name = "phone_number")
    private String phoneNumber;

    @Nullable
    @Column(name = "telegram")
    private String telegram;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "more_info")
    private String moreInfo;

}
