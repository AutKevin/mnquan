package cn.mnquan.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class TbMnOrderDo extends Page{
    @SerializedName("trade_id")
    private BigDecimal tradeId;

    @SerializedName("trade_parent_id")
    private BigDecimal tradeParentId;

    @SerializedName("num_iid")
    private BigDecimal numIid;

    @SerializedName("item_title")
    private String itemTitle;

    @SerializedName("item_num")
    private Short itemNum;

    @SerializedName("price")
    private String price;

    @SerializedName("pay_price")
    private String payPrice;

    @SerializedName("seller_nick")
    private String sellerNick;

    @SerializedName("seller_shop_title")
    private String sellerShopTitle;

    @SerializedName("commission")
    private String commission;

    @SerializedName("commission_rate")
    private String commissionRate;

    @SerializedName("unid")
    private String unid;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("earning_time")
    private String earningTime;

    @SerializedName("tk_status")
    private Short tkStatus;

    @SerializedName("tk3rd_type")
    private String tk3rdType;

    @SerializedName("tk3rd_pub_id")
    private BigDecimal tk3rdPubId;

    @SerializedName("order_type")
    private String orderType;

    @SerializedName("income_rate")
    private String incomeRate;

    @SerializedName("pub_share_pre_fee")
    private String pubSharePreFee;

    @SerializedName("subsidy_rate")
    private String subsidyRate;

    @SerializedName("subsidy_type")
    private String subsidyType;

    @SerializedName("terminal_type")
    private String terminalType;

    @SerializedName("auction_category")
    private String auctionCategory;

    @SerializedName("site_id")
    private String siteId;

    @SerializedName("site_name")
    private String siteName;

    @SerializedName("adzone_id")
    private String adzoneId;

    @SerializedName("adzone_name")
    private String adzoneName;

    @SerializedName("alipay_total_price")
    private String alipayTotalPrice;

    @SerializedName("total_commission_rate")
    private String totalCommissionRate;

    @SerializedName("total_commission_fee")
    private String totalCommissionFee;

    @SerializedName("subsidy_fee")
    private String subsidyFee;

    @SerializedName("relation_id")
    private BigDecimal relationId;

    @SerializedName("special_id")
    private BigDecimal specialId;

    private String pictUrl;

    public BigDecimal getTradeId() {
        return tradeId;
    }

    public void setTradeId(BigDecimal tradeId) {
        this.tradeId = tradeId;
    }

    public BigDecimal getTradeParentId() {
        return tradeParentId;
    }

    public void setTradeParentId(BigDecimal tradeParentId) {
        this.tradeParentId = tradeParentId;
    }

    public BigDecimal getNumIid() {
        return numIid;
    }

    public void setNumIid(BigDecimal numIid) {
        this.numIid = numIid;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Short getItemNum() {
        return itemNum;
    }

    public void setItemNum(Short itemNum) {
        this.itemNum = itemNum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(String payPrice) {
        this.payPrice = payPrice;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getSellerShopTitle() {
        return sellerShopTitle;
    }

    public void setSellerShopTitle(String sellerShopTitle) {
        this.sellerShopTitle = sellerShopTitle;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEarningTime() {
        return earningTime;
    }

    public void setEarningTime(String earningTime) {
        this.earningTime = earningTime;
    }

    public Short getTkStatus() {
        return tkStatus;
    }

    public void setTkStatus(Short tkStatus) {
        this.tkStatus = tkStatus;
    }

    public String getTk3rdType() {
        return tk3rdType;
    }

    public void setTk3rdType(String tk3rdType) {
        this.tk3rdType = tk3rdType;
    }

    public BigDecimal getTk3rdPubId() {
        return tk3rdPubId;
    }

    public void setTk3rdPubId(BigDecimal tk3rdPubId) {
        this.tk3rdPubId = tk3rdPubId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getIncomeRate() {
        return incomeRate;
    }

    public void setIncomeRate(String incomeRate) {
        this.incomeRate = incomeRate;
    }

    public String getPubSharePreFee() {
        return pubSharePreFee;
    }

    public void setPubSharePreFee(String pubSharePreFee) {
        this.pubSharePreFee = pubSharePreFee;
    }

    public String getSubsidyRate() {
        return subsidyRate;
    }

    public void setSubsidyRate(String subsidyRate) {
        this.subsidyRate = subsidyRate;
    }

    public String getSubsidyType() {
        return subsidyType;
    }

    public void setSubsidyType(String subsidyType) {
        this.subsidyType = subsidyType;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getAuctionCategory() {
        return auctionCategory;
    }

    public void setAuctionCategory(String auctionCategory) {
        this.auctionCategory = auctionCategory;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getAdzoneId() {
        return adzoneId;
    }

    public void setAdzoneId(String adzoneId) {
        this.adzoneId = adzoneId;
    }

    public String getAdzoneName() {
        return adzoneName;
    }

    public void setAdzoneName(String adzoneName) {
        this.adzoneName = adzoneName;
    }

    public String getAlipayTotalPrice() {
        return alipayTotalPrice;
    }

    public void setAlipayTotalPrice(String alipayTotalPrice) {
        this.alipayTotalPrice = alipayTotalPrice;
    }

    public String getTotalCommissionRate() {
        return totalCommissionRate;
    }

    public void setTotalCommissionRate(String totalCommissionRate) {
        this.totalCommissionRate = totalCommissionRate;
    }

    public String getTotalCommissionFee() {
        return totalCommissionFee;
    }

    public void setTotalCommissionFee(String totalCommissionFee) {
        this.totalCommissionFee = totalCommissionFee;
    }

    public String getSubsidyFee() {
        return subsidyFee;
    }

    public void setSubsidyFee(String subsidyFee) {
        this.subsidyFee = subsidyFee;
    }

    public BigDecimal getRelationId() {
        return relationId;
    }

    public void setRelationId(BigDecimal relationId) {
        this.relationId = relationId;
    }

    public BigDecimal getSpecialId() {
        return specialId;
    }

    public void setSpecialId(BigDecimal specialId) {
        this.specialId = specialId;
    }

    public String getPictUrl() {
        return pictUrl;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl;
    }
}