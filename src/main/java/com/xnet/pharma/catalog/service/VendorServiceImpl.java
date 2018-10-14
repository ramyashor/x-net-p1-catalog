/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.CatalogApplication;
import com.xnet.pharma.catalog.entity.Vendor;
import com.xnet.pharma.catalog.repository.VendorRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramy
 */
@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    VendorRepository vendorRepository;

    // check if  vendor is Authorized
    // Vendor is Authorized when it is exist in the db and is active.
    @Override
    public boolean isAuthorizedVendor(String vendorId) {

        if (vendorId == null || vendorId.isEmpty()) {
            CatalogApplication.logger.info("Empety VendorID");
            return false;
        }
        Optional<Vendor> vendor = vendorRepository.findById(vendorId);
        if (!vendor.isPresent()) {
            CatalogApplication.logger.info("Vendor ( " + vendorId + " ) is not Exist");
            return false;
        }

        if (vendor.get().isActive()) {
            CatalogApplication.logger.info("Vendor ( " + vendorId + " )  is not Authorized");
            return true;
        }
        return false;
    }

    @Override
    public Vendor findVendorById(String vendorId) {
        Optional<Vendor> vendor = vendorRepository.findById(vendorId);
        if (vendor.isPresent()) {
            return vendor.get();
        }
        return null;
    }

}
