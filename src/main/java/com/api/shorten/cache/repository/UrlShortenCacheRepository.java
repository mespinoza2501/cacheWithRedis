package com.api.shorten.cache.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.shorten.cache.model.UrlShortenCache;

public interface UrlShortenCacheRepository extends CrudRepository<UrlShortenCache, String> {

}
