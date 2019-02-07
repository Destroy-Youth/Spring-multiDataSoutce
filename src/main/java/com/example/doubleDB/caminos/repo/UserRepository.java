package com.example.doubleDB.caminos.repo;

import com.example.doubleDB.caminos.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
