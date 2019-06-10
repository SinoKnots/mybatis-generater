package com.sinoknots.bill.ui.entity;

import com.sinoknots.bill.ui.entity.BillTypePo;

/**
* 
* @author sinoknots 
* @version V1.0.0
* @since V1.0.0(2019-06-11 01:35:17)
*/
public interface BillTypePoDao {
    int deleteByPrimaryKey(String typeId);

    int insert(BillTypePo record);

    int insertSelective(BillTypePo record);

    BillTypePo selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(BillTypePo record);

    int updateByPrimaryKey(BillTypePo record);
}