package com.app.vp.chapter_8_SOLID.SRP;

public class Main {
    public static void main(String[] args) {

        //create some models:
        Employee emp1 = new Employee(1L, "John", 3500.00);
        Employee emp2 = new Employee(2L, "Bob", 6500.00);
        Employee emp3 = new Employee(3L, "Garry", 2500.00);

        //insert to DB:
        EmployeeDB employeeDB = new EmployeeDB();
        employeeDB.insert(emp1);
        employeeDB.insert(emp2);
        employeeDB.insert(emp3);

        //find by id from DB:
        Employee selected_1 = employeeDB.select(emp1.getId());
        Employee selected_2 = employeeDB.select(emp2.getId());


        //making report
        EmployeeReport report = new EmployeeReport();
        report.generateReport(selected_1);
        report.generateReport(selected_2);

    }
}
