package com.greenfoxaccademy.reddit.repositories;

import com.greenfoxaccademy.reddit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select user FROM User user where user.email = ?1")
    User findByEmail(String email);
}
