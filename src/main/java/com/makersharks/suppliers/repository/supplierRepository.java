package com.makersharks.suppliers.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class supplierRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getSuppliers(String companyName, String location, String natureOfBusiness, String manufacturingProcess, int page, int size) {
        String sql = "{call GetSuppliers(?, ?, ?, ?, ?, ?)}";
        return jdbcTemplate.queryForList(sql, companyName, location, natureOfBusiness, manufacturingProcess, page, size);
    }
}
