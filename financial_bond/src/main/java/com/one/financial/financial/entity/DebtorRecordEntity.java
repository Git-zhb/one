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
@TableName("t_debtor_record")
public class DebtorRecordEntity implements Serializable {
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
	@ApiModelProperty(name = "claimsId",value = "债权id")
	private Integer claimsId;
	/**
	 * 应还日期
	 */
	@ApiModelProperty(name = "receivableDate",value = "应还日期")
	private Date receivableDate;
	/**
	 * 应还金额
	 */
	@ApiModelProperty(name = "receivableMoney",value = "应还金额")
	private BigDecimal receivableMoney;
	/**
	 * 当前还款期
	 */
	@ApiModelProperty(name = "currentTerm",value = "当前还款期")
	private String currentTerm;
	/**
	 * 记录日期
	 */
	@ApiModelProperty(name = "recordDate",value = "记录日期")
	private Date recordDate;
	/**
	 * 是否还款(0:否  1:是)
	 */
	@ApiModelProperty(name = "isReturned",value = "是否还款(0:否  1:是)")
	private Integer isReturned;

}
