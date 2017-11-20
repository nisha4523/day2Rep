package com.cg.lab2.controller;

import java.util.HashMap;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cg.lab2.beans.product;
import com.cg.lab2.service.ProdServiceImpl;

@Path("/products")
public class ProductController
{
	ProdServiceImpl pSer;

	public ProductController() 
	{
		pSer=new ProdServiceImpl();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public product addCountry(@FormParam("prodId") int prodId,
			@FormParam("prodName") String prodName,
			@FormParam("prodPrice") double prodPrice)
	{
		product p1 = new product();
		p1.setProdId(prodId);
		p1.setProdName(prodName);
		p1.setPrice(prodPrice);
		return pSer.addCountry(p1);
	}
}
