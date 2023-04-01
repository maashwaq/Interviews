1. Create a Database Integration via Hibernate or Spring Data with code

Basic example of database integration using Hibernate and Spring Data.

First, let's start with creating a simple database table using MySQL:

CREATE TABLE employee (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  age int(11) NOT NULL,
  salary double NOT NULL,
  PRIMARY KEY (id)
);
Next, we will create a Java entity class called Employee to represent the database table:

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private double salary;

    // getters and setters
}
We will also create a DAO (Data Access Object) interface called EmployeeRepository which extends the JpaRepository interface provided by Spring Data JPA:

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
Now, let's create a service class called EmployeeService which will use the EmployeeRepository to interact with the database:


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void saveOrUpdateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
Finally, we can use the EmployeeService in a controller class to handle HTTP requests and responses:

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        employeeService.saveOrUpdateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
That's it! Now we have a simple database integration using Hibernate and Spring Data. We can use this example as a starting point for more complex applications.

