package com;

public class Bus 
{
	private String source;
	private String destination;
	private int seats;
	private int occupiedSeats;
	private int busNumber;
	public Bus()
	{
		
	}
	public Bus(String source, String destination, int seats, int occupiedSeats, int busNumber) 
	{
		this.source = source;
		this.destination = destination;
		this.seats = seats;
		this.occupiedSeats = occupiedSeats;
		this.busNumber = busNumber;
	}
	public String getSource()
	{
		return source;
	}
	public void setSource(String source)
	{
		this.source = source;
	}
	public String getDestination() 
	{
		return destination;
	}
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	public int getSeats() 
	{
		return seats;
	}
	public void setSeats(int seats)
	{
		this.seats = seats;
	}
	public int getOccupiedSeats() 
	{
		return occupiedSeats;
	}
	public void setOccupiedSeats(int occupiedSeats)
	{
		this.occupiedSeats = occupiedSeats;
	}
	public int getBusNumber() 
	{
		return busNumber;
	}
	public void setBusNumber(int busNumber)
	{
		this.busNumber = busNumber;
	}

}
