package com.exam.msaserignefalloufallm2gl.dao;

import com.exam.msaserignefalloufallm2gl.model.Product;
import java.util.List;



public interface ProductDao {
    public List<Product>findAll();
    public Product findById(int id);
    public Product save(Product product);
}
