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
 * @date 2020-02-25 19:42:12
 */
@ApiModel
@Data
@TableName("t_debt_info")
public class DebtInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 债权编号
	 */
	@ApiModelProperty(name = "debtNo",value = "债权编号")
	private Integer debtNo;
	/**
	 * 合同编号
	 */
	@ApiModelProperty(name = "contractNo",value = "合同编号")
	private Integer contractNo;
	/**
	 * 债务人名称
	 */
	@ApiModelProperty(name = "debtorsName",value = "债务人名称")
	private String debtorsName;
	/**
	 * 债务人身份证号
	 */
	@ApiModelProperty(name = "debtorsId",value = "债务人身份证号")
	private String debtorsId;
	/**
	 * 借款用途
	 */
	@ApiModelProperty(name = "loanPurpose",value = "借款用途")
	private String loanPurpose;
	/**
	 * 借款类型
	 */
	@ApiModelProperty(name = "loanType",value = "借款类型")
	private String loanType;
	/**
	 * 原始借款开始日期
	 */
	@ApiModelProperty(name = "loanStartDate",value = "原始借款开始日期")
	private Date loanStartDate;
	/**
	 * 原始借款期限
	 */
	@ApiModelProperty(name = "loanPeriod",value = "原始借款期限")
	private String loanPeriod;
	/**
	 * 原始借款到期日期
	 */
	@ApiModelProperty(name = "loanEndDate",value = "原始借款到期日期")
	private Date loanEndDate;
	/**
	 * 还款方式
	 */
	@ApiModelProperty(name = "repaymentStyle",value = "还款方式")
	private String repaymentStyle;
	/**
	 * 还款日
	 */
	@ApiModelProperty(name = "repaymenDate",value = "还款日")
	private Date repaymenDate;
	/**
	 * 还款金额
	 */
	@ApiModelProperty(name = "repaymenMoney",value = "还款金额")
	private BigDecimal repaymenMoney;
	/**
	 * 债权金额
	 */
	@ApiModelProperty(name = "debtMoney",value = "债权金额")
	private BigDecimal debtMoney;
	/**
	 * 债权年化利率
	 */
	@ApiModelProperty(name = "debtYearRate",value = "债权年化利率")
	private String debtYearRate;
	/**
	 * 债权月利率
	 */
	@ApiModelProperty(name = "debtMonthRate",value = "债权月利率")
	private String debtMonthRate;
	/**
	 * 债权转入金额
	 */
	@ApiModelProperty(name = "debtTransferredMoney",value = "债权转入金额")
	private BigDecimal debtTransferredMoney;
	/**
	 * 债权转入日期
	 */
	@ApiModelProperty(name = "debtTransferredDate",value = "债权转入日期")
	private Date debtTransferredDate;
	/**
	 * 债权转入期限
	 */
	@ApiModelProperty(name = "debtTransferredPeriod",value = "债权转入期限")
	private String debtTransferredPeriod;
	/**
	 * 债权转出日期
	 */
	@ApiModelProperty(name = "debtRansferOutDate",value = "债权转出日期")
	private Date debtRansferOutDate;
	/**
	 * 债权人
	 */
	@ApiModelProperty(name = "creditor",value = "债权人")
	private String creditor;
	/**
	 * 债权状态
	 */
	@ApiModelProperty(name = "debtStatus",value = "债权状态")
	private String debtStatus;
	/**
	 * 借款人ID
	 */
	@ApiModelProperty(name = "borrowerId",value = "借款人ID")
	private Integer borrowerId;
	/**
	 * 可用期限
	 */
	@ApiModelProperty(name = "availablePeriod",value = "可用期限")
	private String availablePeriod;
	/**
	 * 可用金额
	 */
	@ApiModelProperty(name = "availableMoney",value = "可用金额")
	private BigDecimal availableMoney;
	/**
	 * 已匹配金额
	 */
	@ApiModelProperty(name = "matchedMoney",value = "已匹配金额")
	private BigDecimal matchedMoney;
	/**
	 *  部分匹配11401,  完全匹配11402,   未匹配11403, 正在匹配11404
	 */
	@ApiModelProperty(name = "matchedStatus",value = " 部分匹配11401,  完全匹配11402,   未匹配11403, 正在匹配11404")
	private Integer matchedStatus;
	/**
	 * 还款方式名称
	 */
	@ApiModelProperty(name = "repaymentStyleName",value = "还款方式名称")
	private String repaymentStyleName;
	/**
	 * 债权状态名字
	 */
	@ApiModelProperty(name = "debtStatusName",value = "债权状态名字")
	private String debtStatusName;
	/**
	 * 匹配状态名称
	 */
	@ApiModelProperty(name = "matchedStatusName",value = "匹配状态名称")
	private String matchedStatusName;
	/**
	 * 标的类型
	 */
	@ApiModelProperty(name = "debtType",value = "标的类型")
	private String debtType;
	/**
	 * 标的类型名称
	 */
	@ApiModelProperty(name = "debtTypeName",value = "标的类型名称")
	private String debtTypeName;

}
