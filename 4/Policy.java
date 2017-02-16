package com;

public class Policy 
{
	public int policyId;
	public String policyName;
	public double premiumAmount;
	public int duration;
	public Policy(int policyId, String policyName, double premiumAmount,
			int duration) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.premiumAmount = premiumAmount;
		this.duration = duration;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double sumAssured()
	{
		double sum=(premiumAmount*duration);
		return sum;
	}
	
}