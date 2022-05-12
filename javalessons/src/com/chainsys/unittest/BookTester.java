package com.chainsys.unittest;
import com.chainsys.classmethods.Book;
/**
 *
 * @author babu3107
 *
 */
public class BookTester {
		public BookTester() {
			Book firstBook=new Book("2 Season");
			firstBook.setAuthorName("sabatham");
			firstBook.setStory("action");
			firstBook.setYearOfRelease(2009);
			firstBook.setPlaceOfRelease("Delhi");
			System.out.println(firstBook.getBookName());
			System.out.println(firstBook.getAuthorName());
			System.out.println(firstBook.getStory());
			System.out.println(firstBook.getYearOfRelease());
			System.out.println(firstBook.getPlaceOfRelease());
		}

	}


