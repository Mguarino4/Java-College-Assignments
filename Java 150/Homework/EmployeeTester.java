/*
 * Michael Guarino
 * 09/2019
 * This is a tester for the Employee class that records information based on the: Name, Id Number, Department, and position affiliated with Employees.
 * This class uses accessor and mutator methods to store and retrieve the data in refernce variables 
 */
package Homework;

public class EmployeeTester {
	public static void main(String[] args) {
		
		
		//Creates the reference variables 
		Employee employee1 = new Employee();
		
		employee1.setName("Susan Meyers");
		employee1.setIdNumber(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");
		
		
		Employee employee2 = new Employee();
		
		//Sets the data assigned to the specific reference variable using Mutators
		employee2.setName("Mark Jones");
		employee2.setIdNumber(39119);
		employee2.setDepartment("IT");
		employee2.setPosition("Programmer");
		
		
		Employee employee3 = new Employee();
		
		employee3.setName("Joy Rodgers");
		employee3.setIdNumber(81774);
		employee3.setDepartment("Manufacturing");
		employee3.setPosition("Engineer");
		
		
		//Returns the value stored in each reference variable using Accessors
		System.out.println("Employees: Name, Id Number, Department, and Position");
		System.out.println(employee1.getName()+" "+employee1.getIdNumber()+" "+employee1.getDepartment()+" "+employee1.getPosition());
		System.out.println(employee2.getName()+" "+employee2.getIdNumber()+" "+employee2.getDepartment()+" "+employee2.getPosition());
		System.out.println(employee3.getName()+" "+employee3.getIdNumber()+" "+employee3.getDepartment()+" "+employee3.getPosition());
		
	}

}
