package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyDPTest
{
	public static void main(String[] args)
	{
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		String result = fpkt.shopping(new String[] {"Jean","Shirt","Shoes"}, new float[] {111.11f, 222.22f, 333.33f});
		System.out.println(result);
	}
}