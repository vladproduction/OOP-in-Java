package com.app.vp.chapter_8_SOLID.SRP;


import java.util.HashSet;
import java.util.Set;

/**
 * class responsible to make operations with Data Base
 */
public class EmployeeDB {

    //imitation DB:
    private static final Set<Employee> employeeSet = new HashSet<>();

    //imitation add operation model into DB:
    public void insert(Employee employee) {
        employeeSet.add(employee);

    }

    //imitation find model from DB:
    public Employee select(Long id) {
        for (Employee employee : employeeSet) {
            if(employee.getId().equals(id)){
                return employee;
            }
        }
        return null;
    }


}
