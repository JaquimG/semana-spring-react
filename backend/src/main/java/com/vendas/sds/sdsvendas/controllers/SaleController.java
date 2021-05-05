package com.vendas.sds.sdsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.sds.sdsvendas.dto.SaleDTO;
import com.vendas.sds.sdsvendas.dto.SaleSuccessDTO;
import com.vendas.sds.sdsvendas.dto.SaleSumDTO;
import com.vendas.sds.sdsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findall(Pageable pageable){
		Page<SaleDTO> listOfSales = saleService.findAll(pageable);
		return ResponseEntity.ok(listOfSales);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		List<SaleSumDTO> listOfSales = saleService.amountGroupedBySeller();
		return ResponseEntity.ok(listOfSales);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
		List<SaleSuccessDTO> listOfSales = saleService.sucessGroupedBySeller();
		return ResponseEntity.ok(listOfSales);
	}
}
