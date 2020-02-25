package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.StationInformationDao;
import com.one.financial.financial.entity.StationInformationEntity;
import com.one.financial.financial.service.StationInformationService;


@Service("stationInformationService")
public class StationInformationServiceImpl extends ServiceImpl<StationInformationDao, StationInformationEntity> implements StationInformationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<StationInformationEntity> page = this.page(
                new Query<StationInformationEntity>().getPage(params),
                new QueryWrapper<StationInformationEntity>()
        );

        return new PageVo(page);
    }

}