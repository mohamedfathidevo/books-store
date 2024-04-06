package gurusec2.sec2.service;

import gurusec2.sec2.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
