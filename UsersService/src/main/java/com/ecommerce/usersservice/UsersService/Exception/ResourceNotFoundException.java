package com.ecommerce.usersservice.UsersService.Exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException()
    {
        super("RESOURCE NOT FOUND");
    }

    public ResourceNotFoundException(String msg)
    {
        super(msg);
    }
    
}
