package com.nttdata.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "com.nttdata.oauth")
@Data
@Component
public class AuthProperties {

	private String urlWellKnow;
	private String clientId;
	private String grantType;
	private String clientSecret;
	private String authType;
	private String scope;


}
