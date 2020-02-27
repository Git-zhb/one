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
@TableName("t_product")
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 产品id
	 */
	@TableId
	@ApiModelProperty(name = "proId",value = "产品id")
	private Integer proId;
	/**
	 * 转让封闭期
	 */
	@ApiModelProperty(name = "closedPeriod",value = "转让封闭期")
	private String closedPeriod;
	/**
	 * 提前赎回类型
	 */
	@ApiModelProperty(name = "earlyRedeptionType",value = "提前赎回类型")
	private String earlyRedeptionType;
	/**
	 * 收益利率类型（134：年利率 ，135：月利率）
	 */
	@ApiModelProperty(name = "earningType",value = "收益利率类型（134：年利率 ，135：月利率）")
	private Integer earningType;
	/**
	 * 数量规则
	 */
	@ApiModelProperty(name = "investRule",value = "数量规则")
	private String investRule;
	/**
	 * 是否可转让(1:是   0:否)
	 */
	@ApiModelProperty(name = "isAllowTransfer",value = "是否可转让(1:是   0:否)")
	private Integer isAllowTransfer;
	/**
	 * 是否复投(1:是  0:否 )
	 */
	@ApiModelProperty(name = "isRepeatInvest",value = "是否复投(1:是  0:否 )")
	private Integer isRepeatInvest;
	/**
	 * 产品最低期限
	 */
	@ApiModelProperty(name = "lowerTimeLimit",value = "产品最低期限")
	private String lowerTimeLimit;
	/**
	 * 产品起投金额
	 */
	@ApiModelProperty(name = "proLowerInvest",value = "产品起投金额")
	private BigDecimal proLowerInvest;
	/**
	 * 产品编号
	 */
	@ApiModelProperty(name = "proNum",value = "产品编号")
	private Long proNum;
	/**
	 * 产品类型id
	 */
	@ApiModelProperty(name = "proTypeId",value = "产品类型id")
	private Integer proTypeId;
	/**
	 * 产品投资上限
	 */
	@ApiModelProperty(name = "proUpperInvest",value = "产品投资上限")
	private BigDecimal proUpperInvest;
	/**
	 * 产品名称
	 */
	@ApiModelProperty(name = "productName",value = "产品名称")
	private String productName;
	/**
	 * 状态(0:表示正常；1：表示停用)
	 */
	@ApiModelProperty(name = "status",value = "状态(0:表示正常；1：表示停用)")
	private Integer status;
	/**
	 * 
	 */
	@ApiModelProperty(name = "upperTimeLimit",value = "")
	private String upperTimeLimit;
	/**
	 * 回款方式（109：表示一次性回款 ，110：每月提取，到期退出）
	 */
	@ApiModelProperty(name = "wayToReturnMoney",value = "回款方式（109：表示一次性回款 ，110：每月提取，到期退出）")
	private Integer wayToReturnMoney;

}
