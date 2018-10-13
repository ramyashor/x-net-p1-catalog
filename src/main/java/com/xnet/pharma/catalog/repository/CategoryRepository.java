/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.xnet.pharma.catalog.entity.Category;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ramy
 */
@Repository
public interface CategoryRepository  extends MongoRepository<Category, Serializable>{
    
}
