package com.iornhack.Project3.repository;

import com.iornhack.Project3.model.UsersGroup.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
