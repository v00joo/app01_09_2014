package repository;

import model.LEinOC;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LEinOCRepository extends CrudRepository<LEinOC, Long> {

    List<LEinOC> findById(long id);
}
