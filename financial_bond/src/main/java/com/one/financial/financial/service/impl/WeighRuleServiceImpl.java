package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.WeighRuleDao;
import com.one.financial.financial.entity.WeighRuleEntity;
import com.one.financial.financial.service.WeighRuleService;


@Service("weighRuleService")
public class WeighRuleServiceImpl extends ServiceImpl<WeighRuleDao, WeighRuleEntity> implements WeighRuleService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<WeighRuleEntity> page = this.page(
                new Query<WeighRuleEntity>().getPage(params),
                new QueryWrapper<WeighRuleEntity>()
        );

        return new PageVo(page);
    }

}