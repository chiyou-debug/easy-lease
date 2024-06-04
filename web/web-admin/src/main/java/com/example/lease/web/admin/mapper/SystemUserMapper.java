package com.example.lease.web.admin.mapper;

import com.example.lease.model.entity.SystemUser;
import com.example.lease.web.admin.vo.system.user.SystemUserItemVo;
import com.example.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author liubo
 * @description 针对表【system_user(员工信息表)】的数据库操作Mapper
 * @createDate 2023-07-24 15:48:00
 * @Entity com.example.lease.model.SystemUser
 */
public interface SystemUserMapper extends BaseMapper<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);
}




