package com.xn2001.controller;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.xn2001.pojo.PicUploadResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author 乐心湖
 * @Date 2020/12/24 10:53
 * @Version 1.0
 */

@RestController
public class PicUploadController {

    @Autowired
    private FastFileStorageClient storageClient;

    private static String[] TYPE = {".jpg",".png"};

    @RequestMapping("/rest/pic/upload")
    public PicUploadResult upload(MultipartFile uploadFile) throws IOException {
        PicUploadResult pIcUploadResult = new PicUploadResult();

        String ext = StringUtils.substringAfterLast(uploadFile.getOriginalFilename(),".");
        StorePath storePath = storageClient.uploadFile(uploadFile.getInputStream(), uploadFile.getSize(), ext, null);

        String picUrl = "http://192.168.37.161/" + storePath.getFullPath();

        pIcUploadResult.setUrl(picUrl);
        pIcUploadResult.setError(0);

        return pIcUploadResult;
    }
}
