package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyToDoRepository extends JpaRepository<ToDo, Long> {
}
