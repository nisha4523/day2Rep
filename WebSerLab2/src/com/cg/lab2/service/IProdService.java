package com.cg.lab2.service;

import java.util.List;

import com.cg.lab2.beans.product;

public interface IProdService 
{

	product addCountry(product p1);

	List<product> getAllProducts();

}
