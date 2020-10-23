package com.luizsilva.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizsilva.workshopmongodb.domain.User;
import com.luizsilva.workshopmongodb.dto.UserDTO;
import com.luizsilva.workshopmongodb.repository.UserRepository;
import com.luizsilva.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {

		return repo.findAll();
	}

	public User findById(String id) {

		Optional<User> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Usuario não encontrado"));

	}

	public User insert(User obj) {

		return repo.insert(obj);
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());

	}

}
