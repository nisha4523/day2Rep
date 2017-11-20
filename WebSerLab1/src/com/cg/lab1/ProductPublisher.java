package com.cg.lab1;

import javax.xml.ws.Endpoint;

public class ProductPublisher
{
	
	    public static void main(String[ ] args)
	    {
	      Endpoint.publish("http://127.0.56.1:9876/cs", new ProdImpl());
	   	}
}
