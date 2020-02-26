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
@TableName("t_account")
public class AccountEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "userId",value = "")
	private Long userId;
	/**
	 * 帐户总额
	 */
	@ApiModelProperty(name = "total",value = "帐户总额")
	private BigDecimal total;
	/**
	 * 帐户可用余额
	 */
	@ApiModelProperty(name = "balance",value = "帐户可用余额")
	private BigDecimal balance;
	/**
	 * 账户总计冻结总额
	 */
	@ApiModelProperty(name = "frozen",value = "账户总计冻结总额")
	private BigDecimal frozen;
	/**
	 * 总计待收本金
	 */
	@ApiModelProperty(name = "inverstmentw",value = "总计待收本金")
	private BigDecimal inverstmentw;
	/**
	 * 总计待收利息
	 */
	@ApiModelProperty(name = "interestTotal",value = "总计待收利息")
	private BigDecimal interestTotal;
	/**
	 * 月投总额
	 */
	@ApiModelProperty(name = "addCapitalTotal",value = "月投总额")
	private BigDecimal addCapitalTotal;
	/**
	 * 月取总额
	 */
	@ApiModelProperty(name = "recyclingInterest",value = "月取总额")
	private BigDecimal recyclingInterest;
	/**
	 * 月乘总额
	 */
	@ApiModelProperty(name = "capitalTotal",value = "月乘总额")
	private BigDecimal capitalTotal;
	/**
	 * 已投资总额
	 */
	@ApiModelProperty(name = "inverstmenta",value = "已投资总额")
	private BigDecimal inverstmenta;
	/**
	 * 已赚取利息
	 */
	@ApiModelProperty(name = "interesta",value = "已赚取利息")
	private BigDecimal interesta;
	/**
	 * 申请提现金额
	 */
	@ApiModelProperty(name = "uApplyExtractMoney",value = "申请提现金额")
	private BigDecimal uApplyExtractMoney;

}
