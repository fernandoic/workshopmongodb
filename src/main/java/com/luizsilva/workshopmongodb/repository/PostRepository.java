package com.luizsilva.workshopmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luizsilva.workshopmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
	List<Post> findByTitleContainingIgnoreCase (String text);
	
}
