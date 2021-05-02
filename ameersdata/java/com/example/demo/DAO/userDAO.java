package com.example.demo.DAO;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.user;
@Repository
@Transactional
public interface userDAO extends JpaRepository<user,Integer>{
	
	
	@Query("select a from user a where a.email=:email and a.password=:password")
	public user signin(@Param("email") String email, @Param("password") String password);}
	