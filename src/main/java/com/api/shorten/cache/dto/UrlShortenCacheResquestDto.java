package com.api.shorten.cache.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UrlShortenCacheResquestDto implements Serializable {
	

	private static final long serialVersionUID = 6581730796916785789L;
	
	
	private String id;
	private String url;

}
