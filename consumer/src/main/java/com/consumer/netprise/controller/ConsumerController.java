package com.consumer.netprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consumer.netprise.bo.LocationBo;
import com.consumer.netprise.service.LocationRepository;

@RestController
public class ConsumerController {
	@Autowired
	private LocationRepository locationRepository;
	
	@PostMapping("/addLocation")
	public String saveBook(@RequestBody LocationBo locationBo) {
		RestTemplate restTemplate = new RestTemplate();
		LocationBo location=restTemplate.getForObject("http://localhost:8001/api/v1/location", LocationBo.class);
		locationBo.setId(location.getId());
		locationBo.setLatLong(location.getLatLong());
		locationBo.setTimeStamp(location.getTimeStamp());
		locationRepository.save(locationBo);
		return "Added Location with id :" + locationBo.getId();
	}
}
