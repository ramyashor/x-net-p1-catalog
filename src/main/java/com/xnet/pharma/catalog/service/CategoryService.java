/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.entity.Category;
import java.util.List;

/**
 *
 * @author ramy
 */

public interface CategoryService {

    Category save(Category cat);
    List<Category> findAllCategories();
    
}
