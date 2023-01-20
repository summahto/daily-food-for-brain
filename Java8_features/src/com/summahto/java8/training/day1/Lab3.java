package com.summahto.java8.training.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class ProcessEmp{

    private List<Employee> employees = new ArrayList<>();

    public ProcessEmp() {
        for(int i = 0; i< 100 ; i++){
            employees.add(new Employee("emp"+i, 100*(10*i), i));
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int countWithCondition(Predicate<Employee> predicate){
        int c =0;
        for(Employee e : employees){
            if(predicate.test(e))
                c++;
        }
        return c;
    }

}

public class Lab3 {

    public static void main(String[] args) {

        ProcessEmp p = new ProcessEmp();
        System.out.println(p.countWithCondition(e -> true));
        System.out.println(p.countWithCondition(e -> e.getSalary() > 40000));
        System.out.println(p.countWithCondition(e ->e.getSalary() > 5000 && e.getName().startsWith("emp2")));

        System.out.println("Count before delete : " + p.getEmployees().size());
        p.getEmployees().removeIf(e -> e.getSalary() >5000);
        System.out.println(("Count after delete : " + p.getEmployees().size()));

    }


}


