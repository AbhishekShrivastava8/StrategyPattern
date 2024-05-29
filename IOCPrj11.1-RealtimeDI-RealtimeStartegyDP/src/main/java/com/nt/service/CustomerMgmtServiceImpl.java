package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAOImpl;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService
{
	private ICustomerDAO dao;
	public CustomerMgmtServiceImpl(CustomerDAOImpl dao)
	{
		this.dao = dao;
	}
	public String calculateSimpleIntrest(CustomerDTO dto)throws Exception
	{
		float amt = dto.getPamt()*dto.getTime()*dto.getRate()/100f;
		CustomerBO bo = new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPamt(dto.getPamt());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		bo.setIntrestAmount(amt);
		int count = dao.insert(bo);
		return count==1?"Customer Registration successfully--> SimpleIntrest amount::"+amt:"Customer Registration Failed";
	}
}