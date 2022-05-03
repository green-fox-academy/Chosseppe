package com.example.todoh2.repositories;

import com.example.todoh2.models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyToDoRepository extends JpaRepository<ToDo, Long> {
}
