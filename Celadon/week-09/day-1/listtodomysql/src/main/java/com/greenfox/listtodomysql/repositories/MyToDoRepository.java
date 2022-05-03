package com.greenfox.listtodomysql.repositories;

import com.greenfox.listtodomysql.models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyToDoRepository extends JpaRepository<ToDo, Long> {

    @Query("SELECT todo FROM todo todo WHERE todo.done=?1 ")
    List<ToDo> findByIsActive(boolean isActive);
}
