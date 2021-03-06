package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ProductMapper;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() throws Exception {
        return productMapper.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        productMapper.save(product);
    }


}
