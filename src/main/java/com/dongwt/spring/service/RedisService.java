package com.dongwt.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
	
	@Autowired
	 private RedisTemplate redisTemplate;
	
	@Cacheable
	public void save(String key,String value){
		ValueOperations<String, String> vop =  redisTemplate.opsForValue();
		vop.set(key, value);
		System.out.println(vop.get(key));
	}
}
