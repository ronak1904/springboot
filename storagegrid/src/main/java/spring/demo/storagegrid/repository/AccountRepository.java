package spring.demo.storagegrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.demo.storagegrid.model.Account;


public interface AccountRepository extends JpaRepository<Account, Long>{

}
