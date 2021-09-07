/**
 * @(#)College.java
 *
 *
 * @author
 * @version 1.00 2021/5/31
 */

//Program to illustrate Composition in java.
//Composition implements a has-a relationship. One object contains another object and that object is fully dependent
//on it. It is a technique in which we can describe a reference between 2 or more class and for that we use a
//instance variable, which should be created before it is used.

import java.io.*;
import java.util.*;

class College {

	public String name;
	public String address;

    public College(String name, String address) {
    	this.name = name;
    	this.address = address;
    }//end constructor

}//end class

//University has more than one college
class University{
	private final List<College> colleges;

	University(List<College> colleges){
		this.colleges = colleges;
	}//end constructor

	//Get total number of colleges
	public List<College> getTotalCollegesInUniversity(){
		return colleges;
	}//end get method

}//end uni class


class TestCollege{

	public static void main(String args[]){
		//Create objects of college class
		College c1 = new College("ITB", "Dublin");
		College c2 = new College("UCC", "Cork");
		College c3 = new College("Limerick Univeristy", "Limerick");


		//Create list which contains the number of colleges
		List<College> college = new ArrayList<College>();
		college.add(c1);
		college.add(c2);
		college.add(c3);


		University university = new University(college);
		List<College> colleges = university.getTotalCollegesInUniversity();

		//enhanced for loop to loop through colleges array list
		for(College cg : colleges){
			System.out.println("Name: " + cg.name + " Address: " + cg.address);
		}//end for








	}//end main
}//end class

