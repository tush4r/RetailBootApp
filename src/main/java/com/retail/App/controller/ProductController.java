package com.retail.App.controller;


import com.retail.App.model.Product;
import com.retail.App.service.ProductService;
import com.retail.App.service.ProductServiceImpl;
import com.retail.App.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    ProductService productService;

    @RequestMapping(value = "/{amount}", method = GET)
    @ResponseBody
    public List<Product> method(@PathVariable("amount") double amount) {
        return productService.list(amount);
    }
}

