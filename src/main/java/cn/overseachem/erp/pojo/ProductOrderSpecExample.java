package cn.overseachem.erp.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductOrderSpecExample() {
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

        public Criteria andBatchNumIsNull() {
            addCriterion("batch_num is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNotNull() {
            addCriterion("batch_num is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumEqualTo(String value) {
            addCriterion("batch_num =", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotEqualTo(String value) {
            addCriterion("batch_num <>", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThan(String value) {
            addCriterion("batch_num >", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThanOrEqualTo(String value) {
            addCriterion("batch_num >=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThan(String value) {
            addCriterion("batch_num <", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThanOrEqualTo(String value) {
            addCriterion("batch_num <=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLike(String value) {
            addCriterion("batch_num like", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotLike(String value) {
            addCriterion("batch_num not like", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumIn(List<String> values) {
            addCriterion("batch_num in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotIn(List<String> values) {
            addCriterion("batch_num not in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumBetween(String value1, String value2) {
            addCriterion("batch_num between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotBetween(String value1, String value2) {
            addCriterion("batch_num not between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumIsNull() {
            addCriterion("fk_product_num is null");
            return (Criteria) this;
        }

        public Criteria andFkProductNumIsNotNull() {
            addCriterion("fk_product_num is not null");
            return (Criteria) this;
        }

        public Criteria andFkProductNumEqualTo(String value) {
            addCriterion("fk_product_num =", value, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumNotEqualTo(String value) {
            addCriterion("fk_product_num <>", value, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumGreaterThan(String value) {
            addCriterion("fk_product_num >", value, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("fk_product_num >=", value, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumLessThan(String value) {
            addCriterion("fk_product_num <", value, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumLessThanOrEqualTo(String value) {
            addCriterion("fk_product_num <=", value, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumLike(String value) {
            addCriterion("fk_product_num like", value, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumNotLike(String value) {
            addCriterion("fk_product_num not like", value, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumIn(List<String> values) {
            addCriterion("fk_product_num in", values, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumNotIn(List<String> values) {
            addCriterion("fk_product_num not in", values, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumBetween(String value1, String value2) {
            addCriterion("fk_product_num between", value1, value2, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andFkProductNumNotBetween(String value1, String value2) {
            addCriterion("fk_product_num not between", value1, value2, "fkProductNum");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNull() {
            addCriterion("state_code is null");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNotNull() {
            addCriterion("state_code is not null");
            return (Criteria) this;
        }

        public Criteria andStateCodeEqualTo(Integer value) {
            addCriterion("state_code =", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotEqualTo(Integer value) {
            addCriterion("state_code <>", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThan(Integer value) {
            addCriterion("state_code >", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_code >=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThan(Integer value) {
            addCriterion("state_code <", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThanOrEqualTo(Integer value) {
            addCriterion("state_code <=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIn(List<Integer> values) {
            addCriterion("state_code in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotIn(List<Integer> values) {
            addCriterion("state_code not in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeBetween(Integer value1, Integer value2) {
            addCriterion("state_code between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("state_code not between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountIsNull() {
            addCriterion("completed_amount is null");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountIsNotNull() {
            addCriterion("completed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountEqualTo(Integer value) {
            addCriterion("completed_amount =", value, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountNotEqualTo(Integer value) {
            addCriterion("completed_amount <>", value, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountGreaterThan(Integer value) {
            addCriterion("completed_amount >", value, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("completed_amount >=", value, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountLessThan(Integer value) {
            addCriterion("completed_amount <", value, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("completed_amount <=", value, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountIn(List<Integer> values) {
            addCriterion("completed_amount in", values, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountNotIn(List<Integer> values) {
            addCriterion("completed_amount not in", values, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountBetween(Integer value1, Integer value2) {
            addCriterion("completed_amount between", value1, value2, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andCompletedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("completed_amount not between", value1, value2, "completedAmount");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdIsNull() {
            addCriterion("fk_purchase_spec_id is null");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdIsNotNull() {
            addCriterion("fk_purchase_spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdEqualTo(Integer value) {
            addCriterion("fk_purchase_spec_id =", value, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdNotEqualTo(Integer value) {
            addCriterion("fk_purchase_spec_id <>", value, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdGreaterThan(Integer value) {
            addCriterion("fk_purchase_spec_id >", value, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_purchase_spec_id >=", value, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdLessThan(Integer value) {
            addCriterion("fk_purchase_spec_id <", value, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("fk_purchase_spec_id <=", value, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdIn(List<Integer> values) {
            addCriterion("fk_purchase_spec_id in", values, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdNotIn(List<Integer> values) {
            addCriterion("fk_purchase_spec_id not in", values, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("fk_purchase_spec_id between", value1, value2, "fkPurchaseSpecId");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_purchase_spec_id not between", value1, value2, "fkPurchaseSpecId");
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