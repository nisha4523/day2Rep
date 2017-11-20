package com.cg.details;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) 
	{
		Resource res = new ClassPathResource("NewFile.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
			
		SBUImpl sbu = (SBUImpl)factory.getBean("sbuimpl");
		ArrayList<EmployeeImpl> list=sbu.getEmpList();
		System.out.println(sbu);
		System.out.println(list);

	}

}
