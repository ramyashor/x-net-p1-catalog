/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 *
 * @author ramy
 */

public class Item {

    @Id
    @Indexed
    private String gId;
    @Indexed
    private String barcode;
    @Indexed
    private String nameEn;
    @Indexed
    private String nameAr;
    private String discriptionEn;
    private String discriptionAr;
    private float price;
    @Indexed
    private Category category;
    @Indexed
    private boolean active;
    @Indexed
    private boolean deleted;

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getDiscriptionEn() {
        return discriptionEn;
    }

    public void setDiscriptionEn(String discriptionEn) {
        this.discriptionEn = discriptionEn;
    }

    public String getDiscriptionAr() {
        return discriptionAr;
    }

    public void setDiscriptionAr(String discriptionAr) {
        this.discriptionAr = discriptionAr;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    
}
