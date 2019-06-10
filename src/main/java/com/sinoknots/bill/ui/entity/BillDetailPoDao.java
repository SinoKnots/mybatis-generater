package com.sinoknots.bill.ui.entity;

import com.sinoknots.bill.ui.entity.BillDetailPo;

/**
* 
* @author sinoknots 
* @version V1.0.0
* @since V1.0.0(2019-06-10 23:17:17)
*/
public interface BillDetailPoDao {
    int insert(BillDetailPo record);

    int insertSelective(BillDetailPo record);
}