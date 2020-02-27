package com.one.financial.financial.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
@TableName("t_under_taker")
public class UnderTakerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 手续费
	 */
	@ApiModelProperty(name = "cost",value = "手续费")
	private BigDecimal cost;
	/**
	 * 承担者: 1 表示用户承担，0 表示平台承担
	 */
	@ApiModelProperty(name = "undertaker",value = "承担者: 1 表示用户承担，0 表示平台承担")
	private Integer undertaker;
	/**
	 * 0 充值; 1提现
	 */
	@ApiModelProperty(name = "type",value = "0 充值; 1提现")
	private Integer type;

}
