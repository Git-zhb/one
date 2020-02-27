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

import com.one.financial.financial.entity.DebtorRecordEntity;
import com.one.financial.financial.service.DebtorRecordService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/debtorrecord")
public class DebtorRecordController {
    @Autowired
    private DebtorRecordService debtorRecordService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:debtorrecord:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = debtorRecordService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:debtorrecord:info')")
    public Resp<DebtorRecordEntity> info(@PathVariable("id") Integer id){
		DebtorRecordEntity debtorRecord = debtorRecordService.getById(id);

        return Resp.ok(debtorRecord);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:debtorrecord:save')")
    public Resp<Object> save(@RequestBody DebtorRecordEntity debtorRecord){
		debtorRecordService.save(debtorRecord);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:debtorrecord:update')")
    public Resp<Object> update(@RequestBody DebtorRecordEntity debtorRecord){
		debtorRecordService.updateById(debtorRecord);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:debtorrecord:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		debtorRecordService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
