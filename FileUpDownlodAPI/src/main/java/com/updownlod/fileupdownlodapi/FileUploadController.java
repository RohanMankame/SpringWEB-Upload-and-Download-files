package com.updownlod.fileupdownlodapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Objects;

@RestController
public class FileUploadController {
    @PostMapping("/uploadFile")
    public ResponseEntity<UploadResponse> uploadFile(
            @RequestParam("file")MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        long size = multipartFile.getSize();

        String fileCode = FileUploadUtil.saveFile(fileName, multipartFile);

        UploadResponse response = new UploadResponse();
        response.setFileName(fileName);
        response.setFileDate("Date");
        response.setSize(size);
        response.setDownlodeUri("/downloadFile/" + fileCode);



        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
