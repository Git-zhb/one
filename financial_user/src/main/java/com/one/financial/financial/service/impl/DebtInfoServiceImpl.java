package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.DebtInfoDao;
import com.one.financial.financial.entity.DebtInfoEntity;
import com.one.financial.financial.service.DebtInfoService;


@Service("debtInfoService")
public class DebtInfoServiceImpl extends ServiceImpl<DebtInfoDao, DebtInfoEntity> implements DebtInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<DebtInfoEntity> page = this.page(
                new Query<DebtInfoEntity>().getPage(params),
                new QueryWrapper<DebtInfoEntity>()
        );

        return new PageVo(page);
    }

}