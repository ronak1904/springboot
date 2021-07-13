package spring.demo.storagegrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.demo.storagegrid.model.Usage;
import spring.demo.storagegrid.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
