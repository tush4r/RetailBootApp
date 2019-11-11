package com.retail.App.service;

import com.retail.App.model.Product;
import com.retail.App.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    public List<Product> list(Double amount);
}
