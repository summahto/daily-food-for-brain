package io.newfeatures.day2;

public class Employee {


        private String name;
        private double salary;
        private int empno;
        private String project;

        public Employee(String name, double salary, int empno, String project) {
            this.name = name;
            this.salary = salary;
            this.empno = empno;
            this.project = project;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empno=" + empno +
                '}';
    }

    public int getEmpno() {
            return empno;
        }

        public void setEmpno(int empno) {
            this.empno = empno;
        }



}
