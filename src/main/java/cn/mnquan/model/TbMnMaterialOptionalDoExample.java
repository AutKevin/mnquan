package cn.mnquan.model;

import java.util.ArrayList;
import java.util.List;

public class TbMnMaterialOptionalDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMnMaterialOptionalDoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNull() {
            addCriterion("coupon_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNotNull() {
            addCriterion("coupon_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeEqualTo(String value) {
            addCriterion("coupon_start_time =", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotEqualTo(String value) {
            addCriterion("coupon_start_time <>", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThan(String value) {
            addCriterion("coupon_start_time >", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_start_time >=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThan(String value) {
            addCriterion("coupon_start_time <", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanOrEqualTo(String value) {
            addCriterion("coupon_start_time <=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLike(String value) {
            addCriterion("coupon_start_time like", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotLike(String value) {
            addCriterion("coupon_start_time not like", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIn(List<String> values) {
            addCriterion("coupon_start_time in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotIn(List<String> values) {
            addCriterion("coupon_start_time not in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeBetween(String value1, String value2) {
            addCriterion("coupon_start_time between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotBetween(String value1, String value2) {
            addCriterion("coupon_start_time not between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNull() {
            addCriterion("coupon_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNotNull() {
            addCriterion("coupon_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeEqualTo(String value) {
            addCriterion("coupon_end_time =", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotEqualTo(String value) {
            addCriterion("coupon_end_time <>", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThan(String value) {
            addCriterion("coupon_end_time >", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_end_time >=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThan(String value) {
            addCriterion("coupon_end_time <", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThanOrEqualTo(String value) {
            addCriterion("coupon_end_time <=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLike(String value) {
            addCriterion("coupon_end_time like", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotLike(String value) {
            addCriterion("coupon_end_time not like", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIn(List<String> values) {
            addCriterion("coupon_end_time in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotIn(List<String> values) {
            addCriterion("coupon_end_time not in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeBetween(String value1, String value2) {
            addCriterion("coupon_end_time between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotBetween(String value1, String value2) {
            addCriterion("coupon_end_time not between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhIsNull() {
            addCriterion("info_dxjh is null");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhIsNotNull() {
            addCriterion("info_dxjh is not null");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhEqualTo(String value) {
            addCriterion("info_dxjh =", value, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhNotEqualTo(String value) {
            addCriterion("info_dxjh <>", value, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhGreaterThan(String value) {
            addCriterion("info_dxjh >", value, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhGreaterThanOrEqualTo(String value) {
            addCriterion("info_dxjh >=", value, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhLessThan(String value) {
            addCriterion("info_dxjh <", value, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhLessThanOrEqualTo(String value) {
            addCriterion("info_dxjh <=", value, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhLike(String value) {
            addCriterion("info_dxjh like", value, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhNotLike(String value) {
            addCriterion("info_dxjh not like", value, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhIn(List<String> values) {
            addCriterion("info_dxjh in", values, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhNotIn(List<String> values) {
            addCriterion("info_dxjh not in", values, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhBetween(String value1, String value2) {
            addCriterion("info_dxjh between", value1, value2, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andInfoDxjhNotBetween(String value1, String value2) {
            addCriterion("info_dxjh not between", value1, value2, "infoDxjh");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesIsNull() {
            addCriterion("tk_total_sales is null");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesIsNotNull() {
            addCriterion("tk_total_sales is not null");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesEqualTo(String value) {
            addCriterion("tk_total_sales =", value, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesNotEqualTo(String value) {
            addCriterion("tk_total_sales <>", value, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesGreaterThan(String value) {
            addCriterion("tk_total_sales >", value, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesGreaterThanOrEqualTo(String value) {
            addCriterion("tk_total_sales >=", value, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesLessThan(String value) {
            addCriterion("tk_total_sales <", value, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesLessThanOrEqualTo(String value) {
            addCriterion("tk_total_sales <=", value, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesLike(String value) {
            addCriterion("tk_total_sales like", value, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesNotLike(String value) {
            addCriterion("tk_total_sales not like", value, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesIn(List<String> values) {
            addCriterion("tk_total_sales in", values, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesNotIn(List<String> values) {
            addCriterion("tk_total_sales not in", values, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesBetween(String value1, String value2) {
            addCriterion("tk_total_sales between", value1, value2, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalSalesNotBetween(String value1, String value2) {
            addCriterion("tk_total_sales not between", value1, value2, "tkTotalSales");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiIsNull() {
            addCriterion("tk_total_commi is null");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiIsNotNull() {
            addCriterion("tk_total_commi is not null");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiEqualTo(String value) {
            addCriterion("tk_total_commi =", value, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiNotEqualTo(String value) {
            addCriterion("tk_total_commi <>", value, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiGreaterThan(String value) {
            addCriterion("tk_total_commi >", value, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiGreaterThanOrEqualTo(String value) {
            addCriterion("tk_total_commi >=", value, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiLessThan(String value) {
            addCriterion("tk_total_commi <", value, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiLessThanOrEqualTo(String value) {
            addCriterion("tk_total_commi <=", value, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiLike(String value) {
            addCriterion("tk_total_commi like", value, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiNotLike(String value) {
            addCriterion("tk_total_commi not like", value, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiIn(List<String> values) {
            addCriterion("tk_total_commi in", values, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiNotIn(List<String> values) {
            addCriterion("tk_total_commi not in", values, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiBetween(String value1, String value2) {
            addCriterion("tk_total_commi between", value1, value2, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andTkTotalCommiNotBetween(String value1, String value2) {
            addCriterion("tk_total_commi not between", value1, value2, "tkTotalCommi");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
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

        public Criteria andNumIidEqualTo(Long value) {
            addCriterion("num_iid =", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotEqualTo(Long value) {
            addCriterion("num_iid <>", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidGreaterThan(Long value) {
            addCriterion("num_iid >", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidGreaterThanOrEqualTo(Long value) {
            addCriterion("num_iid >=", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidLessThan(Long value) {
            addCriterion("num_iid <", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidLessThanOrEqualTo(Long value) {
            addCriterion("num_iid <=", value, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidIn(List<Long> values) {
            addCriterion("num_iid in", values, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotIn(List<Long> values) {
            addCriterion("num_iid not in", values, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidBetween(Long value1, Long value2) {
            addCriterion("num_iid between", value1, value2, "numIid");
            return (Criteria) this;
        }

        public Criteria andNumIidNotBetween(Long value1, Long value2) {
            addCriterion("num_iid not between", value1, value2, "numIid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andSmallImagesIsNull() {
            addCriterion("small_images is null");
            return (Criteria) this;
        }

        public Criteria andSmallImagesIsNotNull() {
            addCriterion("small_images is not null");
            return (Criteria) this;
        }

        public Criteria andSmallImagesEqualTo(String value) {
            addCriterion("small_images =", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotEqualTo(String value) {
            addCriterion("small_images <>", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesGreaterThan(String value) {
            addCriterion("small_images >", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesGreaterThanOrEqualTo(String value) {
            addCriterion("small_images >=", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLessThan(String value) {
            addCriterion("small_images <", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLessThanOrEqualTo(String value) {
            addCriterion("small_images <=", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLike(String value) {
            addCriterion("small_images like", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotLike(String value) {
            addCriterion("small_images not like", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesIn(List<String> values) {
            addCriterion("small_images in", values, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotIn(List<String> values) {
            addCriterion("small_images not in", values, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesBetween(String value1, String value2) {
            addCriterion("small_images between", value1, value2, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotBetween(String value1, String value2) {
            addCriterion("small_images not between", value1, value2, "smallImages");
            return (Criteria) this;
        }

        public Criteria andReservePriceIsNull() {
            addCriterion("reserve_price is null");
            return (Criteria) this;
        }

        public Criteria andReservePriceIsNotNull() {
            addCriterion("reserve_price is not null");
            return (Criteria) this;
        }

        public Criteria andReservePriceEqualTo(String value) {
            addCriterion("reserve_price =", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotEqualTo(String value) {
            addCriterion("reserve_price <>", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceGreaterThan(String value) {
            addCriterion("reserve_price >", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_price >=", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceLessThan(String value) {
            addCriterion("reserve_price <", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceLessThanOrEqualTo(String value) {
            addCriterion("reserve_price <=", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceLike(String value) {
            addCriterion("reserve_price like", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotLike(String value) {
            addCriterion("reserve_price not like", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceIn(List<String> values) {
            addCriterion("reserve_price in", values, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotIn(List<String> values) {
            addCriterion("reserve_price not in", values, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceBetween(String value1, String value2) {
            addCriterion("reserve_price between", value1, value2, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotBetween(String value1, String value2) {
            addCriterion("reserve_price not between", value1, value2, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceIsNull() {
            addCriterion("zk_final_price is null");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceIsNotNull() {
            addCriterion("zk_final_price is not null");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceEqualTo(String value) {
            addCriterion("zk_final_price =", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceNotEqualTo(String value) {
            addCriterion("zk_final_price <>", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceGreaterThan(String value) {
            addCriterion("zk_final_price >", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("zk_final_price >=", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceLessThan(String value) {
            addCriterion("zk_final_price <", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceLessThanOrEqualTo(String value) {
            addCriterion("zk_final_price <=", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceLike(String value) {
            addCriterion("zk_final_price like", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceNotLike(String value) {
            addCriterion("zk_final_price not like", value, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceIn(List<String> values) {
            addCriterion("zk_final_price in", values, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceNotIn(List<String> values) {
            addCriterion("zk_final_price not in", values, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceBetween(String value1, String value2) {
            addCriterion("zk_final_price between", value1, value2, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andZkFinalPriceNotBetween(String value1, String value2) {
            addCriterion("zk_final_price not between", value1, value2, "zkFinalPrice");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Long value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Long value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Long value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Long value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Long value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Long> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Long> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Long value1, Long value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Long value1, Long value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andProvcityIsNull() {
            addCriterion("provcity is null");
            return (Criteria) this;
        }

        public Criteria andProvcityIsNotNull() {
            addCriterion("provcity is not null");
            return (Criteria) this;
        }

        public Criteria andProvcityEqualTo(String value) {
            addCriterion("provcity =", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityNotEqualTo(String value) {
            addCriterion("provcity <>", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityGreaterThan(String value) {
            addCriterion("provcity >", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityGreaterThanOrEqualTo(String value) {
            addCriterion("provcity >=", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityLessThan(String value) {
            addCriterion("provcity <", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityLessThanOrEqualTo(String value) {
            addCriterion("provcity <=", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityLike(String value) {
            addCriterion("provcity like", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityNotLike(String value) {
            addCriterion("provcity not like", value, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityIn(List<String> values) {
            addCriterion("provcity in", values, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityNotIn(List<String> values) {
            addCriterion("provcity not in", values, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityBetween(String value1, String value2) {
            addCriterion("provcity between", value1, value2, "provcity");
            return (Criteria) this;
        }

        public Criteria andProvcityNotBetween(String value1, String value2) {
            addCriterion("provcity not between", value1, value2, "provcity");
            return (Criteria) this;
        }

        public Criteria andIncludeMktIsNull() {
            addCriterion("include_mkt is null");
            return (Criteria) this;
        }

        public Criteria andIncludeMktIsNotNull() {
            addCriterion("include_mkt is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeMktEqualTo(String value) {
            addCriterion("include_mkt =", value, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktNotEqualTo(String value) {
            addCriterion("include_mkt <>", value, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktGreaterThan(String value) {
            addCriterion("include_mkt >", value, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktGreaterThanOrEqualTo(String value) {
            addCriterion("include_mkt >=", value, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktLessThan(String value) {
            addCriterion("include_mkt <", value, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktLessThanOrEqualTo(String value) {
            addCriterion("include_mkt <=", value, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktLike(String value) {
            addCriterion("include_mkt like", value, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktNotLike(String value) {
            addCriterion("include_mkt not like", value, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktIn(List<String> values) {
            addCriterion("include_mkt in", values, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktNotIn(List<String> values) {
            addCriterion("include_mkt not in", values, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktBetween(String value1, String value2) {
            addCriterion("include_mkt between", value1, value2, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeMktNotBetween(String value1, String value2) {
            addCriterion("include_mkt not between", value1, value2, "includeMkt");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhIsNull() {
            addCriterion("include_dxjh is null");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhIsNotNull() {
            addCriterion("include_dxjh is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhEqualTo(String value) {
            addCriterion("include_dxjh =", value, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhNotEqualTo(String value) {
            addCriterion("include_dxjh <>", value, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhGreaterThan(String value) {
            addCriterion("include_dxjh >", value, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhGreaterThanOrEqualTo(String value) {
            addCriterion("include_dxjh >=", value, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhLessThan(String value) {
            addCriterion("include_dxjh <", value, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhLessThanOrEqualTo(String value) {
            addCriterion("include_dxjh <=", value, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhLike(String value) {
            addCriterion("include_dxjh like", value, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhNotLike(String value) {
            addCriterion("include_dxjh not like", value, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhIn(List<String> values) {
            addCriterion("include_dxjh in", values, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhNotIn(List<String> values) {
            addCriterion("include_dxjh not in", values, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhBetween(String value1, String value2) {
            addCriterion("include_dxjh between", value1, value2, "includeDxjh");
            return (Criteria) this;
        }

        public Criteria andIncludeDxjhNotBetween(String value1, String value2) {
            addCriterion("include_dxjh not between", value1, value2, "includeDxjh");
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

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Long value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Long value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Long value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Long value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Long value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Long> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Long> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Long value1, Long value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Long value1, Long value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Long value1, Long value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIsNull() {
            addCriterion("coupon_total_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIsNotNull() {
            addCriterion("coupon_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountEqualTo(Long value) {
            addCriterion("coupon_total_count =", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotEqualTo(Long value) {
            addCriterion("coupon_total_count <>", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountGreaterThan(Long value) {
            addCriterion("coupon_total_count >", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_total_count >=", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountLessThan(Long value) {
            addCriterion("coupon_total_count <", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountLessThanOrEqualTo(Long value) {
            addCriterion("coupon_total_count <=", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIn(List<Long> values) {
            addCriterion("coupon_total_count in", values, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotIn(List<Long> values) {
            addCriterion("coupon_total_count not in", values, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountBetween(Long value1, Long value2) {
            addCriterion("coupon_total_count between", value1, value2, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotBetween(Long value1, Long value2) {
            addCriterion("coupon_total_count not between", value1, value2, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIsNull() {
            addCriterion("coupon_remain_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIsNotNull() {
            addCriterion("coupon_remain_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountEqualTo(Long value) {
            addCriterion("coupon_remain_count =", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotEqualTo(Long value) {
            addCriterion("coupon_remain_count <>", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountGreaterThan(Long value) {
            addCriterion("coupon_remain_count >", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_remain_count >=", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountLessThan(Long value) {
            addCriterion("coupon_remain_count <", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountLessThanOrEqualTo(Long value) {
            addCriterion("coupon_remain_count <=", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIn(List<Long> values) {
            addCriterion("coupon_remain_count in", values, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotIn(List<Long> values) {
            addCriterion("coupon_remain_count not in", values, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountBetween(Long value1, Long value2) {
            addCriterion("coupon_remain_count between", value1, value2, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotBetween(Long value1, Long value2) {
            addCriterion("coupon_remain_count not between", value1, value2, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNull() {
            addCriterion("coupon_info is null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNotNull() {
            addCriterion("coupon_info is not null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoEqualTo(String value) {
            addCriterion("coupon_info =", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotEqualTo(String value) {
            addCriterion("coupon_info <>", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThan(String value) {
            addCriterion("coupon_info >", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_info >=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThan(String value) {
            addCriterion("coupon_info <", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThanOrEqualTo(String value) {
            addCriterion("coupon_info <=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLike(String value) {
            addCriterion("coupon_info like", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotLike(String value) {
            addCriterion("coupon_info not like", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIn(List<String> values) {
            addCriterion("coupon_info in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotIn(List<String> values) {
            addCriterion("coupon_info not in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoBetween(String value1, String value2) {
            addCriterion("coupon_info between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotBetween(String value1, String value2) {
            addCriterion("coupon_info not between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIsNull() {
            addCriterion("commission_type is null");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIsNotNull() {
            addCriterion("commission_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeEqualTo(String value) {
            addCriterion("commission_type =", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotEqualTo(String value) {
            addCriterion("commission_type <>", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeGreaterThan(String value) {
            addCriterion("commission_type >", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("commission_type >=", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeLessThan(String value) {
            addCriterion("commission_type <", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeLessThanOrEqualTo(String value) {
            addCriterion("commission_type <=", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeLike(String value) {
            addCriterion("commission_type like", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotLike(String value) {
            addCriterion("commission_type not like", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIn(List<String> values) {
            addCriterion("commission_type in", values, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotIn(List<String> values) {
            addCriterion("commission_type not in", values, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeBetween(String value1, String value2) {
            addCriterion("commission_type between", value1, value2, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotBetween(String value1, String value2) {
            addCriterion("commission_type not between", value1, value2, "commissionType");
            return (Criteria) this;
        }

        public Criteria andShopTitleIsNull() {
            addCriterion("shop_title is null");
            return (Criteria) this;
        }

        public Criteria andShopTitleIsNotNull() {
            addCriterion("shop_title is not null");
            return (Criteria) this;
        }

        public Criteria andShopTitleEqualTo(String value) {
            addCriterion("shop_title =", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotEqualTo(String value) {
            addCriterion("shop_title <>", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleGreaterThan(String value) {
            addCriterion("shop_title >", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleGreaterThanOrEqualTo(String value) {
            addCriterion("shop_title >=", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLessThan(String value) {
            addCriterion("shop_title <", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLessThanOrEqualTo(String value) {
            addCriterion("shop_title <=", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLike(String value) {
            addCriterion("shop_title like", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotLike(String value) {
            addCriterion("shop_title not like", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleIn(List<String> values) {
            addCriterion("shop_title in", values, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotIn(List<String> values) {
            addCriterion("shop_title not in", values, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleBetween(String value1, String value2) {
            addCriterion("shop_title between", value1, value2, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotBetween(String value1, String value2) {
            addCriterion("shop_title not between", value1, value2, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopDsrIsNull() {
            addCriterion("shop_dsr is null");
            return (Criteria) this;
        }

        public Criteria andShopDsrIsNotNull() {
            addCriterion("shop_dsr is not null");
            return (Criteria) this;
        }

        public Criteria andShopDsrEqualTo(Long value) {
            addCriterion("shop_dsr =", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrNotEqualTo(Long value) {
            addCriterion("shop_dsr <>", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrGreaterThan(Long value) {
            addCriterion("shop_dsr >", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_dsr >=", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrLessThan(Long value) {
            addCriterion("shop_dsr <", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrLessThanOrEqualTo(Long value) {
            addCriterion("shop_dsr <=", value, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrIn(List<Long> values) {
            addCriterion("shop_dsr in", values, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrNotIn(List<Long> values) {
            addCriterion("shop_dsr not in", values, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrBetween(Long value1, Long value2) {
            addCriterion("shop_dsr between", value1, value2, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andShopDsrNotBetween(Long value1, Long value2) {
            addCriterion("shop_dsr not between", value1, value2, "shopDsr");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlIsNull() {
            addCriterion("coupon_share_url is null");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlIsNotNull() {
            addCriterion("coupon_share_url is not null");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlEqualTo(String value) {
            addCriterion("coupon_share_url =", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlNotEqualTo(String value) {
            addCriterion("coupon_share_url <>", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlGreaterThan(String value) {
            addCriterion("coupon_share_url >", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_share_url >=", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlLessThan(String value) {
            addCriterion("coupon_share_url <", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlLessThanOrEqualTo(String value) {
            addCriterion("coupon_share_url <=", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlLike(String value) {
            addCriterion("coupon_share_url like", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlNotLike(String value) {
            addCriterion("coupon_share_url not like", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlIn(List<String> values) {
            addCriterion("coupon_share_url in", values, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlNotIn(List<String> values) {
            addCriterion("coupon_share_url not in", values, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlBetween(String value1, String value2) {
            addCriterion("coupon_share_url between", value1, value2, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlNotBetween(String value1, String value2) {
            addCriterion("coupon_share_url not between", value1, value2, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameIsNull() {
            addCriterion("level_one_category_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameIsNotNull() {
            addCriterion("level_one_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameEqualTo(String value) {
            addCriterion("level_one_category_name =", value, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameNotEqualTo(String value) {
            addCriterion("level_one_category_name <>", value, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameGreaterThan(String value) {
            addCriterion("level_one_category_name >", value, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_one_category_name >=", value, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameLessThan(String value) {
            addCriterion("level_one_category_name <", value, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("level_one_category_name <=", value, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameLike(String value) {
            addCriterion("level_one_category_name like", value, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameNotLike(String value) {
            addCriterion("level_one_category_name not like", value, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameIn(List<String> values) {
            addCriterion("level_one_category_name in", values, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameNotIn(List<String> values) {
            addCriterion("level_one_category_name not in", values, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameBetween(String value1, String value2) {
            addCriterion("level_one_category_name between", value1, value2, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryNameNotBetween(String value1, String value2) {
            addCriterion("level_one_category_name not between", value1, value2, "levelOneCategoryName");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdIsNull() {
            addCriterion("level_one_category_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdIsNotNull() {
            addCriterion("level_one_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdEqualTo(Long value) {
            addCriterion("level_one_category_id =", value, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdNotEqualTo(Long value) {
            addCriterion("level_one_category_id <>", value, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdGreaterThan(Long value) {
            addCriterion("level_one_category_id >", value, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("level_one_category_id >=", value, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdLessThan(Long value) {
            addCriterion("level_one_category_id <", value, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("level_one_category_id <=", value, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdIn(List<Long> values) {
            addCriterion("level_one_category_id in", values, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdNotIn(List<Long> values) {
            addCriterion("level_one_category_id not in", values, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdBetween(Long value1, Long value2) {
            addCriterion("level_one_category_id between", value1, value2, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andLevelOneCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("level_one_category_id not between", value1, value2, "levelOneCategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNull() {
            addCriterion("short_title is null");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNotNull() {
            addCriterion("short_title is not null");
            return (Criteria) this;
        }

        public Criteria andShortTitleEqualTo(String value) {
            addCriterion("short_title =", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotEqualTo(String value) {
            addCriterion("short_title <>", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThan(String value) {
            addCriterion("short_title >", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThanOrEqualTo(String value) {
            addCriterion("short_title >=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThan(String value) {
            addCriterion("short_title <", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThanOrEqualTo(String value) {
            addCriterion("short_title <=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLike(String value) {
            addCriterion("short_title like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotLike(String value) {
            addCriterion("short_title not like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleIn(List<String> values) {
            addCriterion("short_title in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotIn(List<String> values) {
            addCriterion("short_title not in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleBetween(String value1, String value2) {
            addCriterion("short_title between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotBetween(String value1, String value2) {
            addCriterion("short_title not between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andWhiteImageIsNull() {
            addCriterion("white_image is null");
            return (Criteria) this;
        }

        public Criteria andWhiteImageIsNotNull() {
            addCriterion("white_image is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteImageEqualTo(String value) {
            addCriterion("white_image =", value, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageNotEqualTo(String value) {
            addCriterion("white_image <>", value, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageGreaterThan(String value) {
            addCriterion("white_image >", value, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageGreaterThanOrEqualTo(String value) {
            addCriterion("white_image >=", value, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageLessThan(String value) {
            addCriterion("white_image <", value, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageLessThanOrEqualTo(String value) {
            addCriterion("white_image <=", value, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageLike(String value) {
            addCriterion("white_image like", value, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageNotLike(String value) {
            addCriterion("white_image not like", value, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageIn(List<String> values) {
            addCriterion("white_image in", values, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageNotIn(List<String> values) {
            addCriterion("white_image not in", values, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageBetween(String value1, String value2) {
            addCriterion("white_image between", value1, value2, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andWhiteImageNotBetween(String value1, String value2) {
            addCriterion("white_image not between", value1, value2, "whiteImage");
            return (Criteria) this;
        }

        public Criteria andOetimeIsNull() {
            addCriterion("oetime is null");
            return (Criteria) this;
        }

        public Criteria andOetimeIsNotNull() {
            addCriterion("oetime is not null");
            return (Criteria) this;
        }

        public Criteria andOetimeEqualTo(String value) {
            addCriterion("oetime =", value, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeNotEqualTo(String value) {
            addCriterion("oetime <>", value, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeGreaterThan(String value) {
            addCriterion("oetime >", value, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeGreaterThanOrEqualTo(String value) {
            addCriterion("oetime >=", value, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeLessThan(String value) {
            addCriterion("oetime <", value, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeLessThanOrEqualTo(String value) {
            addCriterion("oetime <=", value, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeLike(String value) {
            addCriterion("oetime like", value, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeNotLike(String value) {
            addCriterion("oetime not like", value, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeIn(List<String> values) {
            addCriterion("oetime in", values, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeNotIn(List<String> values) {
            addCriterion("oetime not in", values, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeBetween(String value1, String value2) {
            addCriterion("oetime between", value1, value2, "oetime");
            return (Criteria) this;
        }

        public Criteria andOetimeNotBetween(String value1, String value2) {
            addCriterion("oetime not between", value1, value2, "oetime");
            return (Criteria) this;
        }

        public Criteria andOstimeIsNull() {
            addCriterion("ostime is null");
            return (Criteria) this;
        }

        public Criteria andOstimeIsNotNull() {
            addCriterion("ostime is not null");
            return (Criteria) this;
        }

        public Criteria andOstimeEqualTo(String value) {
            addCriterion("ostime =", value, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeNotEqualTo(String value) {
            addCriterion("ostime <>", value, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeGreaterThan(String value) {
            addCriterion("ostime >", value, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeGreaterThanOrEqualTo(String value) {
            addCriterion("ostime >=", value, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeLessThan(String value) {
            addCriterion("ostime <", value, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeLessThanOrEqualTo(String value) {
            addCriterion("ostime <=", value, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeLike(String value) {
            addCriterion("ostime like", value, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeNotLike(String value) {
            addCriterion("ostime not like", value, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeIn(List<String> values) {
            addCriterion("ostime in", values, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeNotIn(List<String> values) {
            addCriterion("ostime not in", values, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeBetween(String value1, String value2) {
            addCriterion("ostime between", value1, value2, "ostime");
            return (Criteria) this;
        }

        public Criteria andOstimeNotBetween(String value1, String value2) {
            addCriterion("ostime not between", value1, value2, "ostime");
            return (Criteria) this;
        }

        public Criteria andJddNumIsNull() {
            addCriterion("jdd_num is null");
            return (Criteria) this;
        }

        public Criteria andJddNumIsNotNull() {
            addCriterion("jdd_num is not null");
            return (Criteria) this;
        }

        public Criteria andJddNumEqualTo(Long value) {
            addCriterion("jdd_num =", value, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumNotEqualTo(Long value) {
            addCriterion("jdd_num <>", value, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumGreaterThan(Long value) {
            addCriterion("jdd_num >", value, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumGreaterThanOrEqualTo(Long value) {
            addCriterion("jdd_num >=", value, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumLessThan(Long value) {
            addCriterion("jdd_num <", value, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumLessThanOrEqualTo(Long value) {
            addCriterion("jdd_num <=", value, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumIn(List<Long> values) {
            addCriterion("jdd_num in", values, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumNotIn(List<Long> values) {
            addCriterion("jdd_num not in", values, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumBetween(Long value1, Long value2) {
            addCriterion("jdd_num between", value1, value2, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddNumNotBetween(Long value1, Long value2) {
            addCriterion("jdd_num not between", value1, value2, "jddNum");
            return (Criteria) this;
        }

        public Criteria andJddPriceIsNull() {
            addCriterion("jdd_price is null");
            return (Criteria) this;
        }

        public Criteria andJddPriceIsNotNull() {
            addCriterion("jdd_price is not null");
            return (Criteria) this;
        }

        public Criteria andJddPriceEqualTo(String value) {
            addCriterion("jdd_price =", value, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceNotEqualTo(String value) {
            addCriterion("jdd_price <>", value, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceGreaterThan(String value) {
            addCriterion("jdd_price >", value, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceGreaterThanOrEqualTo(String value) {
            addCriterion("jdd_price >=", value, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceLessThan(String value) {
            addCriterion("jdd_price <", value, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceLessThanOrEqualTo(String value) {
            addCriterion("jdd_price <=", value, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceLike(String value) {
            addCriterion("jdd_price like", value, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceNotLike(String value) {
            addCriterion("jdd_price not like", value, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceIn(List<String> values) {
            addCriterion("jdd_price in", values, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceNotIn(List<String> values) {
            addCriterion("jdd_price not in", values, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceBetween(String value1, String value2) {
            addCriterion("jdd_price between", value1, value2, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andJddPriceNotBetween(String value1, String value2) {
            addCriterion("jdd_price not between", value1, value2, "jddPrice");
            return (Criteria) this;
        }

        public Criteria andTokenTimeIsNull() {
            addCriterion("token_time is null");
            return (Criteria) this;
        }

        public Criteria andTokenTimeIsNotNull() {
            addCriterion("token_time is not null");
            return (Criteria) this;
        }

        public Criteria andTokenTimeEqualTo(String value) {
            addCriterion("token_time =", value, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeNotEqualTo(String value) {
            addCriterion("token_time <>", value, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeGreaterThan(String value) {
            addCriterion("token_time >", value, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("token_time >=", value, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeLessThan(String value) {
            addCriterion("token_time <", value, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeLessThanOrEqualTo(String value) {
            addCriterion("token_time <=", value, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeLike(String value) {
            addCriterion("token_time like", value, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeNotLike(String value) {
            addCriterion("token_time not like", value, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeIn(List<String> values) {
            addCriterion("token_time in", values, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeNotIn(List<String> values) {
            addCriterion("token_time not in", values, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeBetween(String value1, String value2) {
            addCriterion("token_time between", value1, value2, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenTimeNotBetween(String value1, String value2) {
            addCriterion("token_time not between", value1, value2, "tokenTime");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
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