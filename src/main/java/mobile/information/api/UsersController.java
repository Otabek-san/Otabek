package mobile.information.api;

import io.swagger.v3.oas.annotations.Operation;
import mobile.information.constant.ResultCode;
import mobile.information.model.container.ResponseContainer;
import mobile.information.model.container.ResultDto;
import mobile.information.model.dto.UsersRequestDto;
import mobile.information.model.dto.UsersResponseDto;
import mobile.information.service.UsersService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
 * Created by Otabek N.
 * Date: 25.02.2023
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    private final UsersService usersService;

    public UsersController(@Qualifier("users_service") UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/{id}")
    @Operation(description = "get user by id", summary = "")
    public ResponseEntity<ResponseContainer<UsersResponseDto>> get(
            @PathVariable("id") Integer id
    ) {
        var result = usersService.get(id);
        return ResponseEntity.ok(new ResponseContainer<>(result));
    }

    @PostMapping
    @Operation(description = "save user if no id given, edit user with given id", summary = "")
    public ResponseEntity<ResponseContainer<UsersResponseDto>> save(
            @RequestBody UsersRequestDto body
    ) {
        var result = usersService.save(body);
        return ResponseEntity.ok(new ResponseContainer<>(result));
    }

    @DeleteMapping("/{id}")
    @Operation(description = "delete user by id", summary = "")
    public ResponseEntity<ResponseContainer<?>> delete(
            @PathVariable("id") Integer id
    ) {
        usersService.delete(id);
        return ResponseEntity.ok(new ResponseContainer<>(new ResultDto(ResultCode.ok)));
    }

}
