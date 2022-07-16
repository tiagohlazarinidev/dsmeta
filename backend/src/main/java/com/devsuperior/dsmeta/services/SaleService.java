package com.devsuperior.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SalesRepository;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SalesRepository _repository;

    public List<Sale> findSale() {
        return _repository.findAll();
        
    }
}
