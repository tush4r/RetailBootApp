package com.retail.App.service;

import com.retail.App.model.Product;
import com.retail.App.repository.ProductRepository;
import org.hibernate.hql.spi.id.local.LocalTemporaryTableBulkIdStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> list(Double amount) {

        return productRepository.findAll().stream()
                .filter(price -> price.getAmount() > amount)
                .map(f -> new Product(f.getAmount() + (f.getAmount() * 0.1), f.getId(), f.getName()))
                .sorted(Comparator.comparing(Product::getAmount))
                .collect(Collectors.toList());
    }
}
