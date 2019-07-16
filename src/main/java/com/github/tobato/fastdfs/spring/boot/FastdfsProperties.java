package com.github.tobato.fastdfs.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.github.tobato.fastdfs.spring.boot.utils.FastdfsUtils;

@ConfigurationProperties(FastdfsProperties.PREFIX)
public class FastdfsProperties {

	public static final String PREFIX = "fdfs";

	/** Whether Enable Fastdfs. */
	private boolean enabled = false;
	
	/**
	 * 存储服务对外服务的主机地址或域名
	 */
	private String endpoint;
	/**
	 * token secret key
	 */
	private String secretKey;
	/**
	 */
	private String charset = FastdfsUtils.g_charset;
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

}