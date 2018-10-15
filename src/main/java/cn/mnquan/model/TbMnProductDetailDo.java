package cn.mnquan.model;

import java.math.BigDecimal;

public class TbMnProductDetailDo {
    private Long id;

    private String catName;

    private Long numIid;

    private String title;

    private String pictUrl;

    private String smallImages;

    private String reservePrice;

    private String zkFinalPrice;

    private Long userType;

    private String provcity;

    private String itemUrl;

    private Long sellerId;

    private Long volume;

    private String nick;

    private String catLeafName;

    private Boolean isPrepay;

    private Long shopDsr;

    private Long ratesum;

    private Boolean iRfdRate;

    private Boolean hGoodRate;

    private Boolean hPayRate30;

    private Boolean freeShipment;

    private String materialLibType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Long getNumIid() {
        return numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPictUrl() {
        return pictUrl;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl;
    }

    public String getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(String smallImages) {
        this.smallImages = smallImages;
    }

    public String getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(String reservePrice) {
        this.reservePrice = reservePrice;
    }

    public String getZkFinalPrice() {
        return zkFinalPrice;
    }

    public void setZkFinalPrice(String zkFinalPrice) {
        this.zkFinalPrice = zkFinalPrice;
    }

    public Long getUserType() {
        return userType;
    }

    public void setUserType(Long userType) {
        this.userType = userType;
    }

    public String getProvcity() {
        return provcity;
    }

    public void setProvcity(String provcity) {
        this.provcity = provcity;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getCatLeafName() {
        return catLeafName;
    }

    public void setCatLeafName(String catLeafName) {
        this.catLeafName = catLeafName;
    }

    public Boolean getIsPrepay() {
        return isPrepay;
    }

    public void setIsPrepay(Boolean isPrepay) {
        this.isPrepay = isPrepay;
    }

    public Long getShopDsr() {
        return shopDsr;
    }

    public void setShopDsr(Long shopDsr) {
        this.shopDsr = shopDsr;
    }

    public Long getRatesum() {
        return ratesum;
    }

    public void setRatesum(Long ratesum) {
        this.ratesum = ratesum;
    }

    public Boolean getiRfdRate() {
        return iRfdRate;
    }

    public void setiRfdRate(Boolean iRfdRate) {
        this.iRfdRate = iRfdRate;
    }

    public Boolean gethGoodRate() {
        return hGoodRate;
    }

    public void sethGoodRate(Boolean hGoodRate) {
        this.hGoodRate = hGoodRate;
    }

    public Boolean gethPayRate30() {
        return hPayRate30;
    }

    public void sethPayRate30(Boolean hPayRate30) {
        this.hPayRate30 = hPayRate30;
    }

    public Boolean getFreeShipment() {
        return freeShipment;
    }

    public void setFreeShipment(Boolean freeShipment) {
        this.freeShipment = freeShipment;
    }

    public String getMaterialLibType() {
        return materialLibType;
    }

    public void setMaterialLibType(String materialLibType) {
        this.materialLibType = materialLibType;
    }
}