package com.cg.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) 
	{
		Resource res = new ClassPathResource("NewFile.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		/*XmlBeanFactory(Resource)
		XmlBeanFactory(String)*/
		
		Employee empl = (Employee)factory.getBean("empl");
		
		System.out.println(empl);

	}

}
