/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.entity.Item;

/**
 *
 * @author ramy
 */

public interface ItemService {
    
    
    Item  findItemById(String Id);
    boolean isItem(String itemId);
    
}
