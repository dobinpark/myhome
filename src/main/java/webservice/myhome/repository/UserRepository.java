package webservice.myhome.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import webservice.myhome.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>  {
    @EntityGraph(attributePaths = { "boards" })
    List<User> findAll();

    User findByUsername(String username);
}
