package cn.overseachem.erp.pojo;

import java.util.ArrayList;
import java.util.List;

public class GodownEntrySpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GodownEntrySpecExample() {
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

        public Criteria andFkBatchNumIsNull() {
            addCriterion("fk_batch_num is null");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumIsNotNull() {
            addCriterion("fk_batch_num is not null");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumEqualTo(String value) {
            addCriterion("fk_batch_num =", value, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumNotEqualTo(String value) {
            addCriterion("fk_batch_num <>", value, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumGreaterThan(String value) {
            addCriterion("fk_batch_num >", value, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumGreaterThanOrEqualTo(String value) {
            addCriterion("fk_batch_num >=", value, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumLessThan(String value) {
            addCriterion("fk_batch_num <", value, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumLessThanOrEqualTo(String value) {
            addCriterion("fk_batch_num <=", value, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumLike(String value) {
            addCriterion("fk_batch_num like", value, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumNotLike(String value) {
            addCriterion("fk_batch_num not like", value, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumIn(List<String> values) {
            addCriterion("fk_batch_num in", values, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumNotIn(List<String> values) {
            addCriterion("fk_batch_num not in", values, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumBetween(String value1, String value2) {
            addCriterion("fk_batch_num between", value1, value2, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkBatchNumNotBetween(String value1, String value2) {
            addCriterion("fk_batch_num not between", value1, value2, "fkBatchNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumIsNull() {
            addCriterion("fk_inventory_num is null");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumIsNotNull() {
            addCriterion("fk_inventory_num is not null");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumEqualTo(Integer value) {
            addCriterion("fk_inventory_num =", value, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumNotEqualTo(Integer value) {
            addCriterion("fk_inventory_num <>", value, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumGreaterThan(Integer value) {
            addCriterion("fk_inventory_num >", value, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_inventory_num >=", value, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumLessThan(Integer value) {
            addCriterion("fk_inventory_num <", value, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumLessThanOrEqualTo(Integer value) {
            addCriterion("fk_inventory_num <=", value, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumIn(List<Integer> values) {
            addCriterion("fk_inventory_num in", values, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumNotIn(List<Integer> values) {
            addCriterion("fk_inventory_num not in", values, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumBetween(Integer value1, Integer value2) {
            addCriterion("fk_inventory_num between", value1, value2, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFkInventoryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_inventory_num not between", value1, value2, "fkInventoryNum");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityIsNull() {
            addCriterion("finished_quantity is null");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityIsNotNull() {
            addCriterion("finished_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityEqualTo(Integer value) {
            addCriterion("finished_quantity =", value, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityNotEqualTo(Integer value) {
            addCriterion("finished_quantity <>", value, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityGreaterThan(Integer value) {
            addCriterion("finished_quantity >", value, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_quantity >=", value, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityLessThan(Integer value) {
            addCriterion("finished_quantity <", value, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("finished_quantity <=", value, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityIn(List<Integer> values) {
            addCriterion("finished_quantity in", values, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityNotIn(List<Integer> values) {
            addCriterion("finished_quantity not in", values, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityBetween(Integer value1, Integer value2) {
            addCriterion("finished_quantity between", value1, value2, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_quantity not between", value1, value2, "finishedQuantity");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightIsNull() {
            addCriterion("finished_weight is null");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightIsNotNull() {
            addCriterion("finished_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightEqualTo(Float value) {
            addCriterion("finished_weight =", value, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightNotEqualTo(Float value) {
            addCriterion("finished_weight <>", value, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightGreaterThan(Float value) {
            addCriterion("finished_weight >", value, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("finished_weight >=", value, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightLessThan(Float value) {
            addCriterion("finished_weight <", value, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightLessThanOrEqualTo(Float value) {
            addCriterion("finished_weight <=", value, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightIn(List<Float> values) {
            addCriterion("finished_weight in", values, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightNotIn(List<Float> values) {
            addCriterion("finished_weight not in", values, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightBetween(Float value1, Float value2) {
            addCriterion("finished_weight between", value1, value2, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedWeightNotBetween(Float value1, Float value2) {
            addCriterion("finished_weight not between", value1, value2, "finishedWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityIsNull() {
            addCriterion("inventory_quantity is null");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityIsNotNull() {
            addCriterion("inventory_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityEqualTo(Integer value) {
            addCriterion("inventory_quantity =", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityNotEqualTo(Integer value) {
            addCriterion("inventory_quantity <>", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityGreaterThan(Integer value) {
            addCriterion("inventory_quantity >", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_quantity >=", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityLessThan(Integer value) {
            addCriterion("inventory_quantity <", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_quantity <=", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityIn(List<Integer> values) {
            addCriterion("inventory_quantity in", values, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityNotIn(List<Integer> values) {
            addCriterion("inventory_quantity not in", values, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityBetween(Integer value1, Integer value2) {
            addCriterion("inventory_quantity between", value1, value2, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_quantity not between", value1, value2, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightIsNull() {
            addCriterion("inventory_weight is null");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightIsNotNull() {
            addCriterion("inventory_weight is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightEqualTo(Float value) {
            addCriterion("inventory_weight =", value, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightNotEqualTo(Float value) {
            addCriterion("inventory_weight <>", value, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightGreaterThan(Float value) {
            addCriterion("inventory_weight >", value, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("inventory_weight >=", value, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightLessThan(Float value) {
            addCriterion("inventory_weight <", value, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightLessThanOrEqualTo(Float value) {
            addCriterion("inventory_weight <=", value, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightIn(List<Float> values) {
            addCriterion("inventory_weight in", values, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightNotIn(List<Float> values) {
            addCriterion("inventory_weight not in", values, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightBetween(Float value1, Float value2) {
            addCriterion("inventory_weight between", value1, value2, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andInventoryWeightNotBetween(Float value1, Float value2) {
            addCriterion("inventory_weight not between", value1, value2, "inventoryWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightIsNull() {
            addCriterion("waste_weight is null");
            return (Criteria) this;
        }

        public Criteria andWasteWeightIsNotNull() {
            addCriterion("waste_weight is not null");
            return (Criteria) this;
        }

        public Criteria andWasteWeightEqualTo(Float value) {
            addCriterion("waste_weight =", value, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightNotEqualTo(Float value) {
            addCriterion("waste_weight <>", value, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightGreaterThan(Float value) {
            addCriterion("waste_weight >", value, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("waste_weight >=", value, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightLessThan(Float value) {
            addCriterion("waste_weight <", value, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightLessThanOrEqualTo(Float value) {
            addCriterion("waste_weight <=", value, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightIn(List<Float> values) {
            addCriterion("waste_weight in", values, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightNotIn(List<Float> values) {
            addCriterion("waste_weight not in", values, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightBetween(Float value1, Float value2) {
            addCriterion("waste_weight between", value1, value2, "wasteWeight");
            return (Criteria) this;
        }

        public Criteria andWasteWeightNotBetween(Float value1, Float value2) {
            addCriterion("waste_weight not between", value1, value2, "wasteWeight");
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