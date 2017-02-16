package com;

public class Books
{
	private int BookId;
	private String BookTitle;
	private String Author;
	private int NoOfCopies;
	public Books()
	{
		
	}
	public Books(int bookId, String bookTitle, String author, int noOfCopies)
	{
		super();
		BookId = bookId;
		BookTitle = bookTitle;
		Author = author;
		NoOfCopies = noOfCopies;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getNoOfCopies() {
		return NoOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		NoOfCopies = noOfCopies;
	}
	
	

}
