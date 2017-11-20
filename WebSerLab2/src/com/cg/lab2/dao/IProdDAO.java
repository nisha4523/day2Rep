package com.cg.lab2.dao;

import java.util.List;

import com.cg.lab2.beans.product;

public interface IProdDAO 
{

	product addCountry(product p1);

	List<product> getAllProducts();

}
