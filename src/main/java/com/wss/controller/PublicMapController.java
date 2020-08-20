package com.wss.controller;

import com.wss.pojo.PublicMap;
import com.wss.pojo.PublicPlay;
import com.wss.service.IPublicMapService;
import com.wss.service.IPublicPlayService;
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
@RequestMapping("/map")
public class PublicMapController {
    @Autowired
    IPublicMapService iPublicMapService;
    @RequestMapping("/add")
    public int add(PublicMap publicMap, HttpServletRequest request){
        int insert = iPublicMapService.insert(publicMap);
        return insert;
    }
    /*
        start 第几页
        size  一页几条数据
        seek  模糊搜索
    */
    @RequestMapping("/list")
    public List<PublicMap> list(PublicMap publicMap, @RequestParam(value = "start", defaultValue = "1")int start, @RequestParam(value = "size", defaultValue = "2")int size, @RequestParam(value = "seek")String seek){
        List<PublicMap> publicMaps = iPublicMapService.selectAll(start, size, seek);
        return publicMaps;
    }
    @RequestMapping("/delete")
    public int delete(PublicMap publicMap){
        int i = iPublicMapService.deleteByPrimaryKey(publicMap.getMapId());
        return i;
    }
    @RequestMapping("/get")
    public PublicMap get(PublicMap publicMap){
        PublicMap publicMap1 = iPublicMapService.selectByPrimaryKey(publicMap.getMapId());
        return publicMap1;
    }
    @RequestMapping("/update")
    public int update(PublicMap publicMap,HttpServletRequest request){
        int i = iPublicMapService.updateByPrimaryKey(publicMap);
        return i;
    }
}
