package com.nt.comp;

public class BlueDart implements Courier
{
	public BlueDart()
	{
		System.out.println("BlueDart.BlueDart()");
	}
	public String deliver(int oid)
	{
		return "Deliver order which order id :"+oid+" from BlueDart";
	}
}