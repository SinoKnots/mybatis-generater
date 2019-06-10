package com.sinoknots.bill.ui.entity;

/** 
* 
* @author sinoknots 
* @version V1.0.0
* @since V1.0.0(2019-06-10 22:47:20)
*/
public class BillTypePo extends BaseEntity {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 类型编号
     */
    private String typeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 类型描述
     */
    private String typeDesc;

    /**
     * 创建人
     */
    private String createrId;

    /**
     * 创建时间
     */
    private Integer createTime;
}