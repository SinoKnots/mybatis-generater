package com.sinoknots.bill.ui.entity;

/** 
* 
* @author sinoknots 
* @version V1.0.0
* @since V1.0.0(2019-06-10 23:17:17)
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
    private Long createTime;

    /**
     * 创建人
     */
    private String createrId;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUseTypeId() {
        return useTypeId;
    }

    public void setUseTypeId(String useTypeId) {
        this.useTypeId = useTypeId == null ? null : useTypeId.trim();
    }

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc == null ? null : billDesc.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId == null ? null : createrId.trim();
    }
}