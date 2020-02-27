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
@TableName("t_bank_card")
public class BankCardEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "bankInfoId",value = "")
	private Integer bankInfoId;
	/**
	 * 银行卡号
	 */
	@ApiModelProperty(name = "bankCardNum",value = "银行卡号")
	private Long bankCardNum;
	/**
	 * 开户银行
	 */
	@ApiModelProperty(name = "openingBank",value = "开户银行")
	private String openingBank;
	/**
	 * 城市id
	 */
	@ApiModelProperty(name = "cityId",value = "城市id")
	private Integer cityId;
	/**
	 * 用户表主键
	 */
	@ApiModelProperty(name = "userId",value = "用户表主键")
	private Integer userId;
	/**
	 * 银行编号
	 */
	@ApiModelProperty(name = "bankId",value = "银行编号")
	private Integer bankId;
	/**
	 * 银行支行
	 */
	@ApiModelProperty(name = "bankBranch",value = "银行支行")
	private String bankBranch;
	/**
	 * 绑定手机号码
	 */
	@ApiModelProperty(name = "reservePhone",value = "绑定手机号码")
	private Integer reservePhone;

}
