package com.exam.msaserignefalloufallm2gl.dao;

import com.exam.msaserignefalloufallm2gl.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//Serigne_Fallou_Fall
@Repository
public class ProductDaoImpl implements ProductDao {
    public static List<Product>products=new ArrayList<>();
    static {
        products.add(new Product(1, new String("Vitamine C"), 1500));
        products.add(new Product(2, new String("Procudent"), 2000));
        products.add(new Product(3, new String("Broche"), 1000));
        products.add(new Product(3, new String("Deodorant Nivea"), 2000));

    }

    @Override
    public List<Product>findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if(product.getId() ==id){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}