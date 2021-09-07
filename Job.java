/**
 * @(#)Job.java
 *
 *
 * @author
 * @version 1.00 2021/5/31
 */


public class Job {
	private String role;
	private long salary;
	private int id;


	public String getRole(){
		return role;
	}//end getRole

	public void setRole(String role){
		this.role = role;
	}//end setRole


	public long getSalary(){
		return salary;
	}//end getSalary

	public void setSalary(long salary){
		this.salary = salary;
	}//end setSalary

	public int getId(){
		return id;
	}//end getId

	public void setId(int id){
		this.id = id;
	}//end setId

}//end job class