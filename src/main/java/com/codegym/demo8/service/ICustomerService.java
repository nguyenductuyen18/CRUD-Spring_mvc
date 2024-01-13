package com.codegym.demo8.service;

import com.codegym.demo8.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}
