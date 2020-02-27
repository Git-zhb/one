package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.ProductDao;
import com.one.financial.financial.entity.ProductEntity;
import com.one.financial.financial.service.ProductService;


@Service("productService")
public class ProductServiceImpl extends ServiceImpl<ProductDao, ProductEntity> implements ProductService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductEntity> page = this.page(
                new Query<ProductEntity>().getPage(params),
                new QueryWrapper<ProductEntity>()
        );

        return new PageVo(page);
    }

}