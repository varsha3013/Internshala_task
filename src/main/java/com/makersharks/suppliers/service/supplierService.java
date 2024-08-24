package com.makersharks.suppliers.service;

import com.makersharks.suppliers.repository.supplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class supplierService {

    @Autowired
    private supplierRepository supplierRepository;



        public List<Map<String, Object>> getSuppliers(String companyName, String location, String natureOfBusiness, String manufacturingProcess, int page, int size) {
            return supplierRepository.getSuppliers(companyName, location, natureOfBusiness, manufacturingProcess, page, size);
        }


}
