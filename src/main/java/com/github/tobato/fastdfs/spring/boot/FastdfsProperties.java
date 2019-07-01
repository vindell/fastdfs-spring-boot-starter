package com.github.tobato.fastdfs.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(FastdfsProperties.PREFIX)
public class FastdfsProperties {

	public static final String PREFIX = "fdfs";
	
	/** Whether Enable Fastdfs. */
	private boolean enabled = false;
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}