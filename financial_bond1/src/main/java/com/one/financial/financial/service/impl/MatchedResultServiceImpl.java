package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.MatchedResultDao;
import com.one.financial.financial.entity.MatchedResultEntity;
import com.one.financial.financial.service.MatchedResultService;


@Service("matchedResultService")
public class MatchedResultServiceImpl extends ServiceImpl<MatchedResultDao, MatchedResultEntity> implements MatchedResultService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MatchedResultEntity> page = this.page(
                new Query<MatchedResultEntity>().getPage(params),
                new QueryWrapper<MatchedResultEntity>()
        );

        return new PageVo(page);
    }

}