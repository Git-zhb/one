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

import com.one.financial.financial.entity.AccountLogEntity;
import com.one.financial.financial.service.AccountLogService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/accountlog")
public class AccountLogController {
    @Autowired
    private AccountLogService accountLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:accountlog:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = accountLogService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:accountlog:info')")
    public Resp<AccountLogEntity> info(@PathVariable("id") Integer id){
		AccountLogEntity accountLog = accountLogService.getById(id);

        return Resp.ok(accountLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:accountlog:save')")
    public Resp<Object> save(@RequestBody AccountLogEntity accountLog){
		accountLogService.save(accountLog);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:accountlog:update')")
    public Resp<Object> update(@RequestBody AccountLogEntity accountLog){
		accountLogService.updateById(accountLog);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:accountlog:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		accountLogService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
