package spring.demo.storagegrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.demo.storagegrid.model.Usage;



public interface UsageRepository  extends JpaRepository<Usage, Long>{

}
