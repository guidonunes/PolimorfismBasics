package br.com.example.view;

import br.com.example.model.Employee;
import br.com.example.model.SalesForce;

public class EmployeeView {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getGreeting());

        SalesForce salesForce = new SalesForce();
        System.out.println(salesForce.getGreeting());

        Employee test = new SalesForce();
        System.out.println(test.getGreeting());
        System.out.println(((SalesForce)test).getBonus());
    }
}
