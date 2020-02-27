package com.one.financial.financial.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.one.financial.financial.entity.ProductEarngrateEntity;
import com.one.financial.financial.service.ProductEarngrateService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:13
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/productearngrate")
public class ProductEarngrateController {
    @Autowired
    private ProductEarngrateService productEarngrateService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:productearngrate:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productEarngrateService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:productearngrate:info')")
    public Resp<ProductEarngrateEntity> info(@PathVariable("id") Integer id){
		ProductEarngrateEntity productEarngrate = productEarngrateService.getById(id);

        return Resp.ok(productEarngrate);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:productearngrate:save')")
    public Resp<Object> save(@RequestBody ProductEarngrateEntity productEarngrate){
		productEarngrateService.save(productEarngrate);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:productearngrate:update')")
    public Resp<Object> update(@RequestBody ProductEarngrateEntity productEarngrate){
		productEarngrateService.updateById(productEarngrate);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:productearngrate:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		productEarngrateService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
