package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.scenic.explanation.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-04 11:00:38
 */
public class AlipayCommerceDataScenicExplanationSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3422785953821135212L;

	/** 
	 * 成功请求ID。
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}