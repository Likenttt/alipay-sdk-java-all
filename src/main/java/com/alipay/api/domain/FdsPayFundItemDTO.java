package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付资金条目模型
 *
 * @author auto create
 * @since 1.0, 2022-01-05 15:28:23
 */
public class FdsPayFundItemDTO extends AlipayObject {

	private static final long serialVersionUID = 2693986821287347321L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 条目id
	 */
	@ApiField("fund_item_id")
	private String fundItemId;

	/**
	 * 2021-11-04 14:03:50
	 */
	@ApiField("gmt_pay")
	private String gmtPay;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_user_info")
	private PayUserInfoDTO payeeUserInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_user_info")
	private PayUserInfoDTO payerUserInfo;

	/**
	 * 状态:CR("已创建"),ACC("已受理"),UN("未知"), FA("处理失败"),SU("成功"),CLS("已关闭");
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFundItemId() {
		return this.fundItemId;
	}
	public void setFundItemId(String fundItemId) {
		this.fundItemId = fundItemId;
	}

	public String getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(String gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public PayUserInfoDTO getPayeeUserInfo() {
		return this.payeeUserInfo;
	}
	public void setPayeeUserInfo(PayUserInfoDTO payeeUserInfo) {
		this.payeeUserInfo = payeeUserInfo;
	}

	public PayUserInfoDTO getPayerUserInfo() {
		return this.payerUserInfo;
	}
	public void setPayerUserInfo(PayUserInfoDTO payerUserInfo) {
		this.payerUserInfo = payerUserInfo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}