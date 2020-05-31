package com.producer.netprise.bo;

public class GeoIpResponse {
	
	private String id;
	private LatLong latLong;
	private Long timeStamp;
	
	public String getId() {
		return id;
	}
	
	public GeoIpResponse(String id, LatLong latLong, Long timeStamp) {
		super();
		this.id = id;
		this.latLong = latLong;
		this.timeStamp = timeStamp;
	}

	public void setId(String id) {
		this.id = id;
	}
	public LatLong getLatLong() {
		return latLong;
	}
	public void setLatLong(LatLong latLong) {
		this.latLong = latLong;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
}
