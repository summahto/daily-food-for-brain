package com.summahto.emp.system;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String errorMessage){
        super(errorMessage);
    }

    public EmployeeNotFoundException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

}
