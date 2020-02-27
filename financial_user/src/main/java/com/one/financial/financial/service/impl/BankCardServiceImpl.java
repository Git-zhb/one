package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.BankCardDao;
import com.one.financial.financial.entity.BankCardEntity;
import com.one.financial.financial.service.BankCardService;


@Service("bankCardService")
public class BankCardServiceImpl extends ServiceImpl<BankCardDao, BankCardEntity> implements BankCardService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BankCardEntity> page = this.page(
                new Query<BankCardEntity>().getPage(params),
                new QueryWrapper<BankCardEntity>()
        );

        return new PageVo(page);
    }

}