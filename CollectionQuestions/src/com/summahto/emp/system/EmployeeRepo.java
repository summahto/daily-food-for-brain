package com.summahto.emp.system;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepo {

    private Map<Integer, Employee> Employees = new HashMap<>();

    public void addEmployee(Employee e){
        if(Employees.containsKey(e.getId())){
            System.out.println("Employee already added to the repo: Try again with a different employee");
        }else {
            Employees.put(e.getId(), e);
        }
    }

    public Employee deleteEmployee(int id){
        if(!Employees.containsKey(id)){
            throw new EmployeeNotFoundException("Employee not found with ID : " + id);
        }
        Employee toBeDeleted = Employees.get(id);
        Employees.remove(id);
        return toBeDeleted;
    }

    public void display(){
        System.out.println(Employees.toString());
    }


}
