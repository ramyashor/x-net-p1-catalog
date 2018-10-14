/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.dto;

import java.util.Date;

/**
 *
 * @author ramy
 */
public class VendorItemDTO {
    
    private String vendorId;
    private String itemId;
    private Date expireDate;
    private int quantity;
    private float salePrice;
    private float discountPercentage;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }
    
    
    
}
