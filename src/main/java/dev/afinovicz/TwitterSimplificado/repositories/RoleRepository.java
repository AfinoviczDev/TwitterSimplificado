package dev.afinovicz.TwitterSimplificado.repositories;

import dev.afinovicz.TwitterSimplificado.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
