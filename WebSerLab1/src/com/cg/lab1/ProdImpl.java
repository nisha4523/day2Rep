package com.cg.lab1;

import java.util.HashMap;

import javax.jws.WebService;

@WebService(endpointInterface = "com.cg.lab1.ProdI")
public class ProdImpl implements ProdI
{
	static HashMap<String, product> prodIdMap = ProductDB.getProdIdMap();
	@Override
	public String search(String id)
	{
		product p1=prodIdMap.get(id);
		if(p1!=null)
		return Double.toString(p1.getPrice());
		else
		return "Product Does not exist!!!";	
	}

}
