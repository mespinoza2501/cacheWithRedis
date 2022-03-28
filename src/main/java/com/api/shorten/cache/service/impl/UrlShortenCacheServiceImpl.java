package com.api.shorten.cache.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.shorten.cache.model.UrlShortenCache;
import com.api.shorten.cache.repository.UrlShortenCacheRepository;
import com.api.shorten.cache.service.UrlShortenCacheService;

@Service
public class UrlShortenCacheServiceImpl implements UrlShortenCacheService{

	
	
	
	@Autowired
	private UrlShortenCacheRepository urlShortenCacheRepository;
	
	@Override
	public String recouverUrlCache(String id) {		
		Optional<UrlShortenCache> urlCache = urlShortenCacheRepository.findById(id);
		if(urlCache.isPresent()) {
			return urlCache.get().getUrl();
		}
		return null;
	}

	@Override
	public void saveUrlCache(String id, String url) {
		
		try {
			
			urlShortenCacheRepository.save(
					UrlShortenCache.builder()
					.id(id)
					.url(url)
					.build());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
