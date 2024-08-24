package com.makersharks.suppliers.web;

import com.makersharks.suppliers.service.supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class supplierResource {

    @Autowired
    private supplierService SupplierService;

    @PostMapping("/supplier/")
    public ResponseEntity<List<Map<String, Object>>> getSuppliers(
            @RequestParam(name = "companyName") String companyName,
            @RequestParam(name = "location") String location,
            @RequestParam(name = "natureOfBusiness") String natureOfBusiness,
            @RequestParam(name = "manufacturingProcess") String manufacturingProcess,
            @RequestParam(name = "page") int page,
            @RequestParam(name = "size") int size) {

        List<Map<String, Object>> suppliers = SupplierService.getSuppliers(companyName, location, natureOfBusiness, manufacturingProcess, page, size);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }
}
