package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知字段
 *
 * @author auto create
 * @since 1.0, 2022-01-07 11:04:46
 */
public class NotifyTriggerExt extends AlipayObject {

	private static final long serialVersionUID = 7394176826517881719L;

	/**
	 * 是否默认值
	 */
	@ApiField("default_value")
	private Boolean defaultValue;

	/**
	 * 描述字段
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public Boolean getDefaultValue() {
		return this.defaultValue;
	}
	public void setDefaultValue(Boolean defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
