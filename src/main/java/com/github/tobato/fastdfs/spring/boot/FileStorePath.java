package com.github.tobato.fastdfs.spring.boot;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;

public class FileStorePath extends StorePath {

    /**
     * 解析路径
     */
    private static final String SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR = "/";
    
	/**
	 * 缩略图访问地址（图片类型文件）
	 */
	private String thumb;

    /**
     * 存储文件路径
     */
    public FileStorePath() {
        super();
    }

    /**
     * 存储文件路径
     *
     * @param group
     * @param path
     */
    public FileStorePath(StorePath store, String thumb) {
        super(store.getGroup(), store.getPath());
        this.thumb = thumb;
    }
    
    /**
     * 存储文件路径
     *
     * @param group
     * @param path
     */
    public FileStorePath(String group, String path, String thumb) {
        super(group, path);
        this.thumb = thumb;
    }

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	

    /**
     * 获取缩略图全路径
     *
     * @return
     */
    public String getFullThumb() {
        return this.getGroup().concat(SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR).concat(this.thumb);
    }
	
}
