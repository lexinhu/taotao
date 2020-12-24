package com.xn2001.pojo;

/**
 * @Author 乐心湖
 * @Date 2020/12/24 10:50
 * @Version 1.0
 */

public class PicUploadResult {
    private Integer error;
    private String width;
    private String height;
    private String url;

    @Override
    public String toString() {
        return "PicUploadResult{" +
                "error=" + error +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
