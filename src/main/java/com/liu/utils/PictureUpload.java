package com.liu.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Component
public class PictureUpload {

      @Value("${upload.path}")
      private String uploadPath;

      public String uploadPicture(String picType,MultipartFile upload){

            File file=new File(uploadPath);
            if(!file.exists()){
                  boolean mkdirs = file.mkdirs();
            }

            String originalFileName = upload.getOriginalFilename();//获取原始图片的扩展名
            String newFileName = UUID.randomUUID()+originalFileName;
            String newFilePath=uploadPath+"\\"+picType+"\\"+newFileName; //新文件的路径

            try {
                  upload.transferTo(new File(newFilePath));//将传来的文件写入新建的文件
            }catch (IllegalStateException | IOException ignored) {

            }
            return newFileName;
      }
}
