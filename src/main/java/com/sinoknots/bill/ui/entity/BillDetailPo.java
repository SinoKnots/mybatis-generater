package com.sinoknots.bill.ui.entity;

/** 
* 
* @author sinoknots 
* @version V1.0.0
* @since V1.0.0(2019-06-10 22:47:20)
*/
public class BillDetailPo extends BaseEntity {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    private String billId;

    /**
     * 类型编号
     */
    private String typeId;

    /**
     * 金额，单位分
     */
    private Integer amount;

    /**
     * 账单类型编号
     */
    private String useTypeId;

    /**
     * 描述
     */
    private String billDesc;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 创建人
     */
    private String createrId;
}