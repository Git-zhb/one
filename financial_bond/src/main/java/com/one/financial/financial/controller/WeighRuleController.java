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

import com.one.financial.financial.entity.WeighRuleEntity;
import com.one.financial.financial.service.WeighRuleService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/weighrule")
public class WeighRuleController {
    @Autowired
    private WeighRuleService weighRuleService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:weighrule:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = weighRuleService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:weighrule:info')")
    public Resp<WeighRuleEntity> info(@PathVariable("id") Integer id){
		WeighRuleEntity weighRule = weighRuleService.getById(id);

        return Resp.ok(weighRule);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:weighrule:save')")
    public Resp<Object> save(@RequestBody WeighRuleEntity weighRule){
		weighRuleService.save(weighRule);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:weighrule:update')")
    public Resp<Object> update(@RequestBody WeighRuleEntity weighRule){
		weighRuleService.updateById(weighRule);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:weighrule:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		weighRuleService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
