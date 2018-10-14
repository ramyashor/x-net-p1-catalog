/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.CatalogApplication;
import com.xnet.pharma.catalog.dto.VendorItemDTO;
import com.xnet.pharma.catalog.entity.Item;
import com.xnet.pharma.catalog.entity.Vendor;
import com.xnet.pharma.catalog.entity.VendorItem;
import com.xnet.pharma.catalog.repository.VendorItemRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramy
 */
@Service
public class VendorItemServiceImp implements VendorItemService {

    @Autowired
    VendorItemRepository vendorItemRepository;

    @Autowired
    ItemService itemService;

    @Autowired
    VendorService vendorService;

    @Override
    public List<VendorItem> findAllVendorItems() {

        return vendorItemRepository.findAll();
    }

    @Override
    public VendorItem save(VendorItemDTO vendorItemDTO) {

        if (vendorItemDTO == null
                || vendorItemDTO.getItemId() == null || vendorItemDTO.getItemId().isEmpty()
                || vendorItemDTO.getVendorId() == null || vendorItemDTO.getVendorId().isEmpty()
                || vendorItemDTO.getExpireDate() == null) {
            CatalogApplication.logger.warn("Wrong VendorItem Object");
            return null;

        }
        //check if this vendor is Authorized
        if (!vendorService.isAuthorizedVendor(vendorItemDTO.getVendorId())) {
            CatalogApplication.logger.warn("This  Vendor ( " + vendorItemDTO.getVendorId() + " ) is not Authorized");
            return null;
        }

        // check if  item is exist 
        if (!itemService.isItem(vendorItemDTO.getItemId())) {
            CatalogApplication.logger.warn("Item ( " + vendorItemDTO.getItemId() + " ) is  not Exist");
            return null;
        }
        VendorItem vendorItem;
        Optional<VendorItem> vOptional = findByItemIdAndExpireDateAndVendorId(vendorItemDTO.getItemId(), vendorItemDTO.getVendorId(), vendorItemDTO.getExpireDate());

        if (vOptional.isPresent()) {
            vendorItem = vOptional.get();
            vendorItem.setDiscountPercentage(vendorItemDTO.getDiscountPercentage());
            vendorItem.setExpireDate(vendorItemDTO.getExpireDate());
            vendorItem.setQuantity(vendorItemDTO.getQuantity());
            return vendorItemRepository.save(vendorItem);
        }

        vendorItem = new VendorItem();
        vendorItem.setDiscountPercentage(vendorItemDTO.getDiscountPercentage());
        vendorItem.setExpireDate(vendorItemDTO.getExpireDate());
        vendorItem.setItem(itemService.findItemById(vendorItemDTO.getItemId()));
        vendorItem.setQuantity(vendorItemDTO.getQuantity());
        vendorItem.setVendor(vendorService.findVendorById(vendorItemDTO.getVendorId()));
        return vendorItemRepository.save(vendorItem);

    }

    @Override
    public Optional<VendorItem> findByItemIdAndExpireDateAndVendorId(String itemId, String vendorId, Date expireDate) {

        return vendorItemRepository.findByItem_IdAndVendor_IdAndExpireDate(itemId, vendorId, expireDate);

    }

}
