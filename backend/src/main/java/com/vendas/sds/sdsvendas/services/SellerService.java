package com.vendas.sds.sdsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendas.sds.sdsvendas.dto.SellerDTO;
import com.vendas.sds.sdsvendas.entities.Seller;
import com.vendas.sds.sdsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	public List<SellerDTO> findAll(){
		List<Seller> result =  sellerRepository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
