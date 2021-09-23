package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//todorepository : todoentity 객체를 crud하는 인터페이스
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
