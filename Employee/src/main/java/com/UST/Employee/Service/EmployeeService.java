package com.UST.Employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.Employee.Model.Employee;
import com.UST.Employee.Model.Status;  // Import Status enum
import com.UST.Employee.Repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {

    @Autowired 
    private EmployeeRepository employeeRepository;

    // Method to add an employee
    public Mono<Employee> addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Method to find an employee by ID
    public Mono<Employee> findById(String id) {
        return employeeRepository.findById(id);
    }

    // Method to fetch all employees
    public Flux<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Method to fetch employees by skillSet
    public Flux<Employee> findBySkillSet(String skillSet) {
        return employeeRepository.findBySkillSet(skillSet);
    }

    // Method to fetch employees by status
    public Flux<Employee> findByStatus(Status status) {
        return employeeRepository.findByStatus(status);  // Fetch employees by status
    }
}
