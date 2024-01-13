package com.codegym.demo8.service;

import com.codegym.demo8.model.Customer;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t);

    T findById(Long id);

    void remove(Long id);
}

