package com.w2p.model.dto;

public class ProductDto {
    private int id;
    private String name;
    private String BrandName;
    private String description;
    private Integer price;
    private Integer inStock;

    public ProductDto(){

    }

    public ProductDto(int id, String name, String brandName, String description, Integer price, Integer inStock) {
        this.id = id;
        this.name = name;
        BrandName = brandName;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getInStock() {
        return inStock;
    }

    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }
}
