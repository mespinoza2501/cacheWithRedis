package com.api.shorten.cache.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UrlShortenCacheResponseDto implements Serializable {
	
	
	private static final long serialVersionUID = -7590314718420239719L;
	
	
	private String url;

}
