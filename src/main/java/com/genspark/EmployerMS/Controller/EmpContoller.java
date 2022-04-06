package com.genspark.EmployerMS.Controller;

import com.genspark.EmployerMS.Entity.Employee;
import com.genspark.EmployerMS.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
//@Controller
public class EmpContoller {
    @Autowired
    private EmpService empService;
    @GetMapping("/home")
    public String home(){
        return "<HTML><H1>Hello this is home page </H1></HTML>";
    }

    @GetMapping("/employers")
    public List<Employee> getEmployers(){
        return this.empService.getAllEmployees() ;
    }
    @GetMapping("/Employers/{Id}")
    public Employee getEmployee(@PathVariable String Id){
        return  this.empService.getEmployee(Integer.parseInt(Id));
    }
    @PostMapping("/employers")
    public Employee addEmployee( @RequestBody Employee emp){
        return this.empService.addEmployee(emp);
    }
    @PutMapping ("/employers")
    public Employee putEmployee( @RequestBody Employee emp){
        return this.empService.update(emp);
    }
   @DeleteMapping("/Employers/{Id}")
    public String deleteEmployee(@PathVariable String Id){
        return  this.empService.Delete(Integer.parseInt(Id));
    }
}
