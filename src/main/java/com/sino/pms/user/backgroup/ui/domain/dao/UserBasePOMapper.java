package com.sino.pms.user.backgroup.ui.domain.dao;

import com.sino.pms.user.backgroup.ui.domain.po.UserBasePO;

public interface UserBasePOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserBasePO record);

    int insertSelective(UserBasePO record);

    UserBasePO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBasePO record);

    int updateByPrimaryKey(UserBasePO record);
}