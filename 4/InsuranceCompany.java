package com;
import com.LifeInsurancePolicy;

import java.util.ArrayList;

public class InsuranceCompany 
{
	private ArrayList<Policy> policyList= new ArrayList<Policy>();
	InsuranceCompany(ArrayList<Policy> arr1)
	{
	  policyList=arr1;
	}
	public ArrayList<Policy> getPolicyList()
	{
		return policyList;
	}
	public void setPolicyList(ArrayList<Policy> policyList)
	{
		this.policyList = policyList;
	}
	public boolean addPolicy(Policy p)
	{
	   int c=0;
	   if(p!=null)
	   {
		for(Policy pol:policyList)
		if(pol.getPolicyId()==p.getPolicyId())
		{
	      c++;
		}
	    if(c!=0)
	    {
		 return false;  
	    }
	    else
	    {
		   policyList.add(p);
		   return true;   
	    }
	   }
	   return false;
	}
	public ArrayList<Policy> searchPolicy(double a, int b)
	{
		int q=0;
		ArrayList<Policy> pl1=new ArrayList<Policy>();
		for(Policy pol:policyList)
		{
		   if(pol.getPremiumAmount()<=a && pol.getDuration()==b)
		{
			pl1.add(pol);
			q++;
		}
		   if(q!=0)
		   {
			   return pl1;
		   }
		}
		return null;
	}
	public ArrayList<Policy> getPolicylistByName(Policy[] parr, String s)
	{
		int q=0;
		ArrayList<Policy> pl1=new ArrayList<Policy>();
		for(Policy pol:policyList)
		{
			if(pol.getPolicyName()==s)
			{
				pl1.add(pol);
				q++;
			}
			if(q!=0)
			{
				return pl1;
			}
		}
		return null;
	}
    public double calculateSumAssured(int pid)
    {
    	int q=0;
    	double w=0;
    	for(Policy pol:policyList)
		{
			if(pol.policyId==pid)
			{
				w=pol.sumAssured();
				q++;
			}
			if(q!=0)
			{
				return w;
			}
		}
		return -1;
    	
    }
    public static void main(String[] args) 
	{
		
		Policy p1=new Policy(1,"abc",500.0,2);
		Policy p2=new Policy(2,"xyz",600.0,3);
		ArrayList<Policy> policyList= new ArrayList<Policy>();
		policyList.add(p1);
		policyList.add(p2);
		InsuranceCompany ic= new InsuranceCompany(policyList);
		Policy[]pol=new Policy[10];
		pol[0]=new Policy(1,"abc",500.0,2);
		pol[1]=new Policy(2,"xyz",600.0,3);
		
		System.out.println(ic.addPolicy(p1));
		System.out.println(ic.addPolicy(p2));
		System.out.println(ic.searchPolicy(500.0, 2));
		System.out.println(ic.getPolicylistByName(pol,"a"));
		System.out.println(ic.calculateSumAssured(1));

	}

}
