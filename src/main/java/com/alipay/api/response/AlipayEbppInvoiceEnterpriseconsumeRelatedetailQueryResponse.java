package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExpenseCtrlConsumeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.relatedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-08 22:00:23
 */
public class AlipayEbppInvoiceEnterpriseconsumeRelatedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8168987347978715342L;

	/** 
	 * 账单凭证关联信息
	 */
	@ApiField("expense_ctrl_consume_info")
	private ExpenseCtrlConsumeInfo expenseCtrlConsumeInfo;

	public void setExpenseCtrlConsumeInfo(ExpenseCtrlConsumeInfo expenseCtrlConsumeInfo) {
		this.expenseCtrlConsumeInfo = expenseCtrlConsumeInfo;
	}
	public ExpenseCtrlConsumeInfo getExpenseCtrlConsumeInfo( ) {
		return this.expenseCtrlConsumeInfo;
	}

}