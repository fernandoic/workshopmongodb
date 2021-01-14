package com.luizsilva.workshopmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizsilva.workshopmongodb.domain.Post;
import com.luizsilva.workshopmongodb.repository.PostRepository;
import com.luizsilva.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Optional<Post> findById(String id) {

		Optional<Post> user = repo.findById(id);
		if (user == null) {
			throw new ObjectNotFoundException("Post não encontrado");
		}

		return user;
	}

}
