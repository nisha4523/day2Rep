package com.cg.lab2.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.lab2.beans.product;
import com.cg.lab2.staticdb.ProductDB;

public class ProdDAOImpl implements IProdDAO 
{
	
	static HashMap<String, product> prodIdMap = ProductDB.getProdIdMap();
	@Override
	public product addCountry(product p1) {
		prodIdMap.put(p1.getProdName(), p1);
		return p1;
	}
	
	@Override
	public List<product> getAllProducts() {
		List<product> p1 = new ArrayList<product>(prodIdMap.values());
		return p1;
	}
}
