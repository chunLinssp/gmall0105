package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMemberReceiveAddressMapper {

    public List<UmsMemberReceiveAddress> selectAllMember();

    public void updateMember(UmsMemberReceiveAddress member);

    public void deleteMemberById(@Param("id") String id);

    public void saveMemberAddress(UmsMemberReceiveAddress member);

    public UmsMemberReceiveAddress findMemberAddressById(@Param("id")String id) ;

}
