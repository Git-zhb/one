package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.UnderTakerDao;
import com.one.financial.financial.entity.UnderTakerEntity;
import com.one.financial.financial.service.UnderTakerService;


@Service("underTakerService")
public class UnderTakerServiceImpl extends ServiceImpl<UnderTakerDao, UnderTakerEntity> implements UnderTakerService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<UnderTakerEntity> page = this.page(
                new Query<UnderTakerEntity>().getPage(params),
                new QueryWrapper<UnderTakerEntity>()
        );

        return new PageVo(page);
    }

}