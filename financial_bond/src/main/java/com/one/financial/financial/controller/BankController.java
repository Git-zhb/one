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

import com.one.financial.financial.entity.BankEntity;
import com.one.financial.financial.service.BankService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:13
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:bank:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = bankService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{bankId}")
    @PreAuthorize("hasAuthority('financial:bank:info')")
    public Resp<BankEntity> info(@PathVariable("bankId") Integer bankId){
		BankEntity bank = bankService.getById(bankId);

        return Resp.ok(bank);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:bank:save')")
    public Resp<Object> save(@RequestBody BankEntity bank){
		bankService.save(bank);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:bank:update')")
    public Resp<Object> update(@RequestBody BankEntity bank){
		bankService.updateById(bank);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:bank:delete')")
    public Resp<Object> delete(@RequestBody Integer[] bankIds){
		bankService.removeByIds(Arrays.asList(bankIds));

        return Resp.ok(null);
    }

}
