package com.one.financial.financial.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhaohuibin
 * @email xxx
 * @date 2020-02-25 19:42:12
 */
@ApiModel
@Data
@TableName("t_weigh_rule")
public class WeighRuleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 类别编号
	 */
	@ApiModelProperty(name = "serialNo",value = "类别编号")
	private Integer serialNo;
	/**
	 * 权重规则类型名称
	 */
	@ApiModelProperty(name = "weigthRuleName",value = "权重规则类型名称")
	private String weigthRuleName;
	/**
	 * 权重类别  资金类 140 债权类 140
	 */
	@ApiModelProperty(name = "weigthRuleClass",value = "权重类别  资金类 140 债权类 140")
	private Integer weigthRuleClass;
	/**
	 * 权重类型   
	 */
	@ApiModelProperty(name = "weigthType",value = "权重类型   ")
	private String weigthType;
	/**
	 * 权重值
	 */
	@ApiModelProperty(name = "weigthValue",value = "权重值")
	private Integer weigthValue;
	/**
	 * 排序(0:asc  1:desc)
	 */
	@ApiModelProperty(name = "order",value = "排序(0:asc  1:desc)")
	private Integer order;
	/**
	 * 权重类别名称
	 */
	@ApiModelProperty(name = "weigthRuleClassName",value = "权重类别名称")
	private String weigthRuleClassName;

}
