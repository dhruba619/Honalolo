package com.honalolo.model.userModels;

import java.util.Date;

public class AuditReportModel {
	private Date createdAt;
	private Date modifiedAt;
	private String updatedBy;
	private String updatorProfileId;
	private String updateComments;
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdateComments() {
		return updateComments;
	}
	public void setUpdateComments(String updateComments) {
		this.updateComments = updateComments;
	}
	public String getUpdatorProfileId() {
		return updatorProfileId;
	}
	public void setUpdatorProfileId(String updatorProfileId) {
		this.updatorProfileId = updatorProfileId;
	}
}
