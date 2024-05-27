package com.nt.comp;

public class DTDC implements Courier
{
	public DTDC()
	{
		System.out.println("DTDC.DTDC()");
	}
	public String deliver(int oid)
	{
		return "Deliver order which order id :"+oid+" from DTDC";
	}
}