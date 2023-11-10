package com.ecomweb.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomweb.entity.EcomWeb;

@Repository
public interface EcomRepositry extends JpaRepository<EcomWeb, Integer> {

}
