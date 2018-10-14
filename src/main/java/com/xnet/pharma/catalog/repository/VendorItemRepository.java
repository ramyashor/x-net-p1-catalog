/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.repository;


import com.xnet.pharma.catalog.entity.VendorItem;
import java.io.Serializable;
import java.util.Date;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ramy
 */
@Repository
public interface VendorItemRepository extends MongoRepository<VendorItem, Serializable> {

    Optional<VendorItem> findByItem_IdAndVendor_IdAndExpireDate( String itemId,String vendorId ,Date expireDate);
}
