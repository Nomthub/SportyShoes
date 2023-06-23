package com.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
	 public UserEntity findByLoginAndPassword(String login,String Password);

}
