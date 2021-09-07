/**
 * @(#)TestPerson.java
 *
 *
 * @author
 * @version 1.00 2021/5/31
 */


public class TestPerson {

    public static void main(String args[]) {
    	Person person = new Person();
    	long salary = person.getSalary();

    	System.out.println("Salary of person: " + salary);

    }//end main


}//end class