package com;

import java.util.ArrayList;

public class GulmoharGrandHotel implements Hotel
{
	private ArrayList<Room> roomList=new ArrayList<Room>();
	private ArrayList<Customer> custList=new ArrayList<Customer>();
	public GulmoharGrandHotel()
	{
		
	}
	@Override
	public int addCustomer(Customer c) 
	{
		if(c!=null)
		{
			for(Customer cust: custList)
			{
				if((cust.getCustomerName()==c.getCustomerName()) &&(cust.getPassportNo()==c.getPassportNo()) )
				{
					return custList.size();
				}
			}
			custList.add(c);
			return custList.size();
		}
		
		return -1;
		
	}
	@Override
	public int addRoom(Room r) 
	{
		if(r!=null)
		{
			for(Room rm: roomList)
			{
				if(rm.getRoomNo()==r.getRoomNo())
				{
					return roomList.size();
				}
			}
			roomList.add(r);
			return roomList.size();
		}
		
		return -1;
		
		
	}
	@Override
	public int allocateRoom(String s) 
	{
		if(s!="ac" && s!="nonac"  )
		{
			return -1;
		}
		for(Room arm:roomList)
		{
			if(arm.getRoomType().equals(s) && arm.isRoomOccupied()==false)
			{
				arm.setRoomOccupied(true);
				return arm.getRoomNo();
			}
		}
		return 0;
		
	}
	public static void main(String[] args)
	{
		GulmoharGrandHotel ggh=new GulmoharGrandHotel();
		ArrayList<Room> roomList=new ArrayList<Room>();
		Room r1=new Room(1, "ac");
		Room r2=new Room(2, "nonac");
		roomList.add(r1);
		roomList.add(r2);
		System.out.println(ggh.addRoom(r1));
		System.out.println(ggh.addRoom(r2));
		
		ArrayList<Customer> custList=new ArrayList<Customer>();
		Customer c1=new Customer("sourav", 22, "bk222");
		Customer c2=new Customer("sachin", 23, "nm111");
		custList.add(c1);
		custList.add(c2);
		System.out.println(ggh.addCustomer(c1));
		System.out.println(ggh.addCustomer(c2));
		System.out.println(ggh.allocateRoom("nonac"));
		
	}
}
	
	


