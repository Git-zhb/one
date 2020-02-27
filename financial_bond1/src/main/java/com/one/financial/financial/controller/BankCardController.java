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

import com.one.financial.financial.entity.BankCardEntity;
import com.one.financial.financial.service.BankCardService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:13
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/bankcard")
public class BankCardController {
    @Autowired
    private BankCardService bankCardService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:bankcard:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = bankCardService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{bankInfoId}")
    @PreAuthorize("hasAuthority('financial:bankcard:info')")
    public Resp<BankCardEntity> info(@PathVariable("bankInfoId") Integer bankInfoId){
		BankCardEntity bankCard = bankCardService.getById(bankInfoId);

        return Resp.ok(bankCard);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:bankcard:save')")
    public Resp<Object> save(@RequestBody BankCardEntity bankCard){
		bankCardService.save(bankCard);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:bankcard:update')")
    public Resp<Object> update(@RequestBody BankCardEntity bankCard){
		bankCardService.updateById(bankCard);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:bankcard:delete')")
    public Resp<Object> delete(@RequestBody Integer[] bankInfoIds){
		bankCardService.removeByIds(Arrays.asList(bankInfoIds));

        return Resp.ok(null);
    }

}
