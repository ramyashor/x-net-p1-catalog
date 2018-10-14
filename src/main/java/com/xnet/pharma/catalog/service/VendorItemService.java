/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;


import com.xnet.pharma.catalog.dto.VendorItemDTO;
import com.xnet.pharma.catalog.entity.VendorItem;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ramy
 */
public interface VendorItemService {

    List<VendorItem> findAllVendorItems();

    VendorItem  save(VendorItemDTO vendorItemDTO);
    Optional<VendorItem>  findByItemIdAndExpireDateAndVendorId(String itemId,String vendorId,Date expireDate);
    

}
