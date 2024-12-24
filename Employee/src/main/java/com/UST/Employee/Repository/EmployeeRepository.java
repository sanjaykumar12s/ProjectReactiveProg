package com.UST.Employee.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import com.UST.Employee.Model.Employee;
import com.UST.Employee.Model.Status;  // Import the Status enum

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {

    // Custom query method to fetch employees by skillSet
    Flux<Employee> findBySkillSet(String skillSet);

    // Custom query method to fetch employees by status
    Flux<Employee> findByStatus(Status status);  // Query by Status

}
