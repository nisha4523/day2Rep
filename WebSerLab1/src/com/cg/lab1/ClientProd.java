package com.cg.lab1;

import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ClientProd {

	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://127.0.56.1:9876/cs?wsdl");
		QName qname = new QName("http://lab1.cg.com/","ProdImplService");

		Service service = Service.create(url, qname);
		ProdI endIntf= service.getPort(ProdI.class);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Name");
		String name1=sc.next();
		System.out.println(endIntf.search(name1));
		sc.close();
	}

}
