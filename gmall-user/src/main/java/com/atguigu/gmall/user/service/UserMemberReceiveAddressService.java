package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMemberReceiveAddressService {
    public List<UmsMemberReceiveAddress> selectAllMember();

    public void updateMember(UmsMemberReceiveAddress member);

    public void deleteMemberById(@Param("id") String id);

    public void saveMember(UmsMemberReceiveAddress member);

    public UmsMemberReceiveAddress findMemberById(@Param("id")String id) ;

}
