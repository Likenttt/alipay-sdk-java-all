package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.allocaterule.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-06 11:21:31
 */
public class AlipayAccountCashpoolAllocateruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3766991211372121298L;

	/** 
	 * 新增规则ID
	 */
	@ApiField("rule_id")
	private Long ruleId;

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public Long getRuleId( ) {
		return this.ruleId;
	}

}
