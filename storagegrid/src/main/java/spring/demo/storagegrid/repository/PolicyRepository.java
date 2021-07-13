package spring.demo.storagegrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import spring.demo.storagegrid.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {

}
