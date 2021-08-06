package webservice.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.myhome.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {

    User findByUsername(String username);
}
