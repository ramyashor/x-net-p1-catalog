/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.service;

import com.xnet.pharma.catalog.entity.Category;
import com.xnet.pharma.catalog.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramy
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category save(Category cat) {

        return categoryRepository.save(cat);

    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

}
