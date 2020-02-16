package com.atguigu.gmall.user.mapper;



import com.atguigu.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public List<UmsMember> selectAllMember();

    public void updateMember(UmsMember member);

    public void deleteMemberById(@Param("id") String id);

    public void saveMember(UmsMember member);

}
