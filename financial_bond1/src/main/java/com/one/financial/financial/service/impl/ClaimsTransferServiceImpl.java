package com.one.financial.financial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.one.financial.financial.dao.ClaimsTransferDao;
import com.one.financial.financial.entity.ClaimsTransferEntity;
import com.one.financial.financial.service.ClaimsTransferService;


@Service("claimsTransferService")
public class ClaimsTransferServiceImpl extends ServiceImpl<ClaimsTransferDao, ClaimsTransferEntity> implements ClaimsTransferService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ClaimsTransferEntity> page = this.page(
                new Query<ClaimsTransferEntity>().getPage(params),
                new QueryWrapper<ClaimsTransferEntity>()
        );

        return new PageVo(page);
    }

}