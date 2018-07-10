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

        public Criteria andFinishedRecordsIsNull() {
            addCriterion("finished_records is null");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsIsNotNull() {
            addCriterion("finished_records is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsEqualTo(String value) {
            addCriterion("finished_records =", value, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsNotEqualTo(String value) {
            addCriterion("finished_records <>", value, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsGreaterThan(String value) {
            addCriterion("finished_records >", value, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("finished_records >=", value, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsLessThan(String value) {
            addCriterion("finished_records <", value, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsLessThanOrEqualTo(String value) {
            addCriterion("finished_records <=", value, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsLike(String value) {
            addCriterion("finished_records like", value, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsNotLike(String value) {
            addCriterion("finished_records not like", value, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsIn(List<String> values) {
            addCriterion("finished_records in", values, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsNotIn(List<String> values) {
            addCriterion("finished_records not in", values, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsBetween(String value1, String value2) {
            addCriterion("finished_records between", value1, value2, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andFinishedRecordsNotBetween(String value1, String value2) {
            addCriterion("finished_records not between", value1, value2, "finishedRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsIsNull() {
            addCriterion("waste_records is null");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsIsNotNull() {
            addCriterion("waste_records is not null");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsEqualTo(String value) {
            addCriterion("waste_records =", value, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsNotEqualTo(String value) {
            addCriterion("waste_records <>", value, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsGreaterThan(String value) {
            addCriterion("waste_records >", value, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("waste_records >=", value, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsLessThan(String value) {
            addCriterion("waste_records <", value, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsLessThanOrEqualTo(String value) {
            addCriterion("waste_records <=", value, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsLike(String value) {
            addCriterion("waste_records like", value, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsNotLike(String value) {
            addCriterion("waste_records not like", value, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsIn(List<String> values) {
            addCriterion("waste_records in", values, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsNotIn(List<String> values) {
            addCriterion("waste_records not in", values, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsBetween(String value1, String value2) {
            addCriterion("waste_records between", value1, value2, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andWasteRecordsNotBetween(String value1, String value2) {
            addCriterion("waste_records not between", value1, value2, "wasteRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsIsNull() {
            addCriterion("inventory_records is null");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsIsNotNull() {
            addCriterion("inventory_records is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsEqualTo(String value) {
            addCriterion("inventory_records =", value, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsNotEqualTo(String value) {
            addCriterion("inventory_records <>", value, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsGreaterThan(String value) {
            addCriterion("inventory_records >", value, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_records >=", value, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsLessThan(String value) {
            addCriterion("inventory_records <", value, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsLessThanOrEqualTo(String value) {
            addCriterion("inventory_records <=", value, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsLike(String value) {
            addCriterion("inventory_records like", value, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsNotLike(String value) {
            addCriterion("inventory_records not like", value, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsIn(List<String> values) {
            addCriterion("inventory_records in", values, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsNotIn(List<String> values) {
            addCriterion("inventory_records not in", values, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsBetween(String value1, String value2) {
            addCriterion("inventory_records between", value1, value2, "inventoryRecords");
            return (Criteria) this;
        }

        public Criteria andInventoryRecordsNotBetween(String value1, String value2) {
            addCriterion("inventory_records not between", value1, value2, "inventoryRecords");
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

        public Criteria andFkOperationRecordsIdIsNull() {
            addCriterion("fk_operation_records_id is null");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdIsNotNull() {
            addCriterion("fk_operation_records_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdEqualTo(String value) {
            addCriterion("fk_operation_records_id =", value, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdNotEqualTo(String value) {
            addCriterion("fk_operation_records_id <>", value, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdGreaterThan(String value) {
            addCriterion("fk_operation_records_id >", value, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdGreaterThanOrEqualTo(String value) {
            addCriterion("fk_operation_records_id >=", value, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdLessThan(String value) {
            addCriterion("fk_operation_records_id <", value, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdLessThanOrEqualTo(String value) {
            addCriterion("fk_operation_records_id <=", value, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdLike(String value) {
            addCriterion("fk_operation_records_id like", value, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdNotLike(String value) {
            addCriterion("fk_operation_records_id not like", value, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdIn(List<String> values) {
            addCriterion("fk_operation_records_id in", values, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdNotIn(List<String> values) {
            addCriterion("fk_operation_records_id not in", values, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdBetween(String value1, String value2) {
            addCriterion("fk_operation_records_id between", value1, value2, "fkOperationRecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationRecordsIdNotBetween(String value1, String value2) {
            addCriterion("fk_operation_records_id not between", value1, value2, "fkOperationRecordsId");
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