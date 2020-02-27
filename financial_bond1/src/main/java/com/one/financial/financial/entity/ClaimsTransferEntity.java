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
@TableName("t_claims_transfer")
public class ClaimsTransferEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 债权id
	 */
	@ApiModelProperty(name = "debtId",value = "债权id")
	private Integer debtId;
	/**
	 * 转让流水号
	 */
	@ApiModelProperty(name = "transferSerialNo",value = "转让流水号")
	private String transferSerialNo;
	/**
	 * 债权持有人
	 */
	@ApiModelProperty(name = "debtOwner",value = "债权持有人")
	private String debtOwner;
	/**
	 * 债权类型 :新借款 129,到期赎回 130,期限内回款 131
	 */
	@ApiModelProperty(name = "debtType",value = "债权类型 :新借款 129,到期赎回 130,期限内回款 131")
	private Integer debtType;
	/**
	 * 转让时间
	 */
	@ApiModelProperty(name = "transferDate",value = "转让时间")
	private Date transferDate;
	/**
	 *  债权权重
	 */
	@ApiModelProperty(name = "debtWeight",value = " 债权权重")
	private Integer debtWeight;
	/**
	 * 债权金额
	 */
	@ApiModelProperty(name = "debtMoney",value = "债权金额")
	private BigDecimal debtMoney;
	/**
	 * 审核状态
	 */
	@ApiModelProperty(name = "auditStatus",value = "审核状态")
	private String auditStatus;
	/**
	 * 是否锁定:11404,锁定中(匹配中);11403,未锁定(未匹配)
	 */
	@ApiModelProperty(name = "isLocked",value = "是否锁定:11404,锁定中(匹配中);11403,未锁定(未匹配)")
	private Integer isLocked;

}
