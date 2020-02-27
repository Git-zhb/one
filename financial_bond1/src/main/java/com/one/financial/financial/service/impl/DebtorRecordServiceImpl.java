package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.DebtorRecordDao;
import com.one.financial.financial.entity.DebtorRecordEntity;
import com.one.financial.financial.service.DebtorRecordService;


@Service("debtorRecordService")
public class DebtorRecordServiceImpl extends ServiceImpl<DebtorRecordDao, DebtorRecordEntity> implements DebtorRecordService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<DebtorRecordEntity> page = this.page(
                new Query<DebtorRecordEntity>().getPage(params),
                new QueryWrapper<DebtorRecordEntity>()
        );

        return new PageVo(page);
    }

}