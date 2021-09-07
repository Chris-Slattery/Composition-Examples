/**
 * @(#)Library.java
 *
 *
 * @author
 * @version 1.00 2021/5/31
 */

import java.util.*;


public class Library {

	//Reference to refer to list of books
	private final List<Book> books;

    public Library(List<Book> books) {
    	this.books = books;
    }

    public List<Book> getTotalBooksInLibrary(){
    	return books;
    }//end getTotalBooksInLibrary method


}