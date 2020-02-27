package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.BankDao;
import com.one.financial.financial.entity.BankEntity;
import com.one.financial.financial.service.BankService;


@Service("bankService")
public class BankServiceImpl extends ServiceImpl<BankDao, BankEntity> implements BankService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BankEntity> page = this.page(
                new Query<BankEntity>().getPage(params),
                new QueryWrapper<BankEntity>()
        );

        return new PageVo(page);
    }

}