package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.AccountDao;
import com.one.financial.financial.entity.AccountEntity;
import com.one.financial.financial.service.AccountService;


@Service("accountService")
public class AccountServiceImpl extends ServiceImpl<AccountDao, AccountEntity> implements AccountService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AccountEntity> page = this.page(
                new Query<AccountEntity>().getPage(params),
                new QueryWrapper<AccountEntity>()
        );

        return new PageVo(page);
    }

}