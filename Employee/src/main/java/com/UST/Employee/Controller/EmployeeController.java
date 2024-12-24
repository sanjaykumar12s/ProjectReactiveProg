package com.UST.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.Employee.Model.Employee;
import com.UST.Employee.Model.Status;  // Import Status enum
import com.UST.Employee.Service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")  // Base URL for Employee-related operations
public class EmployeeController {

    @Autowired 
    private EmployeeService employeeService;

    // Endpoint to add a new employee
    @PostMapping("/addemployee")
    public Mono<Employee> addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Endpoint to find an employee by ID
    @GetMapping("/{id}")
    public Mono<Employee> getEmployeeById(@PathVariable String id) {
        return employeeService.findById(id);
    }

    // Endpoint to get all employees
    @GetMapping("/getallemployee")
    public Flux<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Endpoint to get employees by SkillSet
    @GetMapping("/skills/{skillSet}")
    public Flux<Employee> getEmployeesBySkillSet(@PathVariable("skillSet") String skillSet) {
        return employeeService.findBySkillSet(skillSet);
    }

    // Endpoint to get employees by Status
    @GetMapping("/status/{status}")
    public Flux<Employee> getEmployeesByStatus(@PathVariable Status status) {
        return employeeService.findByStatus(status);  // Fetch employees by status
    }
}
