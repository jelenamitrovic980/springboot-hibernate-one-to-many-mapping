package com.jelenamitrovic980.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jelenamitrovic980.springboot.Entity.Comment;
import com.jelenamitrovic980.springboot.Entity.Post;
import com.jelenamitrovic980.springboot.Repository.PostRepository;



@SpringBootApplication
public class SpringbootHibernateOneToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToManyMappingApplication.class, args);
	}
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {

		Post post = new Post("one to many mapping using JPA and hibernate",
				"one to many mapping using JPA and hibernate");

		Comment comment1 = new Comment("Very nice");
		Comment comment2 = new Comment("Realy good");
		Comment comment3 = new Comment("Exelent");

		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		this.postRepository.save(post);

	}


}
