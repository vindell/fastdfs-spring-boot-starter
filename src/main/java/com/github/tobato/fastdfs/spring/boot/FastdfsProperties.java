package com.github.tobato.fastdfs.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(FastdfsProperties.PREFIX)
public class FastdfsProperties {

	public static final String PREFIX = "fdfs";

	/** Whether Enable Fastdfs. */
	private boolean enabled = false;
	/**
	 * token secret key
	 */
	private String secretKey;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

}