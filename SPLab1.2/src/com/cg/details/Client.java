package com.cg.details;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) 
	{
		Resource res = new ClassPathResource("NewFile.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
			
		EmployeeImpl empl = (EmployeeImpl)factory.getBean("empl");
		
		System.out.println(empl.dispDetails());

	}

}
