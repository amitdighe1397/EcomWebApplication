package com.ecomweb.service;

import java.util.List;

import com.ecomweb.entity.EcomWeb;

public interface EcomService {
	
	 EcomWeb createProduct(EcomWeb ew);
	 List<EcomWeb> getAll();

}
