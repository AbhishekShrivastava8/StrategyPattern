package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO
{
	private DataSource ds;
	private String REALTIME_CUSTOMER_INSERT = "INSERT INTO REALTIMEDI_CUSTOMER VALUES(?,?,?,?,?,?,?)";
	public CustomerDAOImpl(DataSource ds)
	{
		this.ds = ds;
	}
	public int insert(CustomerBO bo) throws Exception
	{
		Connection con;
		int count = 0;
		try
		{
			con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(REALTIME_CUSTOMER_INSERT);
			pst.setInt(1, new Random().nextInt(1000));
			pst.setString(2, bo.getCustName());
			pst.setString(3, bo.getCustAddrs());
			pst.setFloat(4, bo.getPamt());
			pst.setFloat(5, bo.getTime());
			pst.setFloat(6, bo.getRate());
			pst.setFloat(7, bo.getIntrestAmount());
			count = pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
}