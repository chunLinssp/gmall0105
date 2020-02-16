package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMemberReceiveAddressMapper;
import com.atguigu.gmall.user.service.UserMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMemberReceiveAddressServiceImpl implements UserMemberReceiveAddressService {

    @Autowired
    UserMemberReceiveAddressMapper mapper;

    @Override
    public List<UmsMemberReceiveAddress> selectAllMember() {
        return mapper.selectAllMember();
    }

    @Override
    public void updateMember(UmsMemberReceiveAddress member) {
        mapper.updateMember(member);
    }

    @Override
    public void deleteMemberById(String id) {
        mapper.deleteMemberById(id);
    }

    @Override
    public void saveMember(UmsMemberReceiveAddress member) {
        mapper.saveMemberAddress(member);
    }

    @Override
    public UmsMemberReceiveAddress findMemberById(String id) {
        return mapper.findMemberAddressById(id);
    }
}
