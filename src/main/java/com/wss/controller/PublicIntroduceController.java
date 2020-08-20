package com.wss.controller;

import com.wss.pojo.PublicIntroduce;
import com.wss.service.IPublicIntroduceService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/introduce")
public class PublicIntroduceController {
    @Autowired
    IPublicIntroduceService iPublicIntroduceService;
    @SneakyThrows
    @RequestMapping("/add")
    public int add(HttpServletRequest request, PublicIntroduce publicIntroduce){
        String readPath="";
        if(request instanceof MultipartHttpServletRequest){
            MultipartHttpServletRequest multipartHttpServletRequest= (MultipartHttpServletRequest) request;
            List<MultipartFile> files=multipartHttpServletRequest.getFiles("file");
            Iterator<MultipartFile> iterator = files.iterator();
            while (iterator.hasNext()){
                MultipartFile file = iterator.next();
                if (file!=null){
                    String filename=System.currentTimeMillis()+file.getOriginalFilename();
                    String destFileName=request.getServletContext().getRealPath("")+"test"+File.separator+filename;
                    File destFile = new File(destFileName);
                    destFile.getParentFile().mkdirs();
                    try {
                        file.transferTo(destFile);
                        readPath+=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/test/"+filename+";";
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            publicIntroduce.setIntroduceImgs(readPath);
            int insert = iPublicIntroduceService.insert(publicIntroduce);
            return insert;
        }
        return 1;
    }
    @RequestMapping("/list")
    public List<PublicIntroduce> list(){
        List<PublicIntroduce> publicIntroduces = iPublicIntroduceService.selectAll();
        return publicIntroduces;
    }
}
