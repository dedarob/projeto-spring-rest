package com.roberto.projeto_spring_rest.DAO;

import com.roberto.projeto_spring_rest.model.User;
import org.springframework.data.repository.CrudRepository;

public interface inputUser extends CrudRepository<User, Integer> {
}
