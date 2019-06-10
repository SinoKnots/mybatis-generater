package com.sinoknots.bill.ui.entity;

import java.io.Serializable;

/**
 * 实体基类
 * 
 * @author sinoknots
 * @version V1.0.0
 * @since V1.0.0(201906102244)
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 4464040105389239419L;

	private Long createTime;
	private String createrId;
	private String creater;
	private Long lastUpdateTime;

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getCreaterId() {
		return createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Long getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}
