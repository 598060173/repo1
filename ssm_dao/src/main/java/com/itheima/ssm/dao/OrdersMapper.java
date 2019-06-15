package com.itheima.ssm.dao;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.domain.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {
    public List<Orders> findAll() throws Exception;
}
