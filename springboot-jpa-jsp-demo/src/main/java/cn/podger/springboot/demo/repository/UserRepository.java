package cn.podger.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import cn.podger.springboot.demo.entity.User;
@Component
public interface UserRepository extends JpaRepository<User, Long> {
 
}
