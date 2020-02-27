package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.ProductAccountDao;
import com.one.financial.financial.entity.ProductAccountEntity;
import com.one.financial.financial.service.ProductAccountService;


@Service("productAccountService")
public class ProductAccountServiceImpl extends ServiceImpl<ProductAccountDao, ProductAccountEntity> implements ProductAccountService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductAccountEntity> page = this.page(
                new Query<ProductAccountEntity>().getPage(params),
                new QueryWrapper<ProductAccountEntity>()
        );

        return new PageVo(page);
    }

}