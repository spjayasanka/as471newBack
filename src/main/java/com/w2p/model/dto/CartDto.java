package com.w2p.model.dto;

public class CartDto {
    private String userName;
    private int productId;
    private String productName;
    private int ProductPrice;

    public CartDto(String userId, int productId, String productName, int productPrice) {
        this.userName = userId;
        this.productId = productId;
        this.productName = productName;
        ProductPrice = productPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }
}
