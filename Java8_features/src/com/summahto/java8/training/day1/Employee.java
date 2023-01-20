package com.summahto.java8.training;

public class Employee {


    private String name;
    private int salary;
    private int empno;

    public Employee(String name, int salary, int empno) {
        this.name = name;
        this.salary = salary;
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

}
