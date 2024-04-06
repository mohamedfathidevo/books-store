package gurusec2.sec2.repositories;

import gurusec2.sec2.domain.Author;
import gurusec2.sec2.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
