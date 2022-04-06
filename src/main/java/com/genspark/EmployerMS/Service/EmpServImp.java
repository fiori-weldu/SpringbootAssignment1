package com.genspark.EmployerMS.Service;

import com.genspark.EmployerMS.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmpServImp implements EmpService {
    List<Employee> empList;
    public EmpServImp() {
       empList = new ArrayList<>();
        Employee emp1= new Employee(101, "Abebe", "Belay", "Abebe123@gmail.com");
        Employee emp2= new Employee(102, "Kebebe", "Telay", "Keebe9923@gmail.com");
        Employee emp3= new Employee(103, "Fiori", "kib", "Fiorit123@gmail.com");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

    }

    @Override


    public List<Employee> getAllEmployees() {
        return empList;
    }

    @Override
    public Employee getEmployee(int Id) {
        Employee c= null;
        for (Employee emp: empList
             ) {
            if (emp.getId()==Id){
                c= emp;
                break;
            }

        }
        return c;
    }

    @Override
    public Employee addEmployee(Employee emp) {
        empList.add(emp);
        return emp;
    }

    @Override
    public Employee update(Employee emp) {
        String lN= emp.getLastName();
        String email= emp.getEmail();
        Employee c=null;
        for (Employee e:empList
             ) {
            if (emp.getId()==e.getId()){
                e.setLastName(lN);
                e.setEmail(email);
                c=e;
                break;
            }

        }

        return c;
    }

    @Override
    public String Delete(int id) {
        for (Employee e:empList
        ) {
            if (id==e.getId()){
                empList.remove(e);
                break;
            }

        }

        return "Deleted successfuly";

    }
}
