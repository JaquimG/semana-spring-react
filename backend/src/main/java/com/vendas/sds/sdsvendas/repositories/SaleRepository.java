package com.vendas.sds.sdsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.sds.sdsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
