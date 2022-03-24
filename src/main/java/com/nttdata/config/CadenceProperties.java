package com.nttdata.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "com.nttdata.cadence")
@Data
@Component
public class CadenceProperties {

	
	private String host;
	private int port;
	private String domain;
	private String taskList;
	private long workflowTimeout;
	
	
	
}
