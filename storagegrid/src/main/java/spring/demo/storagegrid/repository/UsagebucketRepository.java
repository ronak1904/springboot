package spring.demo.storagegrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import spring.demo.storagegrid.model.Usagebucket;

public interface UsagebucketRepository  extends JpaRepository<Usagebucket, Long>{

}
