package com.one.financial.financial.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.one.financial.financial.entity.ProductAccountEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
public interface ProductAccountService extends IService<ProductAccountEntity> {

    PageVo queryPage(QueryCondition params);
}

