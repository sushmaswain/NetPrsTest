package com.producer.netprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.netprise.bo.GeoIp;
import com.producer.netprise.bo.GeoIpResponse;
import com.producer.netprise.bo.LatLong;
import com.producer.netprise.service.GeoIpService;

@RestController
@RequestMapping("api/v1")
public class ProdController {

	@Autowired
	private GeoIpService geoIpService;

	
	@PostMapping(value="/location", consumes = MediaType.APPLICATION_JSON_VALUE)
	public GeoIpResponse produce(@RequestBody GeoIp geoIp) throws Exception {
		System.out.println("inside post controller");
		//UUID uid = UUID.fromString(geoIp.getId());
		geoIpService.getLocation();
		return new GeoIpResponse("112", new LatLong(1,1), System.currentTimeMillis());
	}
}
