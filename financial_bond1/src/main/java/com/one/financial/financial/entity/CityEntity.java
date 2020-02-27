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
@TableName("t_city")
public class CityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "cityId",value = "")
	private Integer cityId;
	/**
	 * 城市编号
	 */
	@ApiModelProperty(name = "cityAreaNum",value = "城市编号")
	private Integer cityAreaNum;
	/**
	 * 城市名称
	 */
	@ApiModelProperty(name = "cityName",value = "城市名称")
	private String cityName;
	/**
	 * 城市级别 (0：省 ；1：市；2：县)
	 */
	@ApiModelProperty(name = "cityLevel",value = "城市级别 (0：省 ；1：市；2：县)")
	private Integer cityLevel;
	/**
	 * 父级城市编号
	 */
	@ApiModelProperty(name = "parentCityAreaNum",value = "父级城市编号")
	private Integer parentCityAreaNum;

}
