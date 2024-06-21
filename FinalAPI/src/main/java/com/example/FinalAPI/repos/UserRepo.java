package com.example.FinalAPI.repos;

import com.example.FinalAPI.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {

    //List<User> findById(Long customerId);

    List<User> createUser(User user);

    List<User>getAllUsers(User user);

    List<User>deleteUser(User user, Long customerId);

    List<User>updateUser(User user, Long customerId);
}
