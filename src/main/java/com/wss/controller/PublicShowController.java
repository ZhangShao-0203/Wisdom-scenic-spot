package com.wss.controller;

import com.wss.pojo.PublicPlay;
import com.wss.pojo.PublicShow;
import com.wss.service.IPublicPlayService;
import com.wss.service.IPublicShowService;
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
@RequestMapping("/show")
public class PublicShowController {
    @Autowired
    IPublicShowService iPublicShowService;
    @RequestMapping("/add")
    public int add(PublicShow publicShow, HttpServletRequest request){
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
            publicShow.setShowImgs(readPath);
            int insert = iPublicShowService.insert(publicShow);
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
    public List<PublicShow> list(PublicShow publicShow, @RequestParam(value = "start", defaultValue = "1")int start, @RequestParam(value = "size", defaultValue = "2")int size, @RequestParam(value = "seek")String seek){
        List<PublicShow> publicShows = iPublicShowService.selectAll(start, size, seek);
        return publicShows;
    }
    @RequestMapping("/delete")
    public int delete(PublicShow publicShow){
        int i = iPublicShowService.deleteByPrimaryKey(publicShow.getShowId());
        return i;
    }
    @RequestMapping("/get")
    public PublicShow get(PublicShow publicShow){
        PublicShow publicShow1 = iPublicShowService.selectByPrimaryKey(publicShow.getShowId());
        return publicShow1;
    }
    @RequestMapping("/update")
    public int update(PublicShow publicShow,HttpServletRequest request){
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
            publicShow.setShowImgs(readPath);
            int i = iPublicShowService.updateByPrimaryKey(publicShow);
            return i;
        }
        return 1;
    }
}
