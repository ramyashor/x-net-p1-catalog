/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.controller;

import com.xnet.pharma.catalog.entity.VendorItem;
import com.xnet.pharma.catalog.service.VendorItemService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ramy
 */
@RestController
@RequestMapping("/vendorItem")
public class VendorItemRestController {
    
    @Autowired
    VendorItemService vendorItemService;
    
    @GetMapping("/all")
    Collection<VendorItem> getAllVendrItems(){
        
        return vendorItemService.findAllVendorItems();
    }
            
}
