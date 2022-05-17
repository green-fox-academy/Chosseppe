package com.greenfoxaccademy.listingtodoh2.repositories;

import com.greenfoxaccademy.listingtodoh2.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    @Query("SELECT todo FROM To_Do todo WHERE todo.done=?1 ")
    List<Todo> findByIsActive(boolean isActive);
}
