package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenyv
 * @email chenyv19980616@163.com
 * @date 2024-07-08 21:23:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
