package com;

import java.util.ArrayList;

public class SubhYatra 
{
	private ArrayList<Bus> busList=new ArrayList<Bus>();
	private ArrayList<Passenger> passenList=new ArrayList<Passenger>();
	private ArrayList<Booking> bookingList=new ArrayList<Booking>();
	
	public int addPassenger(Passenger p)
	{
		if(p!=null)
		{
			for(Passenger psn: passenList)
			{
				if(psn.getPhoneNumber()==p.getPhoneNumber() )
				{
					return passenList.size();
				}
			}
			passenList.add(p);
			return passenList.size();
		}
		
		return -1;
		
	}
	public int addBus(Bus b)
	{
		if(b!=null)
		{
			for(Bus bs: busList)
			{
				if(bs.getBusNumber()==b.getBusNumber() )
				{
					return busList.size();
				}
			}
			busList.add(b);
			return busList.size();
		}
		
		return -1;
		
	}
	public int allocateSeat(Passenger pa, Bus ba)
	{
		int f=0;
		if(pa!=null && ba!=null)
		{
			for(Booking bk:bookingList)
			{
				if(bk.getPassenPhoneNumber()==pa.getPhoneNumber() && bk.getBusNumber()==ba.getBusNumber())
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				if((ba.getSeats()-ba.getOccupiedSeats())>0)
				{
					Booking bkng=new Booking();
					bkng.setBusNumber(ba.getBusNumber());
					bkng.setPassenPhoneNumber(pa.getPhoneNumber());
					ba.setOccupiedSeats(ba.getOccupiedSeats()+1);
					bookingList.add(bkng);
					
				}
			}
			return bookingList.size();
		}
	return -1;	
	}
	public static void main(String[] args)
	{
		SubhYatra subh=new SubhYatra();
		ArrayList<Passenger> passenList=new ArrayList<Passenger>();
		Passenger p1=new Passenger("soumi", 22, "4567");
		Passenger p2=new Passenger("sohini",23, "6789");
		passenList.add(p1);
		passenList.add(p2);
		System.out.println(subh.addPassenger(p1));
		System.out.println(subh.addPassenger(p2));
		
		ArrayList<Bus> busList=new ArrayList<Bus>();
		Bus b1=new Bus("abc", "kolkata", 30, 3, 111);
		Bus b2=new Bus("xyz", "mumbai", 2, 2, 222);
		busList.add(b1);
		busList.add(b2);
		System.out.println(subh.addBus(b1));
		System.out.println(subh.addBus(b2));
		System.out.println(subh.allocateSeat(p1, b1));
		System.out.println(subh.allocateSeat(p2, b2));
		
		
	}
	

}