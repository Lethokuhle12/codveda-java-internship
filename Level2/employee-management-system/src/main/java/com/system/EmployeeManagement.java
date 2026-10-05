package com.system;

import java.util.List;

public class EmployeeManagement {

    public List<Employee> employees;

    public EmployeeManagement(List<Employee> employees){
         
        this.employees = employees;

    }
    public EmployeeManagement(){}

    public List<Employee> create(Employee employee){

        employees.add(employee);

        return employees;
    }

    public String delete(String id){

        boolean found =false;
        int index=0;

        for(Employee employee: employees)
        {
            if(employee.id.equalsIgnoreCase(id)){

                found=true;
            }
            else{
               index++;
            }
        }

        if(!found){
            return "Employee doesnt exist";
        }
        else{
            employees.remove(index);
            return "Employee "+id+" removed.";            
        }

    }
    
    public String read(String id){

        boolean found =false;
        int index=0;

        for(Employee employee: employees)
        {
            if(employee.id.equalsIgnoreCase(id)){

                found=true;
            }
            else{
               index++;
            }
        }

        if(!found){
           return "Employee not found!";
        }
        else{
           Employee employee = employees.get(index);
           return "Employee\nId: "+employee.id+"\nFull name: "+employee.name+" "+employee.surname+"\nDelegation: "+employee.delegation+"\nSalary: R"+employee.salary+"\n";        
        }
    
    }
    public String update(Employee updatedEmployee,int field){

        Employee employee = new Employee();
        boolean found=false;

        for(Employee emp: employees)
        {
            if(emp.id.equalsIgnoreCase(updatedEmployee.id)){

                if(field ==1){
                  emp.setName(updatedEmployee.getName());
                }
                else if(field ==2){
                   emp.setSurname(updatedEmployee.getSurname());
                }
                else if(field ==3){
                   emp.setDelegation(updatedEmployee.getDelegation());
                }
                else if(field ==4){
                   emp.setSalary(updatedEmployee.getSalary());
                }
                
                 employee=emp;
                 found=true;

                
            }
           
        }

        if(!found){

            return "Employee with id: "+updatedEmployee.id+" not found";
        }

        return "**Updated Employee**\nId: "+employee.id+"\nFull name: "+employee.name+" "+employee.surname+"\nDelegation: "+employee.delegation+"\nSalary: R"+employee.salary+"\n";        

   

    }
    public String getAllEmployees() {
        String employeeList="";
        int count=1;
        for(Employee employee: employees)
        {
            employeeList+="Employee "+count+"\nId: "+employee.id+"\nFull name: "+employee.name+" "+employee.surname+"\nDelegation: "+employee.delegation+"\nSalary: R"+employee.salary+"\n";
            count++;
        }

        return employeeList;

	}
	public List<Employee> getEmployees() {
		return employees;
	}




    

}
