package com.sinoknots.bill.ui.entity;

import com.sinoknots.bill.ui.entity.BillDetailPo;

/**
* 
* @author sinoknots 
* @version V1.0.0
* @since V1.0.0(2019-06-11 01:35:17)
*/
public interface BillDetailPoDao {
    int deleteByPrimaryKey(String billId);

    int insert(BillDetailPo record);

    int insertSelective(BillDetailPo record);

    BillDetailPo selectByPrimaryKey(String billId);

    int updateByPrimaryKeySelective(BillDetailPo record);

    int updateByPrimaryKey(BillDetailPo record);
}