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

import com.one.financial.financial.entity.ProductAccountEntity;
import com.one.financial.financial.service.ProductAccountService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/productaccount")
public class ProductAccountController {
    @Autowired
    private ProductAccountService productAccountService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:productaccount:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productAccountService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{pId}")
    @PreAuthorize("hasAuthority('financial:productaccount:info')")
    public Resp<ProductAccountEntity> info(@PathVariable("pId") Integer pId){
		ProductAccountEntity productAccount = productAccountService.getById(pId);

        return Resp.ok(productAccount);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:productaccount:save')")
    public Resp<Object> save(@RequestBody ProductAccountEntity productAccount){
		productAccountService.save(productAccount);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:productaccount:update')")
    public Resp<Object> update(@RequestBody ProductAccountEntity productAccount){
		productAccountService.updateById(productAccount);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:productaccount:delete')")
    public Resp<Object> delete(@RequestBody Integer[] pIds){
		productAccountService.removeByIds(Arrays.asList(pIds));

        return Resp.ok(null);
    }

}
