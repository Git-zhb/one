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

import com.one.financial.financial.entity.ProductEntity;
import com.one.financial.financial.service.ProductService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:13
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:product:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{proId}")
    @PreAuthorize("hasAuthority('financial:product:info')")
    public Resp<ProductEntity> info(@PathVariable("proId") Integer proId){
		ProductEntity product = productService.getById(proId);

        return Resp.ok(product);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:product:save')")
    public Resp<Object> save(@RequestBody ProductEntity product){
		productService.save(product);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:product:update')")
    public Resp<Object> update(@RequestBody ProductEntity product){
		productService.updateById(product);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:product:delete')")
    public Resp<Object> delete(@RequestBody Integer[] proIds){
		productService.removeByIds(Arrays.asList(proIds));

        return Resp.ok(null);
    }

}
