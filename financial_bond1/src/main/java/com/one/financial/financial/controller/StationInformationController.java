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

import com.one.financial.financial.entity.StationInformationEntity;
import com.one.financial.financial.service.StationInformationService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/stationinformation")
public class StationInformationController {
    @Autowired
    private StationInformationService stationInformationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:stationinformation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = stationInformationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:stationinformation:info')")
    public Resp<StationInformationEntity> info(@PathVariable("id") Integer id){
		StationInformationEntity stationInformation = stationInformationService.getById(id);

        return Resp.ok(stationInformation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:stationinformation:save')")
    public Resp<Object> save(@RequestBody StationInformationEntity stationInformation){
		stationInformationService.save(stationInformation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:stationinformation:update')")
    public Resp<Object> update(@RequestBody StationInformationEntity stationInformation){
		stationInformationService.updateById(stationInformation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:stationinformation:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		stationInformationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
