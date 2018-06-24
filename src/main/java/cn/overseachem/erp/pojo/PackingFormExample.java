package cn.overseachem.erp.pojo;

import java.util.ArrayList;
import java.util.List;

public class PackingFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PackingFormExample() {
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

        public Criteria andPackingNumIsNull() {
            addCriterion("packing_num is null");
            return (Criteria) this;
        }

        public Criteria andPackingNumIsNotNull() {
            addCriterion("packing_num is not null");
            return (Criteria) this;
        }

        public Criteria andPackingNumEqualTo(String value) {
            addCriterion("packing_num =", value, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumNotEqualTo(String value) {
            addCriterion("packing_num <>", value, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumGreaterThan(String value) {
            addCriterion("packing_num >", value, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumGreaterThanOrEqualTo(String value) {
            addCriterion("packing_num >=", value, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumLessThan(String value) {
            addCriterion("packing_num <", value, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumLessThanOrEqualTo(String value) {
            addCriterion("packing_num <=", value, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumLike(String value) {
            addCriterion("packing_num like", value, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumNotLike(String value) {
            addCriterion("packing_num not like", value, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumIn(List<String> values) {
            addCriterion("packing_num in", values, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumNotIn(List<String> values) {
            addCriterion("packing_num not in", values, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumBetween(String value1, String value2) {
            addCriterion("packing_num between", value1, value2, "packingNum");
            return (Criteria) this;
        }

        public Criteria andPackingNumNotBetween(String value1, String value2) {
            addCriterion("packing_num not between", value1, value2, "packingNum");
            return (Criteria) this;
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

        public Criteria andExchangeRecordsIsNull() {
            addCriterion("exchange_records is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsIsNotNull() {
            addCriterion("exchange_records is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsEqualTo(String value) {
            addCriterion("exchange_records =", value, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsNotEqualTo(String value) {
            addCriterion("exchange_records <>", value, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsGreaterThan(String value) {
            addCriterion("exchange_records >", value, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_records >=", value, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsLessThan(String value) {
            addCriterion("exchange_records <", value, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsLessThanOrEqualTo(String value) {
            addCriterion("exchange_records <=", value, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsLike(String value) {
            addCriterion("exchange_records like", value, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsNotLike(String value) {
            addCriterion("exchange_records not like", value, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsIn(List<String> values) {
            addCriterion("exchange_records in", values, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsNotIn(List<String> values) {
            addCriterion("exchange_records not in", values, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsBetween(String value1, String value2) {
            addCriterion("exchange_records between", value1, value2, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andExchangeRecordsNotBetween(String value1, String value2) {
            addCriterion("exchange_records not between", value1, value2, "exchangeRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsIsNull() {
            addCriterion("print_records is null");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsIsNotNull() {
            addCriterion("print_records is not null");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsEqualTo(String value) {
            addCriterion("print_records =", value, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsNotEqualTo(String value) {
            addCriterion("print_records <>", value, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsGreaterThan(String value) {
            addCriterion("print_records >", value, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("print_records >=", value, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsLessThan(String value) {
            addCriterion("print_records <", value, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsLessThanOrEqualTo(String value) {
            addCriterion("print_records <=", value, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsLike(String value) {
            addCriterion("print_records like", value, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsNotLike(String value) {
            addCriterion("print_records not like", value, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsIn(List<String> values) {
            addCriterion("print_records in", values, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsNotIn(List<String> values) {
            addCriterion("print_records not in", values, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsBetween(String value1, String value2) {
            addCriterion("print_records between", value1, value2, "printRecords");
            return (Criteria) this;
        }

        public Criteria andPrintRecordsNotBetween(String value1, String value2) {
            addCriterion("print_records not between", value1, value2, "printRecords");
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