/**
 * @(#)Test.java
 *
 *
 * @author
 * @version 1.00 2021/5/31
 */

import java.util.*;


public class Test {

    public static void main(String args[]) {

    	//Create objects of Book class.
    	Book b1 = new Book("Effective Java", "Joshua Bloch");
    	Book b2 = new Book("Thinking in Java", "Bruce Eckel");
    	Book b3 = new Book("Java: The Compleet Reference", "Herbert Schildt");

    	//Create the list which contains the number of books
    	List<Book> books = new ArrayList();
    	books.add(b1);
    	books.add(b2);
    	books.add(b3);

    	Library library = new Library(books);

    	List<Book> bks = library.getTotalBooksInLibrary();
    	for(Book bk : bks){
    		System.out.println("Title: " + bk.title + " and " + " Author: " + bk.author);

    	}//end for


    }//end main

}