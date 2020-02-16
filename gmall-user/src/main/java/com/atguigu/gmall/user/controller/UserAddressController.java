package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserAddressController {

    @Autowired
    UserMemberReceiveAddressService service;

    @RequestMapping("/findAllMemberAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> findAllMember(){
        List<UmsMemberReceiveAddress> members = service.selectAllMember();
        return members;
    }

    @ResponseBody
    @RequestMapping("/deleteMemberAddress")
    public List<UmsMemberReceiveAddress> deleteMember(@RequestParam("id") String id){
        service.deleteMemberById(id);
        List<UmsMemberReceiveAddress> users = service.selectAllMember();
        System.out.println(users);
        return users;
    }

    @RequestMapping("/updateMemberAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> updateMember(UmsMemberReceiveAddress member){
        System.out.println(member);
        service.updateMember(member);
        List<UmsMemberReceiveAddress> users = service.selectAllMember();
        System.out.println(users);
        return users;
    }

    @RequestMapping("/findByIdMemberAddress")
    @ResponseBody
    public String findById(@RequestParam("id") String id){
        UmsMemberReceiveAddress user = service.findMemberById(id);
        return user.toString();
    }

    @ResponseBody
    @RequestMapping("/insertMemberAddress")
    public List<UmsMemberReceiveAddress> insertMember(UmsMemberReceiveAddress member){
        System.out.println(member);
        service.saveMember(member);
        List<UmsMemberReceiveAddress> users = service.selectAllMember();
        return users;
    }



}
