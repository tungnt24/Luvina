/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamCollect;
 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Hung
 */
 

public class Employee2Contains { 
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Employee2> listEmployees = new ArrayList<>();
        Employee2 employee1 = new Employee2("Tom", "Eagar", dateFormat.parse("2007-12-03"));
        Employee2 employee2 = new Employee2("Tom", "Smith", dateFormat.parse("2005-06-20"));
        Employee2 employee3 = new Employee2("Bill", "Joy", dateFormat.parse("2009-01-31"));
        Employee2 employee4 = new Employee2("Bill", "Gates", dateFormat.parse("2005-05-12"));
        Employee2 employee5 = new Employee2("Alice", "Wooden", dateFormat.parse("2009-01-22"));
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);
        listEmployees.add(employee4);
        listEmployees.add(employee5);
       
         Employee2 employee = new Employee2("Bill", "Joy"     , dateFormat.parse("2009-01-31"));
     
         Boolean b= listEmployees.contains(employee);
         if (b)
             System.out.println("Found"); else System.out.println("Not found");
         System.out.println(employee.toString());
       //  Collections.sort(listEmployees);
    }
}
