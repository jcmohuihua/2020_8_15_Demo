package com.gec.service.Impl;

import com.gec.dao.ProductMapper;
import com.gec.domain.Product;
import com.gec.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mhh
 * 2020/8/15 0015 - 下午 4:01
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper pm;

    @Override
    public List<Product> findAllProduct() {
        return pm.selectByExample(null);
    }

    @Override
    public Product findProductById(int pid) {
        return pm.selectByPrimaryKey(pid);
    }
}
