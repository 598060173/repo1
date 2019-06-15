package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductMapper {
    public List<Product> findAll() throws Exception;

    void save( Product product) throws Exception;
}
