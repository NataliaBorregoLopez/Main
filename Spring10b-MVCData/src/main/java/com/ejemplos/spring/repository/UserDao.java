package com.ejemplos.spring.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ejemplos.spring.model.User;

@Repository
public interface UserDao extends JpaRepository<User,Integer>{
	
	List<User> findByUsername(String username);
	
	//@Query("FROM user WHERE username=?1")
	//List<User> AMiManeraFindByUsername(String username);
}
