package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.CityDao;
import com.one.financial.financial.entity.CityEntity;
import com.one.financial.financial.service.CityService;


@Service("cityService")
public class CityServiceImpl extends ServiceImpl<CityDao, CityEntity> implements CityService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CityEntity> page = this.page(
                new Query<CityEntity>().getPage(params),
                new QueryWrapper<CityEntity>()
        );

        return new PageVo(page);
    }

}