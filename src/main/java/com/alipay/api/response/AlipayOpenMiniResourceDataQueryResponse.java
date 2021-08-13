package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourceDataVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.resource.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-01 19:47:38
 */
public class AlipayOpenMiniResourceDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8195186687888264897L;

	/** 
	 * 流量位数据列表
	 */
	@ApiListField("resource_data_list")
	@ApiField("resource_data_v_o")
	private List<ResourceDataVO> resourceDataList;

	public void setResourceDataList(List<ResourceDataVO> resourceDataList) {
		this.resourceDataList = resourceDataList;
	}
	public List<ResourceDataVO> getResourceDataList( ) {
		return this.resourceDataList;
	}

}