package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权撤销
 *
 * @author auto create
 * @since 1.0, 2021-11-05 18:05:45
 */
public class AnttechBlockchainDefinSaasPaymentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2796435536175322746L;

	/**
	 * 撤销金额，单位为元。支持预授权后全额撤销、或预授权后部分撤销。精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("cancel_amount")
	private String cancelAmount;

	/**
	 * 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
	 */
	@ApiField("cancel_currency")
	private String cancelCurrency;

	/**
	 * 外部业务平台原始交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 付款方外部业务平台会员ID
	 */
	@ApiField("out_payer_id")
	private ReferenceId outPayerId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public String getCancelAmount() {
		return this.cancelAmount;
	}
	public void setCancelAmount(String cancelAmount) {
		this.cancelAmount = cancelAmount;
	}

	public String getCancelCurrency() {
		return this.cancelCurrency;
	}
	public void setCancelCurrency(String cancelCurrency) {
		this.cancelCurrency = cancelCurrency;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public ReferenceId getOutPayerId() {
		return this.outPayerId;
	}
	public void setOutPayerId(ReferenceId outPayerId) {
		this.outPayerId = outPayerId;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

}