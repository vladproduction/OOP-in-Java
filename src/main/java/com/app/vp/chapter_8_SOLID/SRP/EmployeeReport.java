package com.app.vp.chapter_8_SOLID.SRP;


/**
 * class responsible to make report for related operations
 * */
public class EmployeeReport {

    public void generateReport(Employee employee){

        System.out.println("REPORT (id employee: " + employee.getId() + "): ");
        System.out.println("\t" + employee);

    }
}
