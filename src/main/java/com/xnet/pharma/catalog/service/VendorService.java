/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.entity.Vendor;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramy
 */
@Service
public interface VendorService {
 
    
    boolean isAuthorizedVendor(String vendorId);
    Vendor findVendorById(String  vendorId);
}
