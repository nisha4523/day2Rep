package com.cg.lab1;
import java.util.HashMap;

public class ProductDB 
{
	static HashMap<String, product> prodIdMap = getProdIdMap();
	
	public static HashMap<String, product> getProdIdMap() {
		return prodIdMap;
	}
	
	static {
		if (prodIdMap == null) {
			prodIdMap = new HashMap<String, product>();
			product prod1 = new product(1, "IPad", 10000);
			product prod2 = new product(4, "DVD", 20000);
			product prod3 = new product(3, "Laptop", 8000);
			product prod4 = new product(2, "IPod", 7000);

			prodIdMap.put("IPad", prod1);
			prodIdMap.put("DVD", prod2);
			prodIdMap.put("Laptop", prod3);
			prodIdMap.put("IPod", prod4);
		}

	}
}
