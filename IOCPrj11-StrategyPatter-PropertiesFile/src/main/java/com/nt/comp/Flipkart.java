package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart
{
	private Courier courier;
	public Flipkart()
	{
		System.out.println("Flipkart.Flipkart()");
	}
	public void setCourier(Courier courier)
	{
		this.courier = courier;
	}
	public String shopping(String[] items, float[] price)
	{
		float billAmt = 0.0f;
		for(float p : price)
		{
			billAmt += p;
		}
		int oid = new Random().nextInt(10000);
		String msg = courier.deliver(oid);
		return Arrays.toString(items)+" with prices "+Arrays.toString(price)+" having bill Amt: "+billAmt+" :: "+msg;
	}
}