package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer name::");
		String name = sc.next();
		System.out.println("Enter Customer addrs::");
		String addrs = sc.next();
		System.out.println("Enter customer principle amount::");
		String pamt = sc.next();
		System.out.println("Enter customer Rate of intrest::");
		String rate = sc.next();
		System.out.println("Enter customer time of intrest::");
		String time = sc.next();
		
		CustomerVO vo = new CustomerVO();
		vo.setCustName(name);
		vo.setCustAddrs(addrs);
		vo.setPamt(Float.parseFloat(pamt));
		vo.setRate(Float.parseFloat(rate));
		vo.setTime(Float.parseFloat(time));
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		MainController controller = factory.getBean("controller", MainController.class);
		try
		{
			String result = controller.processCutomer(vo);
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}