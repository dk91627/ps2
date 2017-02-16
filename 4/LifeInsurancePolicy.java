package com;

public class LifeInsurancePolicy extends Policy
{
    String nominee;
    LifeInsurancePolicy(int id, String n, double p, int d, String no)
    {
    	super(id, n, p,d);
    	nominee=no;
    }
	public String getNominee()
	{
		return nominee;
	}
	public void setNominee(String nominee) 
	{
		this.nominee = nominee;
	}
	public double sumAssured()
	{
		double sum1=(premiumAmount*duration)+ 0.01*premiumAmount;
		return sum1;
	}
    
    
}
