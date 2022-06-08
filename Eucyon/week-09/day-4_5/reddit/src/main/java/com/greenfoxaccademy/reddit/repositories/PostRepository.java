package com.greenfoxaccademy.reddit.repositories;

import com.greenfoxaccademy.reddit.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    /*
    @Query("select post from Post post where post.id =?1")
    List<Post> searchById(Long id);

     */
}
