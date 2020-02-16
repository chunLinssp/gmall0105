package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;


    @Override
    public List<UmsMember> findAllUser() {
        return mapper.selectAllMember();
    }

    @Override
    public void updateMember(UmsMember member) {
        mapper.updateMember(member);
    }

    @Override
    public void deleteMemberById(String id) {
        mapper.deleteMemberById(id);
    }

    @Override
    public void saveMember(UmsMember member) {
        mapper.saveMember(member);
    }


}
