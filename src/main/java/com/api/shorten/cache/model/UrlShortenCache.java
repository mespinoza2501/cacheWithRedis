package com.api.shorten.cache.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Builder;
import lombok.Data;

@RedisHash("urlCache")
@Data
@Builder
public class UrlShortenCache {
	
	@Id
	private String id;
	private String url;

}
