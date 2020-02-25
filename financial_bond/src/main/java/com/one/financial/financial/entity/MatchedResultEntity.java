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
@TableName("t_matched_result")
public class MatchedResultEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 用户id
	 */
	@ApiModelProperty(name = "userId",value = "用户id")
	private Integer userId;
	/**
	 * 债权id
	 */
	@ApiModelProperty(name = "debtId",value = "债权id")
	private Integer debtId;
	/**
	 * 投资记录主键
	 */
	@ApiModelProperty(name = "investId",value = "投资记录主键")
	private Integer investId;
	/**
	 * 交易流水号
	 */
	@ApiModelProperty(name = "transferSerialNo",value = "交易流水号")
	private String transferSerialNo;
	/**
	 * 购买金额（匹配金额）
	 */
	@ApiModelProperty(name = "purchaseMoney",value = "购买金额（匹配金额）")
	private BigDecimal purchaseMoney;
	/**
	 * 购买日期（匹配日期）
	 */
	@ApiModelProperty(name = "confirmedDate",value = "购买日期（匹配日期）")
	private Date confirmedDate;
	/**
	 * 是否确认,11702:未确认,11701:已确认
	 */
	@ApiModelProperty(name = "isConfirmed",value = "是否确认,11702:未确认,11701:已确认")
	private Integer isConfirmed;
	/**
	 * 匹配上的日期
	 */
	@ApiModelProperty(name = "matchDate",value = "匹配上的日期")
	private Date matchDate;
	/**
	 * 资金类型
	 */
	@ApiModelProperty(name = "fundType",value = "资金类型")
	private String fundType;
	/**
	 * 债权类型
	 */
	@ApiModelProperty(name = "debtType",value = "债权类型")
	private String debtType;
	/**
	 * 是否清算过,11802:未清算,11801:已清算
	 */
	@ApiModelProperty(name = "isExecuted",value = "是否清算过,11802:未清算,11801:已清算")
	private Integer isExecuted;

}
