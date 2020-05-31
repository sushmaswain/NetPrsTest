package com.consumer.netprise.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.consumer.netprise.bo.LocationBo;

public interface LocationRepository extends MongoRepository<LocationBo, Integer>{
}
