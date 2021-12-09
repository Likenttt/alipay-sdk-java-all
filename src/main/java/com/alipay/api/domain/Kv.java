package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * kv 结构
 *
 * @author auto create
 * @since 1.0, 2021-11-30 11:22:17
 */
public class Kv extends AlipayObject {

	private static final long serialVersionUID = 4897718374887871171L;

	/**
	 * 参数key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数value
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}