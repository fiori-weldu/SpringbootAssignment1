package com.genspark.EmployerMS.Service;

import com.genspark.EmployerMS.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmpService {

    List<Employee> getAllEmployees();
    Employee getEmployee(int Id);
    Employee addEmployee(Employee emp);
    Employee update(Employee emp);
    String Delete(int id);


}
