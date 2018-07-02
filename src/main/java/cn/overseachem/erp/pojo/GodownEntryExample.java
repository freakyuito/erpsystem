package cn.overseachem.erp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GodownEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GodownEntryExample() {
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

        public Criteria andInventoryNumIsNull() {
            addCriterion("inventory_num is null");
            return (Criteria) this;
        }

        public Criteria andInventoryNumIsNotNull() {
            addCriterion("inventory_num is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryNumEqualTo(String value) {
            addCriterion("inventory_num =", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotEqualTo(String value) {
            addCriterion("inventory_num <>", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumGreaterThan(String value) {
            addCriterion("inventory_num >", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_num >=", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumLessThan(String value) {
            addCriterion("inventory_num <", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumLessThanOrEqualTo(String value) {
            addCriterion("inventory_num <=", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumLike(String value) {
            addCriterion("inventory_num like", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotLike(String value) {
            addCriterion("inventory_num not like", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumIn(List<String> values) {
            addCriterion("inventory_num in", values, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotIn(List<String> values) {
            addCriterion("inventory_num not in", values, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumBetween(String value1, String value2) {
            addCriterion("inventory_num between", value1, value2, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotBetween(String value1, String value2) {
            addCriterion("inventory_num not between", value1, value2, "inventoryNum");
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

        public Criteria andCommanderIdIsNull() {
            addCriterion("commander_id is null");
            return (Criteria) this;
        }

        public Criteria andCommanderIdIsNotNull() {
            addCriterion("commander_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommanderIdEqualTo(Integer value) {
            addCriterion("commander_id =", value, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdNotEqualTo(Integer value) {
            addCriterion("commander_id <>", value, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdGreaterThan(Integer value) {
            addCriterion("commander_id >", value, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commander_id >=", value, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdLessThan(Integer value) {
            addCriterion("commander_id <", value, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdLessThanOrEqualTo(Integer value) {
            addCriterion("commander_id <=", value, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdIn(List<Integer> values) {
            addCriterion("commander_id in", values, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdNotIn(List<Integer> values) {
            addCriterion("commander_id not in", values, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdBetween(Integer value1, Integer value2) {
            addCriterion("commander_id between", value1, value2, "commanderId");
            return (Criteria) this;
        }

        public Criteria andCommanderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commander_id not between", value1, value2, "commanderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdIsNull() {
            addCriterion("recorder_id is null");
            return (Criteria) this;
        }

        public Criteria andRecorderIdIsNotNull() {
            addCriterion("recorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecorderIdEqualTo(Integer value) {
            addCriterion("recorder_id =", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdNotEqualTo(Integer value) {
            addCriterion("recorder_id <>", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdGreaterThan(Integer value) {
            addCriterion("recorder_id >", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recorder_id >=", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdLessThan(Integer value) {
            addCriterion("recorder_id <", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("recorder_id <=", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdIn(List<Integer> values) {
            addCriterion("recorder_id in", values, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdNotIn(List<Integer> values) {
            addCriterion("recorder_id not in", values, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdBetween(Integer value1, Integer value2) {
            addCriterion("recorder_id between", value1, value2, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recorder_id not between", value1, value2, "recorderId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdIsNull() {
            addCriterion("inspector_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectorIdIsNotNull() {
            addCriterion("inspector_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectorIdEqualTo(Integer value) {
            addCriterion("inspector_id =", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdNotEqualTo(Integer value) {
            addCriterion("inspector_id <>", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdGreaterThan(Integer value) {
            addCriterion("inspector_id >", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspector_id >=", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdLessThan(Integer value) {
            addCriterion("inspector_id <", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdLessThanOrEqualTo(Integer value) {
            addCriterion("inspector_id <=", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdIn(List<Integer> values) {
            addCriterion("inspector_id in", values, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdNotIn(List<Integer> values) {
            addCriterion("inspector_id not in", values, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdBetween(Integer value1, Integer value2) {
            addCriterion("inspector_id between", value1, value2, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inspector_id not between", value1, value2, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdIsNull() {
            addCriterion("monitor_id is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIdIsNotNull() {
            addCriterion("monitor_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorIdEqualTo(Integer value) {
            addCriterion("monitor_id =", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotEqualTo(Integer value) {
            addCriterion("monitor_id <>", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdGreaterThan(Integer value) {
            addCriterion("monitor_id >", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_id >=", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdLessThan(Integer value) {
            addCriterion("monitor_id <", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_id <=", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdIn(List<Integer> values) {
            addCriterion("monitor_id in", values, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotIn(List<Integer> values) {
            addCriterion("monitor_id not in", values, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdBetween(Integer value1, Integer value2) {
            addCriterion("monitor_id between", value1, value2, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_id not between", value1, value2, "monitorId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdIsNull() {
            addCriterion("workgroup_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdIsNotNull() {
            addCriterion("workgroup_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdEqualTo(Integer value) {
            addCriterion("workgroup_id =", value, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdNotEqualTo(Integer value) {
            addCriterion("workgroup_id <>", value, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdGreaterThan(Integer value) {
            addCriterion("workgroup_id >", value, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("workgroup_id >=", value, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdLessThan(Integer value) {
            addCriterion("workgroup_id <", value, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("workgroup_id <=", value, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdIn(List<Integer> values) {
            addCriterion("workgroup_id in", values, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdNotIn(List<Integer> values) {
            addCriterion("workgroup_id not in", values, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdBetween(Integer value1, Integer value2) {
            addCriterion("workgroup_id between", value1, value2, "workgroupId");
            return (Criteria) this;
        }

        public Criteria andWorkgroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("workgroup_id not between", value1, value2, "workgroupId");
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