package com.jelenamitrovic980.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jelenamitrovic980.springboot.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
