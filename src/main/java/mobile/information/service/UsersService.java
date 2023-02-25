package mobile.information.service;

import mobile.information.model.dto.UsersRequestDto;
import mobile.information.model.dto.UsersResponseDto;

/*
 * Created by Otabek N.
 * Date: 25.02.2023
 */
public interface UsersService {

    UsersResponseDto save(UsersRequestDto body);

    UsersResponseDto get(Integer id);

    void delete(Integer id);

}
