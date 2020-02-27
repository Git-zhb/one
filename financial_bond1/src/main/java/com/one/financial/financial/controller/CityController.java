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

import com.one.financial.financial.entity.CityEntity;
import com.one.financial.financial.service.CityService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:13
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/city")
public class CityController {
    @Autowired
    private CityService cityService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:city:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = cityService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{cityId}")
    @PreAuthorize("hasAuthority('financial:city:info')")
    public Resp<CityEntity> info(@PathVariable("cityId") Integer cityId){
		CityEntity city = cityService.getById(cityId);

        return Resp.ok(city);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:city:save')")
    public Resp<Object> save(@RequestBody CityEntity city){
		cityService.save(city);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:city:update')")
    public Resp<Object> update(@RequestBody CityEntity city){
		cityService.updateById(city);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:city:delete')")
    public Resp<Object> delete(@RequestBody Integer[] cityIds){
		cityService.removeByIds(Arrays.asList(cityIds));

        return Resp.ok(null);
    }

}
