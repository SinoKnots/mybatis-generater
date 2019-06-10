package com.sinoknots.bill.ui.entity;

import com.sinoknots.bill.ui.entity.BillTypePo;

/**
* 
* @author sinoknots 
* @version V1.0.0
* @since V1.0.0(2019-06-10 23:17:17)
*/
public interface BillTypePoDao {
    int insert(BillTypePo record);

    int insertSelective(BillTypePo record);
}