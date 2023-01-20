package com.summahto.emp.system;

public class Driver {

    public static void main(String[] args) {

        Employee e1 = new Employee(100, "Ravi");
        Employee e2 = new Employee(101, "Steven");
        Employee e3 = new Employee(102, "Danny");
        Employee e4 = new Employee(103, "Dylan");
        Employee e5 = new Employee(104, "Bob");

        EmployeeRepo repo = new EmployeeRepo();
        repo.addEmployee(e1);
        repo.addEmployee(e2);
        repo.addEmployee(e3);
        repo.addEmployee(e4);
        repo.addEmployee(e5);


//        repo.deleteEmployee(10);
        repo.display();

        repo.deleteEmployee(103);
        repo.display();

        repo.addEmployee(e1);

    }
}
