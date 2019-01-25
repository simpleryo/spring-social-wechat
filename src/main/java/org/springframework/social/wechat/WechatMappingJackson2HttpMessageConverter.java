package org.springframework.social.wechat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * spring-social-wechat
 * 
 * @author Larry
 */
public class WechatMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {

	public WechatMappingJackson2HttpMessageConverter() {
		List<MediaType> mediaTypes = new ArrayList<>(1);
		mediaTypes.add(MediaType.TEXT_PLAIN);
		setSupportedMediaTypes(mediaTypes);
	}

}
