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
public class Category {

    @Id
    @Indexed
    private String id;
    @Indexed
    private String nameEn;
    @Indexed
    private String nameAr;
    private String descriptionEn;
    private String descriptuionAr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getDescriptuionAr() {
        return descriptuionAr;
    }

    public void setDescriptuionAr(String descriptuionAr) {
        this.descriptuionAr = descriptuionAr;
    }

}
