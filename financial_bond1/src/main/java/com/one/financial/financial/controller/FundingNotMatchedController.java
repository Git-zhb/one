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

import com.one.financial.financial.entity.FundingNotMatchedEntity;
import com.one.financial.financial.service.FundingNotMatchedService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/fundingnotmatched")
public class FundingNotMatchedController {
    @Autowired
    private FundingNotMatchedService fundingNotMatchedService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:fundingnotmatched:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = fundingNotMatchedService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:fundingnotmatched:info')")
    public Resp<FundingNotMatchedEntity> info(@PathVariable("id") Integer id){
		FundingNotMatchedEntity fundingNotMatched = fundingNotMatchedService.getById(id);

        return Resp.ok(fundingNotMatched);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:fundingnotmatched:save')")
    public Resp<Object> save(@RequestBody FundingNotMatchedEntity fundingNotMatched){
		fundingNotMatchedService.save(fundingNotMatched);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:fundingnotmatched:update')")
    public Resp<Object> update(@RequestBody FundingNotMatchedEntity fundingNotMatched){
		fundingNotMatchedService.updateById(fundingNotMatched);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:fundingnotmatched:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		fundingNotMatchedService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
