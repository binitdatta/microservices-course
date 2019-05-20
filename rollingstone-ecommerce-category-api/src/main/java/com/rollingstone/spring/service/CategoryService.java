package com.rollingstone.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.rollingstone.spring.model.Category;
import com.rollingstone.spring.model.Product;

public interface CategoryService {

   Category save(Category category);
   Optional<Category> get(long id);
   Page<Category> getCategoryByPage(Integer pageNumber, Integer pageSize);
   void update(long id, Category category);
   void delete(long id);


}
