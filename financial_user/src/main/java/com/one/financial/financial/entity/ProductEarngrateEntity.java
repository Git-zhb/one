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
@TableName("t_product_earngrate")
public class ProductEarngrateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 利率值
	 */
	@ApiModelProperty(name = "incomeRate",value = "利率值")
	private String incomeRate;
	/**
	 * 月份
	 */
	@ApiModelProperty(name = "month",value = "月份")
	private Integer month;
	/**
	 * 产品编号
	 */
	@ApiModelProperty(name = "productId",value = "产品编号")
	private Integer productId;

}
