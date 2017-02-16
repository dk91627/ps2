package com;
import com.Student;
import com.College;

import java.util.ArrayList;

public class RTCBussPassManagement implements RTCDepartment
{
	private ArrayList<Student> stuList=new ArrayList<Student>();
	private ArrayList<College> collegeList=new ArrayList<College>();
	public RTCBussPassManagement() 
	{
		
	}
	public int addCollege(College c)
	{
		if(c == null)
			return 0;	
		  for(College clg:collegeList)
		  {
			if(clg.getCollegeId()==c.getCollegeId())
			{
				return collegeList.size();
			}
			
		  }
		  collegeList.add(c);
		return collegeList.size();
		
	}
	public int addStudent(Student s)
	{
		if(s == null)
			return 0;
		  for(Student std:stuList)
		  {
			if(std.getStudId()==s.getStudId())
			{
				return stuList.size();
			}
			
		  }
		  stuList.add(s);
			return stuList.size();
		
	}
	public int provideBuspass(String bp)
	{

		for(Student std:stuList)
		{
			if(std.getStudId()>0)
			{
				if(std.getBuspassType().equals(bp) && std.isBuspassProvided()==false)
				{
					std.setBuspassProvided(true);
					return std.getStudId();
				}
				else if(std.getBuspassType().equals(bp) && std.isBuspassProvided()==true)
				{
					return 0;
				}
			}
		}
		return stuList.size();
		
	}
	public static void main(String[] args)
	{
		RTCBussPassManagement rtc=new RTCBussPassManagement();
		ArrayList<College> collegeList=new ArrayList<College>();
		College c1=new College("heritage", 111, "kolkata");
		College c2=new College("besu", 222, "howrah");
		collegeList.add(c1);
		collegeList.add(c2);
		System.out.println(rtc.addCollege(c1));
		System.out.println(rtc.addCollege(c2));
		
		ArrayList<Student> stuList=new ArrayList<Student>();
		Student s1=new Student(1, "ac", false);
		Student s2=new Student(2, "nonac", false);
		stuList.add(s1);
		stuList.add(s2);
		System.out.println(rtc.addStudent(s1));
		System.out.println(rtc.addStudent(s2));
		System.out.println(rtc.provideBuspass("nonac"));
	}
		
	

}
