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

import com.one.financial.financial.entity.ClaimsTransferEntity;
import com.one.financial.financial.service.ClaimsTransferService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/claimstransfer")
public class ClaimsTransferController {
    @Autowired
    private ClaimsTransferService claimsTransferService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:claimstransfer:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = claimsTransferService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:claimstransfer:info')")
    public Resp<ClaimsTransferEntity> info(@PathVariable("id") Integer id){
		ClaimsTransferEntity claimsTransfer = claimsTransferService.getById(id);

        return Resp.ok(claimsTransfer);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:claimstransfer:save')")
    public Resp<Object> save(@RequestBody ClaimsTransferEntity claimsTransfer){
		claimsTransferService.save(claimsTransfer);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:claimstransfer:update')")
    public Resp<Object> update(@RequestBody ClaimsTransferEntity claimsTransfer){
		claimsTransferService.updateById(claimsTransfer);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:claimstransfer:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		claimsTransferService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
