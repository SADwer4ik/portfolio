package com.game.server.Repository;

import com.game.server.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findByName(String name);
    public User findByEmail(String email);
    public boolean existsByName(String name);
}
