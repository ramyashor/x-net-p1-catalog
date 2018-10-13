/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.entity.VendorItem;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramy
 */

public interface VendorItemService {
    
    List<VendorItem> findAllVendorItems();
}
