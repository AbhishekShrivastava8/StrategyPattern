package com.nt.comp;

public class FedEx implements Courier
{
	public FedEx()
	{
		System.out.println("FedEx.FedEx()");
	}
	public String deliver(int oid)
	{
		return "Deliver order which order id :"+oid+" from FedEx";
	}
}