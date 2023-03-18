package mobile.information.service;

/*
 * Created by Otabek N.
 * Date: 25.02.2023
 */

import mobile.information.constant.ResultCode;
import mobile.information.exception.BaseException;
import mobile.information.model.domain.Users;
import mobile.information.model.dto.UsersRequestDto;
import mobile.information.model.dto.UsersResponseDto;
import mobile.information.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service("users_service")
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UsersResponseDto save(UsersRequestDto body) {
        Users user;
        if (body.getId() != null) {
            user = usersRepository.findById(body.getId()).orElseThrow(
                    () -> new BaseException(ResultCode.user_not_found));
        } else user = new Users();
        user.setName(body.getName());
        user.setSurname(body.getSurname());
        user.setAge(body.getAge());
        user.setNationality(body.getNationality());
        user.setMarriageStatus(body.getMarriageStatus());
        user.setChildren(body.getChildren());
        user.setFromAge(body.getFromAge());
        user.setTillAge(body.getTillAge());
        if (body.getTelegram() == null && body.getPhoneNumber() == null)
            throw new BaseException(ResultCode.cannot_be_null);
        user.setTelegram(body.getTelegram());
        user.setPhoneNumber(body.getPhoneNumber());
        user.setCity(body.getCity());
        user.setCountry(body.getCountry());
        user.setMoreInfo(body.getMoreInfo());
        return new UsersResponseDto(usersRepository.save(user));
    }

    @Override
    public UsersResponseDto get(Integer id) {
        var user = usersRepository.findByIdAndDeletedIsFalse(id)
                .orElseThrow(() -> new BaseException(ResultCode.user_not_found));
        return new UsersResponseDto(user);
    }

    @Override
    public void delete(Integer id) {
        var user = usersRepository.findByIdAndDeletedIsFalse(id)
                .orElseThrow(() -> new BaseException(ResultCode.user_not_found));
        user.setDeleted(true);
        usersRepository.save(user);
    }
}
