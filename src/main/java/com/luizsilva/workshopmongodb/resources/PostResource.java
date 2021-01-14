package com.luizsilva.workshopmongodb.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luizsilva.workshopmongodb.domain.Post;
import com.luizsilva.workshopmongodb.domain.User;
import com.luizsilva.workshopmongodb.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private PostService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Post>> findById(@PathVariable String id) {

		Optional<Post> obj = service.findById(id);

		return ResponseEntity.ok().body(obj);
	}

}
