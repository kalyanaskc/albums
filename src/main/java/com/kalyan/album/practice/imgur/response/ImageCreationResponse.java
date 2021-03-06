package com.kalyan.album.practice.imgur.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "success", "status" })
public class ImageCreationResponse {

	@JsonProperty("data")
	private ImageUploadResonse data;
	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("status")
	private Integer status;

	@JsonProperty("data")
	public ImageUploadResonse getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(ImageUploadResonse data) {
		this.data = data;
	}

	@JsonProperty("success")
	public Boolean getSuccess() {
		return success;
	}

	@JsonProperty("success")
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@JsonProperty("status")
	public Integer getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Integer status) {
		this.status = status;
	}
}