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
 * @date 2020-02-25 19:42:13
 */
@ApiModel
@Data
@TableName("t_bank")
public class BankEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "bankId",value = "")
	private Integer bankId;
	/**
	 * 银行编号
	 */
	@ApiModelProperty(name = "bankNum",value = "银行编号")
	private Integer bankNum;
	/**
	 * 银行名称
	 */
	@ApiModelProperty(name = "bankName",value = "银行名称")
	private String bankName;
	/**
	 * 说明
	 */
	@ApiModelProperty(name = "bankDesc",value = "说明")
	private String bankDesc;
	/**
	 * 是否停用该行（0停；1启用）
	 */
	@ApiModelProperty(name = "bankDelStatus",value = "是否停用该行（0停；1启用）")
	private Integer bankDelStatus;
	/**
	 * 城市编号
	 */
	@ApiModelProperty(name = "cityCode",value = "城市编号")
	private Integer cityCode;
	/**
	 * 城市级别
	 */
	@ApiModelProperty(name = "cityLevel",value = "城市级别")
	private Integer cityLevel;

}
