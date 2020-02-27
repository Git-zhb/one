package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.ProductEarngrateDao;
import com.one.financial.financial.entity.ProductEarngrateEntity;
import com.one.financial.financial.service.ProductEarngrateService;


@Service("productEarngrateService")
public class ProductEarngrateServiceImpl extends ServiceImpl<ProductEarngrateDao, ProductEarngrateEntity> implements ProductEarngrateService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductEarngrateEntity> page = this.page(
                new Query<ProductEarngrateEntity>().getPage(params),
                new QueryWrapper<ProductEarngrateEntity>()
        );

        return new PageVo(page);
    }

}