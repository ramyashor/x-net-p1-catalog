/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.CatalogApplication;
import com.xnet.pharma.catalog.entity.Item;
import com.xnet.pharma.catalog.repository.ItemRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramy
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public boolean isItem(String itemId) {

        if (itemId == null || itemId.isEmpty()) {
            CatalogApplication.logger.warn("ItemID is  Null Or Empty");
            return false;
        }
        if (itemRepository.findById(itemId).isPresent()) {

            return true;
        }
        CatalogApplication.logger.warn("Item ( " + itemId + " ) is  not Exist");
        return false;

    }

    public Item findItemById(String itemId) {

        Optional<Item> item = itemRepository.findById(itemId);
        if (item.isPresent()) {
            return item.get();
        }
        CatalogApplication.logger.warn("Item ( " + itemId + " ) is  not Exist");
        return null;
    }

}
