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
@TableName("t_expected_return")
public class ExpectedReturnEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 用户ID
	 */
	@ApiModelProperty(name = "userId",value = "用户ID")
	private Integer userId;
	/**
	 *  产品ID
	 */
	@ApiModelProperty(name = "productId",value = " 产品ID")
	private Integer productId;
	/**
	 * 投资记录ID
	 */
	@ApiModelProperty(name = "investRcord",value = "投资记录ID")
	private Integer investRcord;
	/**
	 * 收益日期
	 */
	@ApiModelProperty(name = "expectedDate",value = "收益日期")
	private Date expectedDate;
	/**
	 * 收益金额
	 */
	@ApiModelProperty(name = "expectedMoney",value = "收益金额")
	private BigDecimal expectedMoney;
	/**
	 * 创建日期
	 */
	@ApiModelProperty(name = "createDate",value = "创建日期")
	private Date createDate;

}
