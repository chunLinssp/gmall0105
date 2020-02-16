package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/findAllMember")
    @ResponseBody
    public List<UmsMember> findAllMember(){
        List<UmsMember> members = service.findAllUser();
        return members;
    }

    @ResponseBody
    @RequestMapping("/deleteMember")
    public List<UmsMember> deleteMember(@RequestParam("id") String id){
        service.deleteMemberById(id);
        List<UmsMember> users = service.findAllUser();
        System.out.println(users);
        return users;
    }

    @RequestMapping("/updateMember")
    @ResponseBody
    public List<UmsMember> updateMember(UmsMember member){
        System.out.println(member);
        service.updateMember(member);
        List<UmsMember> users = service.findAllUser();
        System.out.println(users);
        return users;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public void findById(UmsMember member){
        System.out.println(member);
    }

    @ResponseBody
    @RequestMapping("/insert")
    public List<UmsMember> insertMember(UmsMember member){
        System.out.println(member);
        service.saveMember(member);
        List<UmsMember> users = service.findAllUser();
        return users;
    }









}
