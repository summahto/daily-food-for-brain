package com.summahto.java8.training.day2;

import com.summahto.java8.training.day1.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmpManager {
    private List<Employee> employees = new ArrayList<>();

    public void insert(Employee e){
        employees.add(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Optional<Employee> getEmployee(int enpNo){
        for(Employee e : employees){
            if(e.getEmpno() == enpNo)
                return Optional.of(e);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        EmpManager manager = new EmpManager();

        for(int i =0 ; i< 10 ; i++){
            Employee e = new Employee("emp" +i,  1000*i, i);
            manager.insert(e);
        }

        Optional<Employee> e = manager.getEmployee(5);
        if(e.isPresent())
            System.out.println("Employee 5 found  : " + e.get().getName() );
        else
            System.out.println("Emp 5 does not exist");

        manager.getEmployee(8).ifPresent(emp -> System.out.println(emp.getName()));
    }
}
