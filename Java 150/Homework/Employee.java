/*
 * Michael Guarino
 * 09/2019
 * This the Employee class that records information based on the: Name, Id Number, Department, and position affiliated with Employees.
 * This class uses accessor and mutator methods to store and retrieve the data in refernce variables 
 */

package Homework;

public class Employee {
	
	// Defines the variables name,idNumber,departments, and position as private variables
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	//These are the setters or Mutators they will set the values of the variables based on and stored by a given reference variable
	public void setName(String name)
	{
		this.name = name;
	}
	public void setIdNumber(int idNumber)
	{
		this.idNumber = idNumber;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	
	
	//These are the getters or Accessors they will return data assigned to a specific refernce variable 
	public String getName()
	{
		return name;
	}
	public int getIdNumber()
	{
		return idNumber;
	}
	public String getDepartment()
	{
		return department;
	}
	public String getPosition()
	{
		return position;
	}

}
