package com;
import java.util.ArrayList;

import com.Books;
public class IRC_Store 
{
	private ArrayList<Books> BookList=new ArrayList<Books>();
	public int addBook(Books b)
	{
		if(b!=null)
		{
			for(Books bk: BookList)
			{
				if((bk.getBookId()==b.getBookId()) &&(bk.getBookTitle()==b.getBookTitle()) )
				{
					return bk.getNoOfCopies()+1;
				}
			}
			BookList.add(b);
			return BookList.size();
		}
		
		return -1;
	}
	public Books searchBook(int a)
	{
		if(a!=0)
		{
			for(Books bk:BookList)
			{
				if(bk.getBookId()==a)
				{
					return bk;
				}
			}
		}
		return null;
	}
	public void allocateBook(int al)
	{
		if(al!=0)
		{
			for(Books bk:BookList)
			{
				if(bk.getNoOfCopies()>=1 && bk.getBookId()==al)
				{
					System.out.println("book has been allocated");
				}
				else if(bk.getNoOfCopies()==0 && bk.getBookId()==al)
				{
					System.out.println("no copy available");
				}
			}
			if(searchBook(al)==null)
			{
				System.out.println("book with given id not found");
			}
		}
	
	}
	public static void main(String[] args)
	{
		IRC_Store irc=new IRC_Store();
		ArrayList<Books> BookList=new ArrayList<Books>();
		Books b1=new Books(111, "tintin", "tinni", 2);
		Books b2=new Books(222, "doraemon", "sayak", 3);
		BookList.add(b1);
		BookList.add(b2);
		System.out.println(irc.addBook(b1));
		System.out.println(irc.addBook(b2));
		System.out.println(irc.searchBook(111));
	    System.out.print(irc.allocateBook(222));
		
		
	}
}
