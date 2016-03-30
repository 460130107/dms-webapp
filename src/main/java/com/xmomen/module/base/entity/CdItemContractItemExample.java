package com.xmomen.module.base.entity;

import com.xmomen.framework.mybatis.model.BaseMybatisExample;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CdItemContractItemExample extends BaseMybatisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CdItemContractItemExample() {
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

        public Criteria andCdItemContractItemIdIsNull() {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdIsNotNull() {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdEqualTo(Integer value) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID =", value, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdNotEqualTo(Integer value) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID <>", value, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdGreaterThan(Integer value) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID >", value, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID >=", value, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdLessThan(Integer value) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID <", value, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID <=", value, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdIn(List<Integer> values) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID in", values, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdNotIn(List<Integer> values) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID not in", values, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdBetween(Integer value1, Integer value2) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID between", value1, value2, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemContractItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CD_ITEM_CONTRACT_ITEM_ID not between", value1, value2, "cdItemContractItemId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdIsNull() {
            addCriterion("CD_CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCdContractIdIsNotNull() {
            addCriterion("CD_CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCdContractIdEqualTo(Integer value) {
            addCriterion("CD_CONTRACT_ID =", value, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdNotEqualTo(Integer value) {
            addCriterion("CD_CONTRACT_ID <>", value, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdGreaterThan(Integer value) {
            addCriterion("CD_CONTRACT_ID >", value, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CD_CONTRACT_ID >=", value, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdLessThan(Integer value) {
            addCriterion("CD_CONTRACT_ID <", value, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("CD_CONTRACT_ID <=", value, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdIn(List<Integer> values) {
            addCriterion("CD_CONTRACT_ID in", values, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdNotIn(List<Integer> values) {
            addCriterion("CD_CONTRACT_ID not in", values, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdBetween(Integer value1, Integer value2) {
            addCriterion("CD_CONTRACT_ID between", value1, value2, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CD_CONTRACT_ID not between", value1, value2, "cdContractId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdIsNull() {
            addCriterion("CD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCdItemIdIsNotNull() {
            addCriterion("CD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCdItemIdEqualTo(Integer value) {
            addCriterion("CD_ITEM_ID =", value, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdNotEqualTo(Integer value) {
            addCriterion("CD_ITEM_ID <>", value, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdGreaterThan(Integer value) {
            addCriterion("CD_ITEM_ID >", value, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CD_ITEM_ID >=", value, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdLessThan(Integer value) {
            addCriterion("CD_ITEM_ID <", value, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("CD_ITEM_ID <=", value, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdIn(List<Integer> values) {
            addCriterion("CD_ITEM_ID in", values, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdNotIn(List<Integer> values) {
            addCriterion("CD_ITEM_ID not in", values, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdBetween(Integer value1, Integer value2) {
            addCriterion("CD_ITEM_ID between", value1, value2, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andCdItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CD_ITEM_ID not between", value1, value2, "cdItemId");
            return (Criteria) this;
        }

        public Criteria andContractPriceIsNull() {
            addCriterion("CONTRACT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andContractPriceIsNotNull() {
            addCriterion("CONTRACT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andContractPriceEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PRICE =", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PRICE <>", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceGreaterThan(BigDecimal value) {
            addCriterion("CONTRACT_PRICE >", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PRICE >=", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceLessThan(BigDecimal value) {
            addCriterion("CONTRACT_PRICE <", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PRICE <=", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_PRICE in", values, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_PRICE not in", values, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_PRICE between", value1, value2, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_PRICE not between", value1, value2, "contractPrice");
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