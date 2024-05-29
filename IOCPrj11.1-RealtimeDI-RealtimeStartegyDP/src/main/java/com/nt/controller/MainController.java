package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController
{
	private ICustomerMgmtService service;
	
	public MainController(ICustomerMgmtService service)
	{
		this.service = service;
	}
	public String processCutomer(CustomerVO vo)throws Exception
	{
		CustomerDTO dto = new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setPamt(vo.getPamt());
		dto.setTime(vo.getTime());
		dto.setRate(vo.getRate());
		String result = service.calculateSimpleIntrest(dto);
		return result;
	}
}