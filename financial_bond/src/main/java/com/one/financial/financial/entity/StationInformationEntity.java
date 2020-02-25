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
 * @date 2020-02-25 19:42:12
 */
@ApiModel
@Data
@TableName("t_station_information")
public class StationInformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 消息状态
	 */
	@ApiModelProperty(name = "messageState",value = "消息状态")
	private String messageState;
	/**
	 * 消息内容
	 */
	@ApiModelProperty(name = "messageContent",value = "消息内容")
	private String messageContent;
	/**
	 * 发送时间
	 */
	@ApiModelProperty(name = "sendTime",value = "发送时间")
	private Date sendTime;
	/**
	 * 消息类型
	 */
	@ApiModelProperty(name = "messageType",value = "消息类型")
	private String messageType;
	/**
	 * 用户id
	 */
	@ApiModelProperty(name = "sReceiveUserId",value = "用户id")
	private Integer sReceiveUserId;

}
