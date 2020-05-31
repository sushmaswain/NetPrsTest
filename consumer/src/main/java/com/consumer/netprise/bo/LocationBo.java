package com.consumer.netprise.bo;

import org.springframework.data.mongodb.core.mapping.Document;

import com.consumer.netprise.bo.LatLong;

@Document(collection="test")
public class LocationBo {
	
	
	private String id;
	private LatLong latLong;
	private Long timeStamp;
	
	public LocationBo(String id, LatLong latLong, Long timeStamp) {
		super();
		this.id = id;
		this.latLong = latLong;
		this.timeStamp = timeStamp;
	}

	public String getId() {
		return id;
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

	@Override
	public String toString() {
		return "LocationBo [id=" + id + ", latLong=" + latLong + ", timeStamp=" + timeStamp + "]";
	}
	
}
