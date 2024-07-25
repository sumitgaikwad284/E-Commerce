package com.ecommerce.productservice.ProductService.Exception;

public class ResourseNotFoundException extends RuntimeException {

    public ResourseNotFoundException()
    {
        super("Resourse not found");
    }

    public ResourseNotFoundException(String msg)
    {
        super(msg);
    }
}
