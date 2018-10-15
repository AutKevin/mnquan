package cn.mnquan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbMnAgencyDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMnAgencyDoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAgencyAccountIsNull() {
            addCriterion("agency_account is null");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountIsNotNull() {
            addCriterion("agency_account is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountEqualTo(String value) {
            addCriterion("agency_account =", value, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountNotEqualTo(String value) {
            addCriterion("agency_account <>", value, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountGreaterThan(String value) {
            addCriterion("agency_account >", value, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountGreaterThanOrEqualTo(String value) {
            addCriterion("agency_account >=", value, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountLessThan(String value) {
            addCriterion("agency_account <", value, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountLessThanOrEqualTo(String value) {
            addCriterion("agency_account <=", value, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountLike(String value) {
            addCriterion("agency_account like", value, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountNotLike(String value) {
            addCriterion("agency_account not like", value, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountIn(List<String> values) {
            addCriterion("agency_account in", values, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountNotIn(List<String> values) {
            addCriterion("agency_account not in", values, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountBetween(String value1, String value2) {
            addCriterion("agency_account between", value1, value2, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andAgencyAccountNotBetween(String value1, String value2) {
            addCriterion("agency_account not between", value1, value2, "agencyAccount");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIsNull() {
            addCriterion("agency_code is null");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIsNotNull() {
            addCriterion("agency_code is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeEqualTo(String value) {
            addCriterion("agency_code =", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotEqualTo(String value) {
            addCriterion("agency_code <>", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeGreaterThan(String value) {
            addCriterion("agency_code >", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("agency_code >=", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLessThan(String value) {
            addCriterion("agency_code <", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLessThanOrEqualTo(String value) {
            addCriterion("agency_code <=", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLike(String value) {
            addCriterion("agency_code like", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotLike(String value) {
            addCriterion("agency_code not like", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIn(List<String> values) {
            addCriterion("agency_code in", values, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotIn(List<String> values) {
            addCriterion("agency_code not in", values, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeBetween(String value1, String value2) {
            addCriterion("agency_code between", value1, value2, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotBetween(String value1, String value2) {
            addCriterion("agency_code not between", value1, value2, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeIsNull() {
            addCriterion("agency_grade is null");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeIsNotNull() {
            addCriterion("agency_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeEqualTo(String value) {
            addCriterion("agency_grade =", value, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeNotEqualTo(String value) {
            addCriterion("agency_grade <>", value, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeGreaterThan(String value) {
            addCriterion("agency_grade >", value, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeGreaterThanOrEqualTo(String value) {
            addCriterion("agency_grade >=", value, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeLessThan(String value) {
            addCriterion("agency_grade <", value, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeLessThanOrEqualTo(String value) {
            addCriterion("agency_grade <=", value, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeLike(String value) {
            addCriterion("agency_grade like", value, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeNotLike(String value) {
            addCriterion("agency_grade not like", value, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeIn(List<String> values) {
            addCriterion("agency_grade in", values, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeNotIn(List<String> values) {
            addCriterion("agency_grade not in", values, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeBetween(String value1, String value2) {
            addCriterion("agency_grade between", value1, value2, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andAgencyGradeNotBetween(String value1, String value2) {
            addCriterion("agency_grade not between", value1, value2, "agencyGrade");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterionForJDBCDate("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterionForJDBCDate("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterionForJDBCDate("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterionForJDBCDate("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterionForJDBCDate("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterionForJDBCDate("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterionForJDBCDate("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterionForJDBCDate("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updated_at not between", value1, value2, "updatedAt");
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