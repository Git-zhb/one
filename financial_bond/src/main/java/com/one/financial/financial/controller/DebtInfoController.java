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

import com.one.financial.financial.entity.DebtInfoEntity;
import com.one.financial.financial.service.DebtInfoService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/debtinfo")
public class DebtInfoController {
    @Autowired
    private DebtInfoService debtInfoService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:debtinfo:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = debtInfoService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:debtinfo:info')")
    public Resp<DebtInfoEntity> info(@PathVariable("id") Integer id){
		DebtInfoEntity debtInfo = debtInfoService.getById(id);

        return Resp.ok(debtInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:debtinfo:save')")
    public Resp<Object> save(@RequestBody DebtInfoEntity debtInfo){
		debtInfoService.save(debtInfo);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:debtinfo:update')")
    public Resp<Object> update(@RequestBody DebtInfoEntity debtInfo){
		debtInfoService.updateById(debtInfo);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:debtinfo:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		debtInfoService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
