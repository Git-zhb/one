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

import com.one.financial.financial.entity.ExpectedReturnEntity;
import com.one.financial.financial.service.ExpectedReturnService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/expectedreturn")
public class ExpectedReturnController {
    @Autowired
    private ExpectedReturnService expectedReturnService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:expectedreturn:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = expectedReturnService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:expectedreturn:info')")
    public Resp<ExpectedReturnEntity> info(@PathVariable("id") Integer id){
		ExpectedReturnEntity expectedReturn = expectedReturnService.getById(id);

        return Resp.ok(expectedReturn);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:expectedreturn:save')")
    public Resp<Object> save(@RequestBody ExpectedReturnEntity expectedReturn){
		expectedReturnService.save(expectedReturn);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:expectedreturn:update')")
    public Resp<Object> update(@RequestBody ExpectedReturnEntity expectedReturn){
		expectedReturnService.updateById(expectedReturn);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:expectedreturn:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		expectedReturnService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
