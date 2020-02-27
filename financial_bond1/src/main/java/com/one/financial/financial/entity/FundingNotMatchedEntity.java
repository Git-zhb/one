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
@TableName("t_funding_not_matched")
public class FundingNotMatchedEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 投资记录
	 */
	@ApiModelProperty(name = "fInvestRecordId",value = "投资记录")
	private Integer fInvestRecordId;
	/**
	 * 待匹配金额
	 */
	@ApiModelProperty(name = "fNotMatchedMoney",value = "待匹配金额")
	private BigDecimal fNotMatchedMoney;
	/**
	 * 资金类型
	 */
	@ApiModelProperty(name = "fFoundingType",value = "资金类型")
	private String fFoundingType;
	/**
	 * 资金
	 */
	@ApiModelProperty(name = "fFoundingWeight",value = "资金")
	private BigDecimal fFoundingWeight;
	/**
	 * 是否锁定(0:否 1:是)
	 */
	@ApiModelProperty(name = "fIsLocked",value = "是否锁定(0:否 1:是)")
	private Integer fIsLocked;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "fCreateDate",value = "创建时间")
	private Date fCreateDate;

}
