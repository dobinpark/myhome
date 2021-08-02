package webservice.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.myhome.model.Board;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title, String content);
}
