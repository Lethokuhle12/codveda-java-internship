package com.system;

import java.util.*;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList();
        Scanner scan = new Scanner(System.in);
       
        EmployeeManagement empManager = new EmployeeManagement(employees);

        while(true){

            System.out.println("***Menu***\n0. View Employee List\n1. Add Employee\n2. Remove Employee"+
                            "\n3. Search for an Employee\n4. Update employee info\n5. Exit");
            int option =scan.nextInt();

                if(option ==0){

                    System.out.println(empManager.getAllEmployees());
                    
                }
                if(option ==1){
                    empManager.create(addEmployee());
                }
                else if(option ==2){

                   System.out.println(empManager.delete(getId()));

                }
                else if(option == 3){
                   
                   System.out.println(empManager.read(getId()));
                }
                else if(option ==4){
                    String id =getId();
                    System.out.println("Which field do you want to edit\n1.Name\n2.Surname\n3.Delegation\n4.Salary");
                    int field = scan.nextInt();                    

                   empManager.update(updateEmployee(field,id),field);

                }
                else if(option == 5)
                {
                  
                }
                

        }

    }
    public static String getId(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        return  scan.nextLine();
    }


    public static Employee addEmployee(){

          Scanner scan = new Scanner(System.in);
          Employee emp = new Employee();

          System.out.println("Employee name: ");
          emp.setName(scan.nextLine());
          System.out.println("Employee surnname: ");
          emp.setSurname(scan.nextLine());
          System.out.println("Employee Id: ");
          emp.setId(scan.nextLine());
          System.out.println("Employee delegation: ");
          emp.setDelegation(scan.nextLine());
          System.out.println("Employee Salary: ");
          emp.setSalary(scan.nextDouble());

          return emp;


    }
    public static Employee updateEmployee(int option, String id){

        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();

    

          emp.setId(id);
          switch(option){

            case 1:
                System.out.println("Employee name: ");
                emp.setName(scan.nextLine());
                break;
            case 2:
                System.out.println("Employee surnname: ");
                emp.setSurname(scan.nextLine());
                break;
            case 3:
                System.out.println("Employee delegation: ");
                emp.setDelegation(scan.nextLine());
                break;
            case 4:
                System.out.println("Employee Salary: ");
                emp.setSalary(scan.nextDouble());
                break;

          }


          return emp;

    }


}
