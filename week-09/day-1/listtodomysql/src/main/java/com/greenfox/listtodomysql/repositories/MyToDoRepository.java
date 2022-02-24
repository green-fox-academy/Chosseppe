package com.greenfox.listtodomysql.repositories;

import com.greenfox.listtodomysql.models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyToDoRepository extends JpaRepository<ToDo, Long> {
}
