/**
 * @(#)Person.java
 *
 *
 * @author
 * @version 1.00 2021/5/31
 */


public class Person {

	//composition has-a relationship
	private Job job;

    public Person() {
    	this.job = new Job();
    	job.setSalary(1000L);
    }//end constructor

    public long getSalary(){
    	return job.getSalary();
    }//end setSalary


}