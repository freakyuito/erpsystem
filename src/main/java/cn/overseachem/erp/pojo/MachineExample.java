package cn.overseachem.erp.pojo;

import java.util.ArrayList;
import java.util.List;

public class MachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineExample() {
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

        public Criteria andMachineIdIsNull() {
            addCriterion("machine_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNotNull() {
            addCriterion("machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIdEqualTo(Integer value) {
            addCriterion("machine_id =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(Integer value) {
            addCriterion("machine_id <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(Integer value) {
            addCriterion("machine_id >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_id >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(Integer value) {
            addCriterion("machine_id <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(Integer value) {
            addCriterion("machine_id <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<Integer> values) {
            addCriterion("machine_id in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<Integer> values) {
            addCriterion("machine_id not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(Integer value1, Integer value2) {
            addCriterion("machine_id between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_id not between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumIsNull() {
            addCriterion("occupied_batch_num is null");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumIsNotNull() {
            addCriterion("occupied_batch_num is not null");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumEqualTo(String value) {
            addCriterion("occupied_batch_num =", value, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumNotEqualTo(String value) {
            addCriterion("occupied_batch_num <>", value, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumGreaterThan(String value) {
            addCriterion("occupied_batch_num >", value, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumGreaterThanOrEqualTo(String value) {
            addCriterion("occupied_batch_num >=", value, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumLessThan(String value) {
            addCriterion("occupied_batch_num <", value, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumLessThanOrEqualTo(String value) {
            addCriterion("occupied_batch_num <=", value, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumLike(String value) {
            addCriterion("occupied_batch_num like", value, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumNotLike(String value) {
            addCriterion("occupied_batch_num not like", value, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumIn(List<String> values) {
            addCriterion("occupied_batch_num in", values, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumNotIn(List<String> values) {
            addCriterion("occupied_batch_num not in", values, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumBetween(String value1, String value2) {
            addCriterion("occupied_batch_num between", value1, value2, "occupiedBatchNum");
            return (Criteria) this;
        }

        public Criteria andOccupiedBatchNumNotBetween(String value1, String value2) {
            addCriterion("occupied_batch_num not between", value1, value2, "occupiedBatchNum");
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