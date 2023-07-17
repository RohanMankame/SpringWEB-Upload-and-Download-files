package com.updownlod.fileupdownlodapi;

public class UploadResponse {
    private String fileName;
    private String downlodeUri;
    private long size;
    private String fileDate;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDownlodeUri() {
        return downlodeUri;
    }

    public void setDownlodeUri(String downlodeUri) {
        this.downlodeUri = downlodeUri;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }


}
