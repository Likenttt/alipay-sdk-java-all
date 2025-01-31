package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ServicePromoBaseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-22 14:25:30
 */
public class AlipayOpenAppServicePromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3466425811598114632L;

	/** 
	 * 编辑中版本的服务场景素材详情
	 */
	@ApiField("editing_service_promo")
	private ServicePromoBaseVO editingServicePromo;

	/** 
	 * 生效版本的服务场景素材详情
	 */
	@ApiField("valid_service_promo")
	private ServicePromoBaseVO validServicePromo;

	public void setEditingServicePromo(ServicePromoBaseVO editingServicePromo) {
		this.editingServicePromo = editingServicePromo;
	}
	public ServicePromoBaseVO getEditingServicePromo( ) {
		return this.editingServicePromo;
	}

	public void setValidServicePromo(ServicePromoBaseVO validServicePromo) {
		this.validServicePromo = validServicePromo;
	}
	public ServicePromoBaseVO getValidServicePromo( ) {
		return this.validServicePromo;
	}

}
