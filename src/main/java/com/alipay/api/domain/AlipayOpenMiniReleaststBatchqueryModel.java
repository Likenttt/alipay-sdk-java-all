package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 0411预发验证
 *
 * @author auto create
 * @since 1.0, 2019-06-13 12:09:46
 */
public class AlipayOpenMiniReleaststBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5529676116181933483L;

	/**
	 * 20
	 */
	@ApiField("canshu")
	private String canshu;

	/**
	 * 测试数据
	 */
	@ApiField("fuza")
	private GavintestNewLeveaOne fuza;

	public String getCanshu() {
		return this.canshu;
	}
	public void setCanshu(String canshu) {
		this.canshu = canshu;
	}

	public GavintestNewLeveaOne getFuza() {
		return this.fuza;
	}
	public void setFuza(GavintestNewLeveaOne fuza) {
		this.fuza = fuza;
	}

}