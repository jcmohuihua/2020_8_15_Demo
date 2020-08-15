package com.gec.service;

import com.gec.domain.Product;

import java.util.List;

/**
 * @author mhh
 * 2020/8/15 0015 - 下午 4:00
 */
public interface ProductService {
    List<Product> findAllProduct();

    Product findProductById(int pid);
}
