/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.controller;

import com.xnet.pharma.catalog.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ramy
 */
@RestController
@RequestMapping("/test")
public class TestController {
    
    @Autowired
    VendorService vendorService;
    
    @GetMapping("/getVendor/{vId}")
   boolean isAuthorizedVendor(@PathVariable("vId") String vendorId){
       
       return vendorService.isAuthorizedVendor(vendorId);
   }
}
