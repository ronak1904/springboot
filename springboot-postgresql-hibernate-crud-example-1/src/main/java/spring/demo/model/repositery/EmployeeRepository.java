package spring.demo.model.repositery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.demo.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
