package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2019-12-03 18:25:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
