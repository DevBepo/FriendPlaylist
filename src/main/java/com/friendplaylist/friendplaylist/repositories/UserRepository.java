package com.friendplaylist.friendplaylist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.friendplaylist.friendplaylist.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
