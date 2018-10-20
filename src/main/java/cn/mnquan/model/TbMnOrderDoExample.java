package cn.mnquan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbMnOrderDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMnOrderDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTradeIdIsNull() {
            addCriterion("trade_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(BigDecimal value) {
            addCriterion("trade_id =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(BigDecimal value) {
            addCriterion("trade_id <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(BigDecimal value) {
            addCriterion("trade_id >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_id >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(BigDecimal value) {
            addCriterion("trade_id <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_id <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<BigDecimal> values) {
            addCriterion("trade_id in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<BigDecimal> values) {
            addCriterion("trade_id not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_id between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_id not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdIsNull() {
            addCriterion("trade_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdIsNotNull() {
            addCriterion("trade_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdEqualTo(BigDecimal value) {
            addCriterion("trade_parent_id =", value, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdNotEqualTo(BigDecimal value) {
            addCriterion("trade_parent_id <>", value, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdGreaterThan(BigDecimal value) {
            addCriterion("trade_parent_id >", value, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_parent_id >=", value, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdLessThan(BigDecimal value) {
            addCriterion("trade_parent_id <", value, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_parent_id <=", value, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdIn(List<BigDecimal> values) {
            addCriterion("trade_parent_id in", values, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdNotIn(List<BigDecimal> values) {
            addCriterion("trade_parent_id not in", values, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_parent_id between", value1, value2, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andTradeParentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_parent_id not between", value1, value2, "tradeParentId");
            return (Criteria) this;
        }

        public Criteria andNumIidIsNull() {
            addCriterion("num_iid is null");
            return (Criteria) this;
        }

        public Criteria andNumIidIsNotNull() {
            addCriterion("num_iid is not null");
            return (Criteria) this;
        }

        public Criteria andNumIidEqualTo(BigDecimal value) {
            addCriterion("num_iid =", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotEqualTo(BigDecimal value) {
            addCriterion("num_iid <>", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidGreaterThan(BigDecimal value) {
            addCriterion("num_iid >", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("num_iid >=", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidLessThan(BigDecimal value) {
            addCriterion("num_iid <", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("num_iid <=", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidIn(List<BigDecimal> values) {
            addCriterion("num_iid in", values, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotIn(List<BigDecimal> values) {
            addCriterion("num_iid not in", values, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("num_iid between", value1, value2, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("num_iid not between", value1, value2, "numIid");
            return (Criteria) this;
        }

        public Criteria andItemTitleIsNull() {
            addCriterion("item_title is null");
            return (Criteria) this;
        }

        public Criteria andItemTitleIsNotNull() {
            addCriterion("item_title is not null");
            return (Criteria) this;
        }

        public Criteria andItemTitleEqualTo(String value) {
            addCriterion("item_title =", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotEqualTo(String value) {
            addCriterion("item_title <>", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleGreaterThan(String value) {
            addCriterion("item_title >", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleGreaterThanOrEqualTo(String value) {
            addCriterion("item_title >=", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLessThan(String value) {
            addCriterion("item_title <", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLessThanOrEqualTo(String value) {
            addCriterion("item_title <=", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLike(String value) {
            addCriterion("item_title like", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotLike(String value) {
            addCriterion("item_title not like", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleIn(List<String> values) {
            addCriterion("item_title in", values, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotIn(List<String> values) {
            addCriterion("item_title not in", values, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleBetween(String value1, String value2) {
            addCriterion("item_title between", value1, value2, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotBetween(String value1, String value2) {
            addCriterion("item_title not between", value1, value2, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNull() {
            addCriterion("item_num is null");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNotNull() {
            addCriterion("item_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumEqualTo(Short value) {
            addCriterion("item_num =", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotEqualTo(Short value) {
            addCriterion("item_num <>", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThan(Short value) {
            addCriterion("item_num >", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThanOrEqualTo(Short value) {
            addCriterion("item_num >=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThan(Short value) {
            addCriterion("item_num <", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThanOrEqualTo(Short value) {
            addCriterion("item_num <=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumIn(List<Short> values) {
            addCriterion("item_num in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotIn(List<Short> values) {
            addCriterion("item_num not in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumBetween(Short value1, Short value2) {
            addCriterion("item_num between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotBetween(Short value1, Short value2) {
            addCriterion("item_num not between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(String value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(String value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(String value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(String value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(String value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLike(String value) {
            addCriterion("pay_price like", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotLike(String value) {
            addCriterion("pay_price not like", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<String> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<String> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(String value1, String value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(String value1, String value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andSellerNickIsNull() {
            addCriterion("seller_nick is null");
            return (Criteria) this;
        }

        public Criteria andSellerNickIsNotNull() {
            addCriterion("seller_nick is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNickEqualTo(String value) {
            addCriterion("seller_nick =", value, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickNotEqualTo(String value) {
            addCriterion("seller_nick <>", value, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickGreaterThan(String value) {
            addCriterion("seller_nick >", value, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickGreaterThanOrEqualTo(String value) {
            addCriterion("seller_nick >=", value, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickLessThan(String value) {
            addCriterion("seller_nick <", value, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickLessThanOrEqualTo(String value) {
            addCriterion("seller_nick <=", value, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickLike(String value) {
            addCriterion("seller_nick like", value, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickNotLike(String value) {
            addCriterion("seller_nick not like", value, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickIn(List<String> values) {
            addCriterion("seller_nick in", values, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickNotIn(List<String> values) {
            addCriterion("seller_nick not in", values, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickBetween(String value1, String value2) {
            addCriterion("seller_nick between", value1, value2, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerNickNotBetween(String value1, String value2) {
            addCriterion("seller_nick not between", value1, value2, "sellerNick");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleIsNull() {
            addCriterion("seller_shop_title is null");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleIsNotNull() {
            addCriterion("seller_shop_title is not null");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleEqualTo(String value) {
            addCriterion("seller_shop_title =", value, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleNotEqualTo(String value) {
            addCriterion("seller_shop_title <>", value, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleGreaterThan(String value) {
            addCriterion("seller_shop_title >", value, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleGreaterThanOrEqualTo(String value) {
            addCriterion("seller_shop_title >=", value, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleLessThan(String value) {
            addCriterion("seller_shop_title <", value, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleLessThanOrEqualTo(String value) {
            addCriterion("seller_shop_title <=", value, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleLike(String value) {
            addCriterion("seller_shop_title like", value, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleNotLike(String value) {
            addCriterion("seller_shop_title not like", value, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleIn(List<String> values) {
            addCriterion("seller_shop_title in", values, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleNotIn(List<String> values) {
            addCriterion("seller_shop_title not in", values, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleBetween(String value1, String value2) {
            addCriterion("seller_shop_title between", value1, value2, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andSellerShopTitleNotBetween(String value1, String value2) {
            addCriterion("seller_shop_title not between", value1, value2, "sellerShopTitle");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(String value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(String value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(String value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(String value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(String value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(String value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLike(String value) {
            addCriterion("commission like", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotLike(String value) {
            addCriterion("commission not like", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<String> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<String> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(String value1, String value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(String value1, String value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(String value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(String value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(String value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(String value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(String value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(String value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLike(String value) {
            addCriterion("commission_rate like", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotLike(String value) {
            addCriterion("commission_rate not like", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<String> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<String> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(String value1, String value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(String value1, String value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andUnidIsNull() {
            addCriterion("unid is null");
            return (Criteria) this;
        }

        public Criteria andUnidIsNotNull() {
            addCriterion("unid is not null");
            return (Criteria) this;
        }

        public Criteria andUnidEqualTo(String value) {
            addCriterion("unid =", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotEqualTo(String value) {
            addCriterion("unid <>", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidGreaterThan(String value) {
            addCriterion("unid >", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidGreaterThanOrEqualTo(String value) {
            addCriterion("unid >=", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidLessThan(String value) {
            addCriterion("unid <", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidLessThanOrEqualTo(String value) {
            addCriterion("unid <=", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidLike(String value) {
            addCriterion("unid like", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotLike(String value) {
            addCriterion("unid not like", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidIn(List<String> values) {
            addCriterion("unid in", values, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotIn(List<String> values) {
            addCriterion("unid not in", values, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidBetween(String value1, String value2) {
            addCriterion("unid between", value1, value2, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotBetween(String value1, String value2) {
            addCriterion("unid not between", value1, value2, "unid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeIsNull() {
            addCriterion("earning_time is null");
            return (Criteria) this;
        }

        public Criteria andEarningTimeIsNotNull() {
            addCriterion("earning_time is not null");
            return (Criteria) this;
        }

        public Criteria andEarningTimeEqualTo(String value) {
            addCriterion("earning_time =", value, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeNotEqualTo(String value) {
            addCriterion("earning_time <>", value, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeGreaterThan(String value) {
            addCriterion("earning_time >", value, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("earning_time >=", value, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeLessThan(String value) {
            addCriterion("earning_time <", value, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeLessThanOrEqualTo(String value) {
            addCriterion("earning_time <=", value, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeLike(String value) {
            addCriterion("earning_time like", value, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeNotLike(String value) {
            addCriterion("earning_time not like", value, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeIn(List<String> values) {
            addCriterion("earning_time in", values, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeNotIn(List<String> values) {
            addCriterion("earning_time not in", values, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeBetween(String value1, String value2) {
            addCriterion("earning_time between", value1, value2, "earningTime");
            return (Criteria) this;
        }

        public Criteria andEarningTimeNotBetween(String value1, String value2) {
            addCriterion("earning_time not between", value1, value2, "earningTime");
            return (Criteria) this;
        }

        public Criteria andTkStatusIsNull() {
            addCriterion("tk_status is null");
            return (Criteria) this;
        }

        public Criteria andTkStatusIsNotNull() {
            addCriterion("tk_status is not null");
            return (Criteria) this;
        }

        public Criteria andTkStatusEqualTo(Short value) {
            addCriterion("tk_status =", value, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusNotEqualTo(Short value) {
            addCriterion("tk_status <>", value, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusGreaterThan(Short value) {
            addCriterion("tk_status >", value, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tk_status >=", value, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusLessThan(Short value) {
            addCriterion("tk_status <", value, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusLessThanOrEqualTo(Short value) {
            addCriterion("tk_status <=", value, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusIn(List<Short> values) {
            addCriterion("tk_status in", values, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusNotIn(List<Short> values) {
            addCriterion("tk_status not in", values, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusBetween(Short value1, Short value2) {
            addCriterion("tk_status between", value1, value2, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTkStatusNotBetween(Short value1, Short value2) {
            addCriterion("tk_status not between", value1, value2, "tkStatus");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeIsNull() {
            addCriterion("tk3rd_type is null");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeIsNotNull() {
            addCriterion("tk3rd_type is not null");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeEqualTo(String value) {
            addCriterion("tk3rd_type =", value, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeNotEqualTo(String value) {
            addCriterion("tk3rd_type <>", value, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeGreaterThan(String value) {
            addCriterion("tk3rd_type >", value, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tk3rd_type >=", value, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeLessThan(String value) {
            addCriterion("tk3rd_type <", value, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeLessThanOrEqualTo(String value) {
            addCriterion("tk3rd_type <=", value, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeLike(String value) {
            addCriterion("tk3rd_type like", value, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeNotLike(String value) {
            addCriterion("tk3rd_type not like", value, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeIn(List<String> values) {
            addCriterion("tk3rd_type in", values, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeNotIn(List<String> values) {
            addCriterion("tk3rd_type not in", values, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeBetween(String value1, String value2) {
            addCriterion("tk3rd_type between", value1, value2, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdTypeNotBetween(String value1, String value2) {
            addCriterion("tk3rd_type not between", value1, value2, "tk3rdType");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdIsNull() {
            addCriterion("tk3rd_pub_id is null");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdIsNotNull() {
            addCriterion("tk3rd_pub_id is not null");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdEqualTo(BigDecimal value) {
            addCriterion("tk3rd_pub_id =", value, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdNotEqualTo(BigDecimal value) {
            addCriterion("tk3rd_pub_id <>", value, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdGreaterThan(BigDecimal value) {
            addCriterion("tk3rd_pub_id >", value, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tk3rd_pub_id >=", value, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdLessThan(BigDecimal value) {
            addCriterion("tk3rd_pub_id <", value, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tk3rd_pub_id <=", value, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdIn(List<BigDecimal> values) {
            addCriterion("tk3rd_pub_id in", values, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdNotIn(List<BigDecimal> values) {
            addCriterion("tk3rd_pub_id not in", values, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tk3rd_pub_id between", value1, value2, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andTk3rdPubIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tk3rd_pub_id not between", value1, value2, "tk3rdPubId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andIncomeRateIsNull() {
            addCriterion("income_rate is null");
            return (Criteria) this;
        }

        public Criteria andIncomeRateIsNotNull() {
            addCriterion("income_rate is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeRateEqualTo(String value) {
            addCriterion("income_rate =", value, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateNotEqualTo(String value) {
            addCriterion("income_rate <>", value, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateGreaterThan(String value) {
            addCriterion("income_rate >", value, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateGreaterThanOrEqualTo(String value) {
            addCriterion("income_rate >=", value, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateLessThan(String value) {
            addCriterion("income_rate <", value, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateLessThanOrEqualTo(String value) {
            addCriterion("income_rate <=", value, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateLike(String value) {
            addCriterion("income_rate like", value, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateNotLike(String value) {
            addCriterion("income_rate not like", value, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateIn(List<String> values) {
            addCriterion("income_rate in", values, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateNotIn(List<String> values) {
            addCriterion("income_rate not in", values, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateBetween(String value1, String value2) {
            addCriterion("income_rate between", value1, value2, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andIncomeRateNotBetween(String value1, String value2) {
            addCriterion("income_rate not between", value1, value2, "incomeRate");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeIsNull() {
            addCriterion("pub_share_pre_fee is null");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeIsNotNull() {
            addCriterion("pub_share_pre_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeEqualTo(String value) {
            addCriterion("pub_share_pre_fee =", value, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeNotEqualTo(String value) {
            addCriterion("pub_share_pre_fee <>", value, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeGreaterThan(String value) {
            addCriterion("pub_share_pre_fee >", value, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeGreaterThanOrEqualTo(String value) {
            addCriterion("pub_share_pre_fee >=", value, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeLessThan(String value) {
            addCriterion("pub_share_pre_fee <", value, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeLessThanOrEqualTo(String value) {
            addCriterion("pub_share_pre_fee <=", value, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeLike(String value) {
            addCriterion("pub_share_pre_fee like", value, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeNotLike(String value) {
            addCriterion("pub_share_pre_fee not like", value, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeIn(List<String> values) {
            addCriterion("pub_share_pre_fee in", values, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeNotIn(List<String> values) {
            addCriterion("pub_share_pre_fee not in", values, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeBetween(String value1, String value2) {
            addCriterion("pub_share_pre_fee between", value1, value2, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andPubSharePreFeeNotBetween(String value1, String value2) {
            addCriterion("pub_share_pre_fee not between", value1, value2, "pubSharePreFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateIsNull() {
            addCriterion("subsidy_rate is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateIsNotNull() {
            addCriterion("subsidy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateEqualTo(String value) {
            addCriterion("subsidy_rate =", value, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateNotEqualTo(String value) {
            addCriterion("subsidy_rate <>", value, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateGreaterThan(String value) {
            addCriterion("subsidy_rate >", value, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateGreaterThanOrEqualTo(String value) {
            addCriterion("subsidy_rate >=", value, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateLessThan(String value) {
            addCriterion("subsidy_rate <", value, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateLessThanOrEqualTo(String value) {
            addCriterion("subsidy_rate <=", value, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateLike(String value) {
            addCriterion("subsidy_rate like", value, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateNotLike(String value) {
            addCriterion("subsidy_rate not like", value, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateIn(List<String> values) {
            addCriterion("subsidy_rate in", values, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateNotIn(List<String> values) {
            addCriterion("subsidy_rate not in", values, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateBetween(String value1, String value2) {
            addCriterion("subsidy_rate between", value1, value2, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyRateNotBetween(String value1, String value2) {
            addCriterion("subsidy_rate not between", value1, value2, "subsidyRate");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeIsNull() {
            addCriterion("subsidy_type is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeIsNotNull() {
            addCriterion("subsidy_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeEqualTo(String value) {
            addCriterion("subsidy_type =", value, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeNotEqualTo(String value) {
            addCriterion("subsidy_type <>", value, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeGreaterThan(String value) {
            addCriterion("subsidy_type >", value, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("subsidy_type >=", value, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeLessThan(String value) {
            addCriterion("subsidy_type <", value, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeLessThanOrEqualTo(String value) {
            addCriterion("subsidy_type <=", value, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeLike(String value) {
            addCriterion("subsidy_type like", value, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeNotLike(String value) {
            addCriterion("subsidy_type not like", value, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeIn(List<String> values) {
            addCriterion("subsidy_type in", values, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeNotIn(List<String> values) {
            addCriterion("subsidy_type not in", values, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeBetween(String value1, String value2) {
            addCriterion("subsidy_type between", value1, value2, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andSubsidyTypeNotBetween(String value1, String value2) {
            addCriterion("subsidy_type not between", value1, value2, "subsidyType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("terminal_type is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("terminal_type is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(String value) {
            addCriterion("terminal_type =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(String value) {
            addCriterion("terminal_type <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(String value) {
            addCriterion("terminal_type >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_type >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(String value) {
            addCriterion("terminal_type <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("terminal_type <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLike(String value) {
            addCriterion("terminal_type like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotLike(String value) {
            addCriterion("terminal_type not like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<String> values) {
            addCriterion("terminal_type in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<String> values) {
            addCriterion("terminal_type not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(String value1, String value2) {
            addCriterion("terminal_type between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("terminal_type not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryIsNull() {
            addCriterion("auction_category is null");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryIsNotNull() {
            addCriterion("auction_category is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryEqualTo(String value) {
            addCriterion("auction_category =", value, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryNotEqualTo(String value) {
            addCriterion("auction_category <>", value, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryGreaterThan(String value) {
            addCriterion("auction_category >", value, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("auction_category >=", value, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryLessThan(String value) {
            addCriterion("auction_category <", value, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryLessThanOrEqualTo(String value) {
            addCriterion("auction_category <=", value, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryLike(String value) {
            addCriterion("auction_category like", value, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryNotLike(String value) {
            addCriterion("auction_category not like", value, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryIn(List<String> values) {
            addCriterion("auction_category in", values, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryNotIn(List<String> values) {
            addCriterion("auction_category not in", values, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryBetween(String value1, String value2) {
            addCriterion("auction_category between", value1, value2, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andAuctionCategoryNotBetween(String value1, String value2) {
            addCriterion("auction_category not between", value1, value2, "auctionCategory");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("site_id like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("site_id not like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("site_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("site_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("site_name =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("site_name <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("site_name >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_name >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("site_name <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("site_name <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("site_name like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("site_name not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("site_name in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("site_name not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("site_name between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("site_name not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdIsNull() {
            addCriterion("adzone_id is null");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdIsNotNull() {
            addCriterion("adzone_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdEqualTo(String value) {
            addCriterion("adzone_id =", value, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdNotEqualTo(String value) {
            addCriterion("adzone_id <>", value, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdGreaterThan(String value) {
            addCriterion("adzone_id >", value, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("adzone_id >=", value, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdLessThan(String value) {
            addCriterion("adzone_id <", value, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdLessThanOrEqualTo(String value) {
            addCriterion("adzone_id <=", value, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdLike(String value) {
            addCriterion("adzone_id like", value, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdNotLike(String value) {
            addCriterion("adzone_id not like", value, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdIn(List<String> values) {
            addCriterion("adzone_id in", values, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdNotIn(List<String> values) {
            addCriterion("adzone_id not in", values, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdBetween(String value1, String value2) {
            addCriterion("adzone_id between", value1, value2, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneIdNotBetween(String value1, String value2) {
            addCriterion("adzone_id not between", value1, value2, "adzoneId");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameIsNull() {
            addCriterion("adzone_name is null");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameIsNotNull() {
            addCriterion("adzone_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameEqualTo(String value) {
            addCriterion("adzone_name =", value, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameNotEqualTo(String value) {
            addCriterion("adzone_name <>", value, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameGreaterThan(String value) {
            addCriterion("adzone_name >", value, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("adzone_name >=", value, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameLessThan(String value) {
            addCriterion("adzone_name <", value, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameLessThanOrEqualTo(String value) {
            addCriterion("adzone_name <=", value, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameLike(String value) {
            addCriterion("adzone_name like", value, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameNotLike(String value) {
            addCriterion("adzone_name not like", value, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameIn(List<String> values) {
            addCriterion("adzone_name in", values, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameNotIn(List<String> values) {
            addCriterion("adzone_name not in", values, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameBetween(String value1, String value2) {
            addCriterion("adzone_name between", value1, value2, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAdzoneNameNotBetween(String value1, String value2) {
            addCriterion("adzone_name not between", value1, value2, "adzoneName");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceIsNull() {
            addCriterion("alipay_total_price is null");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceIsNotNull() {
            addCriterion("alipay_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceEqualTo(String value) {
            addCriterion("alipay_total_price =", value, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceNotEqualTo(String value) {
            addCriterion("alipay_total_price <>", value, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceGreaterThan(String value) {
            addCriterion("alipay_total_price >", value, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_total_price >=", value, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceLessThan(String value) {
            addCriterion("alipay_total_price <", value, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceLessThanOrEqualTo(String value) {
            addCriterion("alipay_total_price <=", value, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceLike(String value) {
            addCriterion("alipay_total_price like", value, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceNotLike(String value) {
            addCriterion("alipay_total_price not like", value, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceIn(List<String> values) {
            addCriterion("alipay_total_price in", values, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceNotIn(List<String> values) {
            addCriterion("alipay_total_price not in", values, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceBetween(String value1, String value2) {
            addCriterion("alipay_total_price between", value1, value2, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andAlipayTotalPriceNotBetween(String value1, String value2) {
            addCriterion("alipay_total_price not between", value1, value2, "alipayTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateIsNull() {
            addCriterion("total_commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateIsNotNull() {
            addCriterion("total_commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateEqualTo(String value) {
            addCriterion("total_commission_rate =", value, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateNotEqualTo(String value) {
            addCriterion("total_commission_rate <>", value, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateGreaterThan(String value) {
            addCriterion("total_commission_rate >", value, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateGreaterThanOrEqualTo(String value) {
            addCriterion("total_commission_rate >=", value, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateLessThan(String value) {
            addCriterion("total_commission_rate <", value, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateLessThanOrEqualTo(String value) {
            addCriterion("total_commission_rate <=", value, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateLike(String value) {
            addCriterion("total_commission_rate like", value, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateNotLike(String value) {
            addCriterion("total_commission_rate not like", value, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateIn(List<String> values) {
            addCriterion("total_commission_rate in", values, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateNotIn(List<String> values) {
            addCriterion("total_commission_rate not in", values, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateBetween(String value1, String value2) {
            addCriterion("total_commission_rate between", value1, value2, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionRateNotBetween(String value1, String value2) {
            addCriterion("total_commission_rate not between", value1, value2, "totalCommissionRate");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeIsNull() {
            addCriterion("total_commission_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeIsNotNull() {
            addCriterion("total_commission_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeEqualTo(String value) {
            addCriterion("total_commission_fee =", value, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeNotEqualTo(String value) {
            addCriterion("total_commission_fee <>", value, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeGreaterThan(String value) {
            addCriterion("total_commission_fee >", value, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeGreaterThanOrEqualTo(String value) {
            addCriterion("total_commission_fee >=", value, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeLessThan(String value) {
            addCriterion("total_commission_fee <", value, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeLessThanOrEqualTo(String value) {
            addCriterion("total_commission_fee <=", value, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeLike(String value) {
            addCriterion("total_commission_fee like", value, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeNotLike(String value) {
            addCriterion("total_commission_fee not like", value, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeIn(List<String> values) {
            addCriterion("total_commission_fee in", values, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeNotIn(List<String> values) {
            addCriterion("total_commission_fee not in", values, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeBetween(String value1, String value2) {
            addCriterion("total_commission_fee between", value1, value2, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionFeeNotBetween(String value1, String value2) {
            addCriterion("total_commission_fee not between", value1, value2, "totalCommissionFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeIsNull() {
            addCriterion("subsidy_fee is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeIsNotNull() {
            addCriterion("subsidy_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeEqualTo(String value) {
            addCriterion("subsidy_fee =", value, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeNotEqualTo(String value) {
            addCriterion("subsidy_fee <>", value, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeGreaterThan(String value) {
            addCriterion("subsidy_fee >", value, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeGreaterThanOrEqualTo(String value) {
            addCriterion("subsidy_fee >=", value, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeLessThan(String value) {
            addCriterion("subsidy_fee <", value, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeLessThanOrEqualTo(String value) {
            addCriterion("subsidy_fee <=", value, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeLike(String value) {
            addCriterion("subsidy_fee like", value, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeNotLike(String value) {
            addCriterion("subsidy_fee not like", value, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeIn(List<String> values) {
            addCriterion("subsidy_fee in", values, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeNotIn(List<String> values) {
            addCriterion("subsidy_fee not in", values, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeBetween(String value1, String value2) {
            addCriterion("subsidy_fee between", value1, value2, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andSubsidyFeeNotBetween(String value1, String value2) {
            addCriterion("subsidy_fee not between", value1, value2, "subsidyFee");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNull() {
            addCriterion("relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIdEqualTo(BigDecimal value) {
            addCriterion("relation_id =", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotEqualTo(BigDecimal value) {
            addCriterion("relation_id <>", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThan(BigDecimal value) {
            addCriterion("relation_id >", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("relation_id >=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThan(BigDecimal value) {
            addCriterion("relation_id <", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("relation_id <=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIn(List<BigDecimal> values) {
            addCriterion("relation_id in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotIn(List<BigDecimal> values) {
            addCriterion("relation_id not in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("relation_id between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("relation_id not between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNull() {
            addCriterion("special_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNotNull() {
            addCriterion("special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdEqualTo(BigDecimal value) {
            addCriterion("special_id =", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotEqualTo(BigDecimal value) {
            addCriterion("special_id <>", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThan(BigDecimal value) {
            addCriterion("special_id >", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("special_id >=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThan(BigDecimal value) {
            addCriterion("special_id <", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("special_id <=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIn(List<BigDecimal> values) {
            addCriterion("special_id in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotIn(List<BigDecimal> values) {
            addCriterion("special_id not in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("special_id between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("special_id not between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andPictUrlIsNull() {
            addCriterion("pict_url is null");
            return (Criteria) this;
        }

        public Criteria andPictUrlIsNotNull() {
            addCriterion("pict_url is not null");
            return (Criteria) this;
        }

        public Criteria andPictUrlEqualTo(String value) {
            addCriterion("pict_url =", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlNotEqualTo(String value) {
            addCriterion("pict_url <>", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlGreaterThan(String value) {
            addCriterion("pict_url >", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pict_url >=", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlLessThan(String value) {
            addCriterion("pict_url <", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlLessThanOrEqualTo(String value) {
            addCriterion("pict_url <=", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlLike(String value) {
            addCriterion("pict_url like", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlNotLike(String value) {
            addCriterion("pict_url not like", value, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlIn(List<String> values) {
            addCriterion("pict_url in", values, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlNotIn(List<String> values) {
            addCriterion("pict_url not in", values, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlBetween(String value1, String value2) {
            addCriterion("pict_url between", value1, value2, "pictUrl");
            return (Criteria) this;
        }

        public Criteria andPictUrlNotBetween(String value1, String value2) {
            addCriterion("pict_url not between", value1, value2, "pictUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}