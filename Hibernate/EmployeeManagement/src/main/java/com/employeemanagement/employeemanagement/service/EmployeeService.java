package com.employeemanagement.employeemanagement.service;

import java.util.List;

import com.employeemanagement.employeemanagement.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(long id);
    Employee updatEmployee(Employee employee,long id);
    void deleteEmployee(long id);
}
//https://www.npmjs.com/package/react-router-dom