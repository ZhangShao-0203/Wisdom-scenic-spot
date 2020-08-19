package com.wss.controller;

import com.wss.pojo.PublicNotice;
import com.wss.service.IPublicNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class PublicNoticeController {
    @Autowired
    IPublicNoticeService publicNoticeService;
    @RequestMapping("/add")
    public int add(PublicNotice publicNotice){
        System.out.println(publicNotice.toString());
        int i = publicNoticeService.insert(publicNotice);
        return i;
    }
    @RequestMapping("/delete")
    public int delete(PublicNotice publicNotice){
        System.out.println(publicNotice.toString());
        int i = publicNoticeService.deleteByPrimaryKey(publicNotice.getNoticeId());
        return i;
    }
    @RequestMapping("/update")
    public int update(PublicNotice publicNotice){
        System.out.println(publicNotice.toString());
        int i = publicNoticeService.updateByPrimaryKey(publicNotice);
        return i;
    }
    @RequestMapping("/get")
    public PublicNotice get(PublicNotice publicNotice){
        System.out.println(publicNotice.toString());
        PublicNotice i = publicNoticeService.selectByPrimaryKey(publicNotice.getNoticeId());
        return i;
    }
    @RequestMapping("/list")
    /*
        start 第几页
        size  一页几条数据
        seek  模糊搜索
    */
    public List<PublicNotice> list(PublicNotice publicNotice, @RequestParam(value = "start", defaultValue = "1")int start, @RequestParam(value = "size", defaultValue = "2")int size, @RequestParam(value = "seek")String seek){
        System.out.println(publicNotice.toString());
        List<PublicNotice> i = publicNoticeService.selectAll(start,size,seek);
        return i;
    }
}
