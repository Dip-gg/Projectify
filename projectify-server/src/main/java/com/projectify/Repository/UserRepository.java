package com.projectify.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projectify.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//FIND USER BY USER EMAIL
	@Query("select u from User u where u.email = :email")
	public User findByUserName(@Param("email") String email);
}
