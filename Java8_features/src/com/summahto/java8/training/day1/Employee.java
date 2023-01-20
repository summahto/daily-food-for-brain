package com.summahto.java8.training.day1;

public class Employee {


    private String name;
    private double salary;
    private int empno;

    public Employee(String name, double salary, int empno) {
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

    public double getSalary() {
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
