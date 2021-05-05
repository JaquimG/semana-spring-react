package com.vendas.sds.sdsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vendas.sds.sdsvendas.dto.SaleDTO;
import com.vendas.sds.sdsvendas.dto.SaleSuccessDTO;
import com.vendas.sds.sdsvendas.dto.SaleSumDTO;
import com.vendas.sds.sdsvendas.entities.Sale;
import com.vendas.sds.sdsvendas.repositories.SaleRepository;
import com.vendas.sds.sdsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	SaleRepository saleRepository;
	
	@Autowired
	SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> listOfSales = saleRepository.findAll(pageable);
		return listOfSales.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> sucessGroupedBySeller(){
		return saleRepository.sucessGroupedBySeller();
	}

}
