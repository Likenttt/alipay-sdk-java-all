package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环保数据，不传为空时，认为没有环保行为
 *
 * @author auto create
 * @since 1.0, 2021-06-16 15:17:07
 */
public class EnviromentalInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7365832169519547316L;

	/**
	 * environmental_info不为空时,必填; 环保类型:A:减塑/不使用购 物袋;B 无纸质小票;C:直饮水;D :酒店六小件发放(减塑)E:酒 店-减碳-不洗涤;F:景区订单; G:高校订单;H:充电宝订单:I:物流订单
	 */
	@ApiField("environmental")
	private String environmental;

	/**
	 * environmental_info不为空时,必填; 环保行为内 容:huanbaojiansu;wuzhixiaopiao;zhiyishui.....
	 */
	@ApiField("environmental_ext")
	private String environmentalExt;

	public String getEnvironmental() {
		return this.environmental;
	}
	public void setEnvironmental(String environmental) {
		this.environmental = environmental;
	}

	public String getEnvironmentalExt() {
		return this.environmentalExt;
	}
	public void setEnvironmentalExt(String environmentalExt) {
		this.environmentalExt = environmentalExt;
	}

}