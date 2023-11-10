package com.ecomweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomweb.entity.EcomWeb;
import com.ecomweb.repositry.EcomRepositry;

@Service
public class EcomServiceImpl implements EcomService{

	 @Autowired
	 EcomRepositry er;
	
	@Override
	public EcomWeb createProduct(EcomWeb ew) {
		
		 EcomWeb ecom= er.save(ew);
		
		return ecom;
	}

	@Override
	public List<EcomWeb> getAll() {

		List<EcomWeb> list=new ArrayList<>();
		
           list = er.findAll();
		
		return list;
	}
	
	
	

}
