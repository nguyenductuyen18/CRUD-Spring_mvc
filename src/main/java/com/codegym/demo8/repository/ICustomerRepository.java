package com.codegym.demo8.repository;
import com.codegym.demo8.model.Customer;

public interface ICustomerRepository {
        boolean saveWithStoredProcedure(Customer customer);
}
