package com.xworkz.employee.dto;

public class EmployeeDTO {
    private int id;
    private String employeeName;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeDTO(int id, String employeeName, double salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.salary = salary;
    }
}
