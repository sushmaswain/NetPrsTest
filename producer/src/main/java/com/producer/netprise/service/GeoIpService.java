package com.producer.netprise.service;

import org.springframework.stereotype.Service;

import com.producer.netprise.bo.GeoIp;
import com.producer.netprise.bo.LatLong;

@Service
public class GeoIpService {

	public GeoIp getLocation() {
		return new GeoIp("1", new LatLong(1,1), 1590842341L);
	}
}
