/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.controller;

import com.xnet.pharma.catalog.entity.Category;
import com.xnet.pharma.catalog.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ramy
 */
@RestController
@RequestMapping("/category")
public class CategoryRestController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    List<Category> getAllCategories() {
        return categoryService.findAllCategories();
    }

    @PostMapping("/save")
    String saveCategory(@RequestBody Category cat) {

        return categoryService.save(cat).getId();
    }
}
