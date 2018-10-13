/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnet.pharma.catalog.entity;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 *
 * @author ramy
 */
@CompoundIndexes({
    @CompoundIndex(name = "items_lId", def = "{ 'item.Id': 1 }") 
   ,@CompoundIndex(name = "vedor_Id", def = "{ 'vendor.Id': 1 }")
   ,@CompoundIndex(name = "expireDate", def = "{ 'expireDate': 1 }")
})
public class VendorItem {

    @Id
    @Indexed
    private String id;
    @DBRef
    @Indexed
    private Item item;
    @DBRef
    @Indexed
    private Vendor vendor;
    @Indexed
    private Date expireDate;
    @Indexed
    private float discountPercentage;
    @Indexed
    private int  quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
