package com.ecommerce.CartService.Controller;

import java.util.List;
 

public class AddToCartRequest {
    
    
    private String userId;

    
    private List<String> productList;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }
}
