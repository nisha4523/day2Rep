package com.cg.lab2.service;

import java.util.List;

import com.cg.lab2.beans.product;
import com.cg.lab2.dao.ProdDAOImpl;

public class ProdServiceImpl implements IProdService
{
	ProdDAOImpl pDAO=new ProdDAOImpl();
	
	@Override
	public product addCountry(product p1)
	{
		return pDAO.addCountry(p1);
	}

	@Override
	public List<product> getAllProducts() 
	{
		return pDAO.getAllProducts();
	}
}
