/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.entity.VendorItem;
import com.xnet.pharma.catalog.repository.VendorItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramy
 */
@Service
public class VendorItemServiceImp implements VendorItemService{

    @Autowired
    VendorItemRepository vendorItemRepository;
    @Override
    public List<VendorItem> findAllVendorItems() {
     
        return vendorItemRepository.findAll();
    }
    
    
}
