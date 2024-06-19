package com.game.server.Repository;

import com.game.server.model.role.Role;
import com.game.server.model.role.RoleName;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    public Role findByName(RoleName name);
}
