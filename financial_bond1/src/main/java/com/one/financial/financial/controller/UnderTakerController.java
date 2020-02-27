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

import com.one.financial.financial.entity.UnderTakerEntity;
import com.one.financial.financial.service.UnderTakerService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:13
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/undertaker")
public class UnderTakerController {
    @Autowired
    private UnderTakerService underTakerService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:undertaker:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = underTakerService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:undertaker:info')")
    public Resp<UnderTakerEntity> info(@PathVariable("id") Integer id){
		UnderTakerEntity underTaker = underTakerService.getById(id);

        return Resp.ok(underTaker);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:undertaker:save')")
    public Resp<Object> save(@RequestBody UnderTakerEntity underTaker){
		underTakerService.save(underTaker);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:undertaker:update')")
    public Resp<Object> update(@RequestBody UnderTakerEntity underTaker){
		underTakerService.updateById(underTaker);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:undertaker:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		underTakerService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
