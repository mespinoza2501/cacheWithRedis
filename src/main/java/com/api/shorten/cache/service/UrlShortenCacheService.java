package com.api.shorten.cache.service;

public interface UrlShortenCacheService {
	
	
	String recouverUrlCache(String id);
	
	void saveUrlCache(String id, String url);

}
