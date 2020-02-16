package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserService {

    public List<UmsMember> findAllUser();

    public void updateMember(UmsMember member);

    public void deleteMemberById(String id);

    public void saveMember(UmsMember member);

}
