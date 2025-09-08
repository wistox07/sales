package org.fernando.sales.service;

import org.fernando.sales.model.Category;

import java.util.List;

public interface ICategoryService {

    Category save(Category category) throws Exception;
    Category update(Category category , Integer id) throws Exception;
    List<Category> readAll() throws Exception;
    Category readById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
