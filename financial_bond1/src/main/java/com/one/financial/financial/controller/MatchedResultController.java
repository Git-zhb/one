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

import com.one.financial.financial.entity.MatchedResultEntity;
import com.one.financial.financial.service.MatchedResultService;




/**
 * 
 *
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("financial/matchedresult")
public class MatchedResultController {
    @Autowired
    private MatchedResultService matchedResultService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('financial:matchedresult:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = matchedResultService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('financial:matchedresult:info')")
    public Resp<MatchedResultEntity> info(@PathVariable("id") Integer id){
		MatchedResultEntity matchedResult = matchedResultService.getById(id);

        return Resp.ok(matchedResult);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('financial:matchedresult:save')")
    public Resp<Object> save(@RequestBody MatchedResultEntity matchedResult){
		matchedResultService.save(matchedResult);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('financial:matchedresult:update')")
    public Resp<Object> update(@RequestBody MatchedResultEntity matchedResult){
		matchedResultService.updateById(matchedResult);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('financial:matchedresult:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		matchedResultService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
