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
@TableName("t_user")
public class UserEntity implements Serializable {
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
	@ApiModelProperty(name = "email",value = "")
	private String email;
	/**
	 * 邮箱验证
	 */
	@ApiModelProperty(name = "emailStatus",value = "邮箱验证")
	private String emailStatus;
	/**
	 * 用户id
	 */
	@ApiModelProperty(name = "userId",value = "用户id")
	private Long userId;
	/**
	 * 邀请码
	 */
	@ApiModelProperty(name = "inviteid",value = "邀请码")
	private String inviteid;
	/**
	 * 登录ip
	 */
	@ApiModelProperty(name = "ip",value = "登录ip")
	private String ip;
	/**
	 * 登录时间
	 */
	@ApiModelProperty(name = "loginTime",value = "登录时间")
	private Date loginTime;
	/**
	 * 锁
	 */
	@ApiModelProperty(name = "onlock",value = "锁")
	private String onlock;
	/**
	 * 登录密码
	 */
	@ApiModelProperty(name = "password",value = "登录密码")
	private String password;
	/**
	 * 支付密码
	 */
	@ApiModelProperty(name = "payPassword",value = "支付密码")
	private String payPassword;
	/**
	 * 支付密码验证(1:验证  0:未验证)
	 */
	@ApiModelProperty(name = "payPwdStatus",value = "支付密码验证(1:验证  0:未验证)")
	private Integer payPwdStatus;
	/**
	 * 手机号
	 */
	@ApiModelProperty(name = "phone",value = "手机号")
	private Integer phone;
	/**
	 * 手机验证(1:验证  0:未验证)
	 */
	@ApiModelProperty(name = "phoneStatus",value = "手机验证(1:验证  0:未验证)")
	private Integer phoneStatus;
	/**
	 * 随机激活码
	 */
	@ApiModelProperty(name = "randomCode",value = "随机激活码")
	private Long randomCode;
	/**
	 * 真实姓名
	 */
	@ApiModelProperty(name = "realName",value = "真实姓名")
	private String realName;
	/**
	 * 实名验证(1:已验证  0:未验证)
	 */
	@ApiModelProperty(name = "realNameStatus",value = "实名验证(1:已验证  0:未验证)")
	private Integer realNameStatus;
	/**
	 * 注册时间
	 */
	@ApiModelProperty(name = "registerTime",value = "注册时间")
	private Date registerTime;
	/**
	 * 备注
	 */
	@ApiModelProperty(name = "remark",value = "备注")
	private String remark;
	/**
	 * 安全等级(低:0  中:1  高:2)
	 */
	@ApiModelProperty(name = "userSecure",value = "安全等级(低:0  中:1  高:2)")
	private Integer userSecure;
	/**
	 * 登录名
	 */
	@ApiModelProperty(name = "userName",value = "登录名")
	private String userName;

}
