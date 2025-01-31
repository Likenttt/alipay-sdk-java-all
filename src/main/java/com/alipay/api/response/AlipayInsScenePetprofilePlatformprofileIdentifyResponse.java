package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.identify response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-30 15:40:33
 */
public class AlipayInsScenePetprofilePlatformprofileIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5667418671413298332L;

	/** 
	 * 核身结果，true表示同一只宠物，false表示非同一只宠物。
	 */
	@ApiField("verify_result")
	private Boolean verifyResult;

	public void setVerifyResult(Boolean verifyResult) {
		this.verifyResult = verifyResult;
	}
	public Boolean getVerifyResult( ) {
		return this.verifyResult;
	}

}
