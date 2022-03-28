package com.api.shorten.cache.resource;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.shorten.cache.dto.UrlShortenCacheResponseDto;
import com.api.shorten.cache.dto.UrlShortenCacheResquestDto;
import com.api.shorten.cache.service.UrlShortenCacheService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/cache")
@Api("API for register cahce")
@CrossOrigin(origins = "*")
public class ShortenCacheResource {

	@Autowired
	private UrlShortenCacheService urlShortenCacheService;

	@GetMapping(path = "/{id}")
	@ApiOperation(value =  "Recouver UrlCache")
	public ResponseEntity<UrlShortenCacheResponseDto> recouverUrlCache(@PathVariable(value = "id") String id) {

		String urlCache = urlShortenCacheService.recouverUrlCache(id);
		if (urlCache == null) {
			return ResponseEntity.status(404).build();
		} else {
			return ResponseEntity.status(200).body(UrlShortenCacheResponseDto.builder().url(urlCache).build());
		}

	}
	
	@PostMapping
	@ApiOperation(value =  "Register cache URL")
	public ResponseEntity<?> persistUrlCache(@RequestBody UrlShortenCacheResquestDto dto) {
		
		try {
			
			urlShortenCacheService.saveUrlCache(dto.getId(), dto.getUrl());
			
			return ResponseEntity.status(200).build();
			
		}catch (Exception e) {
			
			return ResponseEntity.status(500).build();

		}

	
	}

}
