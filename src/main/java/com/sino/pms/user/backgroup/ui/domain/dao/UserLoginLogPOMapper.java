package com.sino.pms.user.backgroup.ui.domain.dao;

import com.sino.pms.user.backgroup.ui.domain.po.UserLoginLogPO;

public interface UserLoginLogPOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLoginLogPO record);

    int insertSelective(UserLoginLogPO record);

    UserLoginLogPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLoginLogPO record);

    int updateByPrimaryKey(UserLoginLogPO record);
}