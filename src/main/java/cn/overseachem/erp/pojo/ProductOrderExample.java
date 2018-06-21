package cn.overseachem.erp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductOrderExample() {
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

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(String value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(String value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(String value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(String value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(String value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLike(String value) {
            addCriterion("product_num like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotLike(String value) {
            addCriterion("product_num not like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<String> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<String> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(String value1, String value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(String value1, String value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumIsNull() {
            addCriterion("fk_purchase_num is null");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumIsNotNull() {
            addCriterion("fk_purchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumEqualTo(String value) {
            addCriterion("fk_purchase_num =", value, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumNotEqualTo(String value) {
            addCriterion("fk_purchase_num <>", value, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumGreaterThan(String value) {
            addCriterion("fk_purchase_num >", value, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumGreaterThanOrEqualTo(String value) {
            addCriterion("fk_purchase_num >=", value, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumLessThan(String value) {
            addCriterion("fk_purchase_num <", value, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumLessThanOrEqualTo(String value) {
            addCriterion("fk_purchase_num <=", value, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumLike(String value) {
            addCriterion("fk_purchase_num like", value, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumNotLike(String value) {
            addCriterion("fk_purchase_num not like", value, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumIn(List<String> values) {
            addCriterion("fk_purchase_num in", values, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumNotIn(List<String> values) {
            addCriterion("fk_purchase_num not in", values, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumBetween(String value1, String value2) {
            addCriterion("fk_purchase_num between", value1, value2, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andFkPurchaseNumNotBetween(String value1, String value2) {
            addCriterion("fk_purchase_num not between", value1, value2, "fkPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumIsNull() {
            addCriterion("machine_num is null");
            return (Criteria) this;
        }

        public Criteria andMachineNumIsNotNull() {
            addCriterion("machine_num is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNumEqualTo(Integer value) {
            addCriterion("machine_num =", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumNotEqualTo(Integer value) {
            addCriterion("machine_num <>", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumGreaterThan(Integer value) {
            addCriterion("machine_num >", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_num >=", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumLessThan(Integer value) {
            addCriterion("machine_num <", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumLessThanOrEqualTo(Integer value) {
            addCriterion("machine_num <=", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumIn(List<Integer> values) {
            addCriterion("machine_num in", values, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumNotIn(List<Integer> values) {
            addCriterion("machine_num not in", values, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumBetween(Integer value1, Integer value2) {
            addCriterion("machine_num between", value1, value2, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_num not between", value1, value2, "machineNum");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Integer value) {
            addCriterion("receiver_id =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Integer value) {
            addCriterion("receiver_id <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Integer value) {
            addCriterion("receiver_id >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_id >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Integer value) {
            addCriterion("receiver_id <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_id <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Integer> values) {
            addCriterion("receiver_id in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Integer> values) {
            addCriterion("receiver_id not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Integer value1, Integer value2) {
            addCriterion("receiver_id between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_id not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIsNull() {
            addCriterion("generate_time is null");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIsNotNull() {
            addCriterion("generate_time is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time =", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time <>", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("generate_time >", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time >=", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeLessThan(Date value) {
            addCriterionForJDBCDate("generate_time <", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time <=", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("generate_time in", values, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("generate_time not in", values, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("generate_time between", value1, value2, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("generate_time not between", value1, value2, "generateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeIsNull() {
            addCriterion("schedule_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeIsNotNull() {
            addCriterion("schedule_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeEqualTo(Date value) {
            addCriterion("schedule_begin_time =", value, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeNotEqualTo(Date value) {
            addCriterion("schedule_begin_time <>", value, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeGreaterThan(Date value) {
            addCriterion("schedule_begin_time >", value, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("schedule_begin_time >=", value, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeLessThan(Date value) {
            addCriterion("schedule_begin_time <", value, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("schedule_begin_time <=", value, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeIn(List<Date> values) {
            addCriterion("schedule_begin_time in", values, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeNotIn(List<Date> values) {
            addCriterion("schedule_begin_time not in", values, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeBetween(Date value1, Date value2) {
            addCriterion("schedule_begin_time between", value1, value2, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("schedule_begin_time not between", value1, value2, "scheduleBeginTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeIsNull() {
            addCriterion("schedule_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeIsNotNull() {
            addCriterion("schedule_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeEqualTo(Date value) {
            addCriterion("schedule_finish_time =", value, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeNotEqualTo(Date value) {
            addCriterion("schedule_finish_time <>", value, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeGreaterThan(Date value) {
            addCriterion("schedule_finish_time >", value, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("schedule_finish_time >=", value, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeLessThan(Date value) {
            addCriterion("schedule_finish_time <", value, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("schedule_finish_time <=", value, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeIn(List<Date> values) {
            addCriterion("schedule_finish_time in", values, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeNotIn(List<Date> values) {
            addCriterion("schedule_finish_time not in", values, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeBetween(Date value1, Date value2) {
            addCriterion("schedule_finish_time between", value1, value2, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andScheduleFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("schedule_finish_time not between", value1, value2, "scheduleFinishTime");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNull() {
            addCriterion("approver_id is null");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNotNull() {
            addCriterion("approver_id is not null");
            return (Criteria) this;
        }

        public Criteria andApproverIdEqualTo(Integer value) {
            addCriterion("approver_id =", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotEqualTo(Integer value) {
            addCriterion("approver_id <>", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThan(Integer value) {
            addCriterion("approver_id >", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approver_id >=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThan(Integer value) {
            addCriterion("approver_id <", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThanOrEqualTo(Integer value) {
            addCriterion("approver_id <=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdIn(List<Integer> values) {
            addCriterion("approver_id in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotIn(List<Integer> values) {
            addCriterion("approver_id not in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdBetween(Integer value1, Integer value2) {
            addCriterion("approver_id between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approver_id not between", value1, value2, "approverId");
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