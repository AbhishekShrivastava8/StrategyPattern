package com.nt.bo;

public class CustomerBO
{
	private String custName;
	private String custAddrs;
	private float pamt;
	private float time;
	private float rate;
	private float intrestAmount;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddrs() {
		return custAddrs;
	}
	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}
	public float getPamt() {
		return pamt;
	}
	public void setPamt(float pamt) {
		this.pamt = pamt;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getIntrestAmount() {
		return intrestAmount;
	}
	public void setIntrestAmount(float intrestAmount) {
		this.intrestAmount = intrestAmount;
	}
}