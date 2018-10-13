/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.repository;

import com.xnet.pharma.catalog.entity.Item;
import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ramy
 */
@Repository
public interface ItemRepository  extends MongoRepository<Item, Serializable>{
    
}
