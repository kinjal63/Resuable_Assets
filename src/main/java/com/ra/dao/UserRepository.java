package com.ra.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ra.dto.UserDTO;

@Repository
public interface UserRepository extends CrudRepository<UserDTO, Long> {
	public void findByEmail(String email);
}
