package io.newfeatures.day2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpGenerate {

    private List<Employee> empList = new ArrayList<>();

    public List<Employee> getList(int n){
        String [] names = {"Sheila", "leela", "evan", "Rachel", "Vaishali", "Imran", "Vikas" };
        String [] project = {"project1", "project2", "project3"};
        for(int i =0 ; i< n; i++){
            empList.add(new Employee(names[i% names.length], i*1000, i, project[i%3]));
        }
        return empList;

    }
    public static void main(String[] args) {

        EmpGenerate empGenerator = new EmpGenerate();
        List<Employee> employees = empGenerator.getList(15);

        employees.forEach(System.out::println);
//        employees.stream().map(e->e.getName()).distinct().collect(Collectors.toList()).forEach(System.out::println);

        Map<String, Optional<Employee>> maxSalaryByPerson = employees.stream().
                                collect(Collectors.groupingBy(Employee::getName, Collectors.maxBy((e1 , e2) -> Double.compare(e1.getSalary(), e2.getSalary()) )));
//        System.out.println(maxSalaryByPerson);

//        employees.stream().collect(Collectors.groupingBy(Employee::getName , Collectors.reducing( )));

//        employees.stream().skip(20).limit(5).forEach(System.out::println);

        //for Debugging purposes use peek method
//        String [] names = {"Sheila", "leela", "evan", "Simran", "Vaishali", "Imran", "Vikas" };
//        Stream.of(names).peek(e-> System.out.println("peek 1 - " + e))
//                .filter(str -> str.length()>5)
//                .peek(e -> System.out.println("peek2 -" + e)).forEach(System.out::println);

    }
}
