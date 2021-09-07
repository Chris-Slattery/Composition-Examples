/**
 * @(#)Bank.java
 *
 *
 * @author
 * @version 1.00 2021/5/31
 */


class Bank {

	private String name;

    public Bank(String name) {
    	this.name = name;
    }//end constructor

    public String getBankName(){
    	return this.name;
    }//end getBankName method

}//end Bank class


class Employee{

	private String name;

	public Employee(String name){
		this.name = name;
	}//end consturctor

	public String getEmployeeName(){
		return this.name;
	}//end getEmployeeName emthod
}//end Employee class

class Association{

	public static void main(String args[]){
		Bank bank = new Bank("AIB");
		Employee emp = new Employee("Chris");

		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());

	}//edn main

}//end Test class