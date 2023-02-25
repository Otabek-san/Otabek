package mobile.information.repository;

import mobile.information.model.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
 * Created by Otabek N.
 * Date: 25.02.2023
 */

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findByIdAndDeletedIsFalse(Integer id);

}
