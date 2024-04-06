package gurusec2.sec2.repositories;

import gurusec2.sec2.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
