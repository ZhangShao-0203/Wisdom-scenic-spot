package com.wss.controller;

import com.wss.pojo.PublicIntroduce;
import com.wss.pojo.PublicPlay;
import com.wss.service.IPublicPlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
@RequestMapping("/paly")
public class PublicPalyController {
    @Autowired
    IPublicPlayService iPublicPlayService;
    @RequestMapping("/add")
    public int add(PublicPlay publicPlay, HttpServletRequest request){
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
            publicPlay.setPlayImgs(readPath);
            int insert = iPublicPlayService.insert(publicPlay);
            return insert;
        }
        return 1;
    }
    /*
        start 第几页
        size  一页几条数据
        seek  模糊搜索
    */
    @RequestMapping("/list")
    public List<PublicPlay> list(PublicPlay publicPlay, @RequestParam(value = "start", defaultValue = "1")int start, @RequestParam(value = "size", defaultValue = "2")int size, @RequestParam(value = "seek")String seek){
        List<PublicPlay> publicPlays = iPublicPlayService.selectAll(start, size, seek);
        return publicPlays;
    }
    @RequestMapping("/delete")
    public int delete(PublicPlay publicPlay){
        int i = iPublicPlayService.deleteByPrimaryKey(publicPlay.getPlayId());
        return i;
    }
    @RequestMapping("/get")
    public PublicPlay get(PublicPlay publicPlay){
        PublicPlay publicPlay1 = iPublicPlayService.selectByPrimaryKey(publicPlay.getPlayId());
        return publicPlay1;
    }
    @RequestMapping("/update")
    public int update(PublicPlay publicPlay,HttpServletRequest request){
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
            publicPlay.setPlayImgs(readPath);
            int i = iPublicPlayService.updateByPrimaryKey(publicPlay);
            return i;
        }
        return 1;
    }
}
