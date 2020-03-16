package com.exam.msaserignefalloufallm2gl.web.controller;

import com.exam.msaserignefalloufallm2gl.dao.ProductDao;
import com.exam.msaserignefalloufallm2gl.dao.ProductDaoImpl;
import com.exam.msaserignefalloufallm2gl.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Serigne_Fallou_Fall_M2gl
    @RestController
    public class ProductController {
    @Autowired
    private ProductDao productDao;

    //Récupérer la liste des produits
    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public List<Product>listeProduits() {
        return productDao.findAll();
    }

    //Récupérer un produit par son Id
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return productDao.findById(id);
    }
    }

