package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Money;
import com.alipay.api.domain.ReceiptQuoteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.remit.fxtradeorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-12 17:15:53
 */
public class AlipayOverseasRemitFxtradeorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3122917389957166548L;

	/** 
	 * the unique id on block chain generated by the caller to represent this remit operation.
	 */
	@ApiField("bc_remit_id")
	private String bcRemitId;

	/** 
	 * contra amount
	 */
	@ApiField("contra_amount")
	private Money contraAmount;

	/** 
	 * currency pair
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	/** 
	 * extended info
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * fxOrder time.
	 */
	@ApiField("fx_order_time")
	private String fxOrderTime;

	/** 
	 * fx trade orderId
	 */
	@ApiField("fx_trade_order_id")
	private String fxTradeOrderId;

	/** 
	 * fx trade side
	 */
	@ApiField("fx_trade_side")
	private String fxTradeSide;

	/** 
	 * quote information.
	 */
	@ApiField("quote_info")
	private ReceiptQuoteInfo quoteInfo;

	/** 
	 * the Mid of the receiver allocated by net.
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/** 
	 * the Mid of the sender allocated by net.
	 */
	@ApiField("sender_mid")
	private String senderMid;

	/** 
	 * transaction amount
	 */
	@ApiField("trans_amount")
	private Money transAmount;

	public void setBcRemitId(String bcRemitId) {
		this.bcRemitId = bcRemitId;
	}
	public String getBcRemitId( ) {
		return this.bcRemitId;
	}

	public void setContraAmount(Money contraAmount) {
		this.contraAmount = contraAmount;
	}
	public Money getContraAmount( ) {
		return this.contraAmount;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public String getCurrencyPair( ) {
		return this.currencyPair;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setFxOrderTime(String fxOrderTime) {
		this.fxOrderTime = fxOrderTime;
	}
	public String getFxOrderTime( ) {
		return this.fxOrderTime;
	}

	public void setFxTradeOrderId(String fxTradeOrderId) {
		this.fxTradeOrderId = fxTradeOrderId;
	}
	public String getFxTradeOrderId( ) {
		return this.fxTradeOrderId;
	}

	public void setFxTradeSide(String fxTradeSide) {
		this.fxTradeSide = fxTradeSide;
	}
	public String getFxTradeSide( ) {
		return this.fxTradeSide;
	}

	public void setQuoteInfo(ReceiptQuoteInfo quoteInfo) {
		this.quoteInfo = quoteInfo;
	}
	public ReceiptQuoteInfo getQuoteInfo( ) {
		return this.quoteInfo;
	}

	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}
	public String getReceiverMid( ) {
		return this.receiverMid;
	}

	public void setSenderMid(String senderMid) {
		this.senderMid = senderMid;
	}
	public String getSenderMid( ) {
		return this.senderMid;
	}

	public void setTransAmount(Money transAmount) {
		this.transAmount = transAmount;
	}
	public Money getTransAmount( ) {
		return this.transAmount;
	}

}
