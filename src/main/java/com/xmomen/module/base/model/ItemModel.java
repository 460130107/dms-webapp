package com.xmomen.module.base.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ItemModel implements Serializable {
	private Integer id;
	/**
     * 产品编号
     */
    private String itemCode;

    /**
     * 产品归属的类别
     */
    private Integer cdCategoryId;
    
    private String categoryName;

    /**
     * 产品名称
     */
    private String itemName;

    /**
     * 产品描述
     */
    private String itemDescribe;

    /**
     * 产品类型
     */
    private Integer itemType;

    /**
     * 生产地
     */
    private String yieldly;

    /**
     * 产品规格
     */
    private String spec;

    /**
     * 基础价格
     */
    private BigDecimal basePrice;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    /**
     * 计价方式
     */
    private String pricingManner;

    /**
     * 0-下架 1-上架
     */
    private Integer sellStatus;

    /**
     * 销售单位
     */
    private String sellUnit;

    /**
     * 销售金额
     */
    private BigDecimal sellPrice;

	/**
	 * 折扣价格
	 */
	private BigDecimal discountPrice;


    /**
     * 0-未审核，1-审核
     */
    private Integer isAudit;

    /**
     * 录入时间
     */
    private Date createDateTime;

    /**
     * 录入人
     */
    private String createUserCode;
    
    /**
     * 采摘人
     */
    private String caizaiUser;

    /**
     * 检测人
     */
    private String jianceUser;

    /**
     * 农残率
     */
    private String nongCanLv;

	/**
	 * 营养成分
	 */
	private String yiYangChenFen;

	/**
	 * 保质期
	 */
	private Integer baoZhiQi;

	/**
	 * 适应人群
	 */
	private String shiYiRenQun;

	/**
	 * 限时抢购
	 */
	private Integer xianShiQiangGou;

	/**
	 * 新品尝鲜
	 */
	private Integer xinPinChangXian;

	/**
	 * 热卖推荐
	 */
	private Integer reMaiTuiJian;

	private Integer itemDetailId;
	private String itemDetailContent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getCdCategoryId() {
		return cdCategoryId;
	}

	public void setCdCategoryId(Integer cdCategoryId) {
		this.cdCategoryId = cdCategoryId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescribe() {
		return itemDescribe;
	}

	public void setItemDescribe(String itemDescribe) {
		this.itemDescribe = itemDescribe;
	}

	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

	public String getYieldly() {
		return yieldly;
	}

	public void setYieldly(String yieldly) {
		this.yieldly = yieldly;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public BigDecimal getMemberPrice() {
		return memberPrice;
	}

	public void setMemberPrice(BigDecimal memberPrice) {
		this.memberPrice = memberPrice;
	}

	public String getPricingManner() {
		return pricingManner;
	}

	public void setPricingManner(String pricingManner) {
		this.pricingManner = pricingManner;
	}

	public Integer getSellStatus() {
		return sellStatus;
	}

	public void setSellStatus(Integer sellStatus) {
		this.sellStatus = sellStatus;
	}

	public String getSellUnit() {
		return sellUnit;
	}

	public void setSellUnit(String sellUnit) {
		this.sellUnit = sellUnit;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getIsAudit() {
		return isAudit;
	}

	public void setIsAudit(Integer isAudit) {
		this.isAudit = isAudit;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getCreateUserCode() {
		return createUserCode;
	}

	public void setCreateUserCode(String createUserCode) {
		this.createUserCode = createUserCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getCaizaiUser() {
		return caizaiUser;
	}

	public void setCaizaiUser(String caizaiUser) {
		this.caizaiUser = caizaiUser;
	}

	public String getJianceUser() {
		return jianceUser;
	}

	public void setJianceUser(String jianceUser) {
		this.jianceUser = jianceUser;
	}

	public String getNongCanLv() {
		return nongCanLv;
	}

	public void setNongCanLv(String nongCanLv) {
		this.nongCanLv = nongCanLv;
	}

	public String getYiYangChenFen() {
		return yiYangChenFen;
	}

	public void setYiYangChenFen(String yiYangChenFen) {
		this.yiYangChenFen = yiYangChenFen;
	}

	public Integer getBaoZhiQi() {
		return baoZhiQi;
	}

	public void setBaoZhiQi(Integer baoZhiQi) {
		this.baoZhiQi = baoZhiQi;
	}

	public String getShiYiRenQun() {
		return shiYiRenQun;
	}

	public void setShiYiRenQun(String shiYiRenQun) {
		this.shiYiRenQun = shiYiRenQun;
	}

	public Integer getXianShiQiangGou() {
		return xianShiQiangGou;
	}

	public void setXianShiQiangGou(Integer xianShiQiangGou) {
		this.xianShiQiangGou = xianShiQiangGou;
	}

	public Integer getXinPinChangXian() {
		return xinPinChangXian;
	}

	public void setXinPinChangXian(Integer xinPinChangXian) {
		this.xinPinChangXian = xinPinChangXian;
	}

	public Integer getReMaiTuiJian() {
		return reMaiTuiJian;
	}

	public void setReMaiTuiJian(Integer reMaiTuiJian) {
		this.reMaiTuiJian = reMaiTuiJian;
	}

	public Integer getItemDetailId() {
		return itemDetailId;
	}

	public void setItemDetailId(Integer itemDetailId) {
		this.itemDetailId = itemDetailId;
	}

	public String getItemDetailContent() {
		return itemDetailContent;
	}

	public void setItemDetailContent(String itemDetailContent) {
		this.itemDetailContent = itemDetailContent;
	}
}
