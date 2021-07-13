package spring.demo.storagegrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.demo.storagegrid.model.Bucket;


public interface BucketRepository extends JpaRepository<Bucket, Long>{

}
