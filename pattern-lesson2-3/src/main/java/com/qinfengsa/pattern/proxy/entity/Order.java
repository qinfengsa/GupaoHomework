package com.qinfengsa.pattern.proxy.entity;

import java.util.Date;

/**
 * 订单
 * @author: qinfengsa
 * @date: 2019/3/17 23:25
 */
public class Order implements Cloneable {



    /**
     * 工单id
     */
    private Long id;

    private Date createDate;

    /**
     * 工单号
     */
    private String orderNo;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 品牌
     */
    private String brandName;

    /**
     * 产品编码
     */
    private String itemCode;

    /**
     * 产品名称
     */
    private String itemName;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户手机/电话
     */
    private String userMobile;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    /**
     * 克隆方法
     * @author qinfengsa
     * @date 2019/3/18 0:04
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", userName='" + userName + '\'' +
                ", userMobile='" + userMobile + '\'' +
                '}';
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
