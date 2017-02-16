package com;
import com.Customer;
import com.Room;
public interface Hotel
{
	public int addCustomer(Customer c);
	public int addRoom(Room r);
	public int allocateRoom(String s);

}
