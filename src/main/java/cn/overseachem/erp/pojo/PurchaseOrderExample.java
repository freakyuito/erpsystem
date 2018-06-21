package cn.overseachem.erp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseOrderExample() {
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

        public Criteria andPurchaseNumIsNull() {
            addCriterion("purchase_num is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIsNotNull() {
            addCriterion("purchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumEqualTo(String value) {
            addCriterion("purchase_num =", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotEqualTo(String value) {
            addCriterion("purchase_num <>", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumGreaterThan(String value) {
            addCriterion("purchase_num >", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_num >=", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLessThan(String value) {
            addCriterion("purchase_num <", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLessThanOrEqualTo(String value) {
            addCriterion("purchase_num <=", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLike(String value) {
            addCriterion("purchase_num like", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotLike(String value) {
            addCriterion("purchase_num not like", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIn(List<String> values) {
            addCriterion("purchase_num in", values, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotIn(List<String> values) {
            addCriterion("purchase_num not in", values, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumBetween(String value1, String value2) {
            addCriterion("purchase_num between", value1, value2, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotBetween(String value1, String value2) {
            addCriterion("purchase_num not between", value1, value2, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNull() {
            addCriterion("purchase_time is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNotNull() {
            addCriterion("purchase_time is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_time =", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_time <>", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("purchase_time >", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_time >=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThan(Date value) {
            addCriterionForJDBCDate("purchase_time <", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_time <=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_time in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_time not in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_time between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_time not between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliver_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Date value) {
            addCriterionForJDBCDate("deliver_time =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("deliver_time <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("deliver_time >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deliver_time >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Date value) {
            addCriterionForJDBCDate("deliver_time <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deliver_time <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Date> values) {
            addCriterionForJDBCDate("deliver_time in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("deliver_time not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deliver_time between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deliver_time not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIsNull() {
            addCriterion("supervisor_id is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIsNotNull() {
            addCriterion("supervisor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdEqualTo(Integer value) {
            addCriterion("supervisor_id =", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotEqualTo(Integer value) {
            addCriterion("supervisor_id <>", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdGreaterThan(Integer value) {
            addCriterion("supervisor_id >", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervisor_id >=", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLessThan(Integer value) {
            addCriterion("supervisor_id <", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLessThanOrEqualTo(Integer value) {
            addCriterion("supervisor_id <=", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIn(List<Integer> values) {
            addCriterion("supervisor_id in", values, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotIn(List<Integer> values) {
            addCriterion("supervisor_id not in", values, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdBetween(Integer value1, Integer value2) {
            addCriterion("supervisor_id between", value1, value2, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supervisor_id not between", value1, value2, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIsNull() {
            addCriterion("salesman_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIsNotNull() {
            addCriterion("salesman_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdEqualTo(Integer value) {
            addCriterion("salesman_id =", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotEqualTo(Integer value) {
            addCriterion("salesman_id <>", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdGreaterThan(Integer value) {
            addCriterion("salesman_id >", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesman_id >=", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdLessThan(Integer value) {
            addCriterion("salesman_id <", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdLessThanOrEqualTo(Integer value) {
            addCriterion("salesman_id <=", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIn(List<Integer> values) {
            addCriterion("salesman_id in", values, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotIn(List<Integer> values) {
            addCriterion("salesman_id not in", values, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdBetween(Integer value1, Integer value2) {
            addCriterion("salesman_id between", value1, value2, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salesman_id not between", value1, value2, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andProducerIdIsNull() {
            addCriterion("producer_id is null");
            return (Criteria) this;
        }

        public Criteria andProducerIdIsNotNull() {
            addCriterion("producer_id is not null");
            return (Criteria) this;
        }

        public Criteria andProducerIdEqualTo(Integer value) {
            addCriterion("producer_id =", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotEqualTo(Integer value) {
            addCriterion("producer_id <>", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdGreaterThan(Integer value) {
            addCriterion("producer_id >", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("producer_id >=", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdLessThan(Integer value) {
            addCriterion("producer_id <", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdLessThanOrEqualTo(Integer value) {
            addCriterion("producer_id <=", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdIn(List<Integer> values) {
            addCriterion("producer_id in", values, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotIn(List<Integer> values) {
            addCriterion("producer_id not in", values, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdBetween(Integer value1, Integer value2) {
            addCriterion("producer_id between", value1, value2, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("producer_id not between", value1, value2, "producerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdIsNull() {
            addCriterion("maker_id is null");
            return (Criteria) this;
        }

        public Criteria andMakerIdIsNotNull() {
            addCriterion("maker_id is not null");
            return (Criteria) this;
        }

        public Criteria andMakerIdEqualTo(Integer value) {
            addCriterion("maker_id =", value, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdNotEqualTo(Integer value) {
            addCriterion("maker_id <>", value, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdGreaterThan(Integer value) {
            addCriterion("maker_id >", value, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("maker_id >=", value, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdLessThan(Integer value) {
            addCriterion("maker_id <", value, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdLessThanOrEqualTo(Integer value) {
            addCriterion("maker_id <=", value, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdIn(List<Integer> values) {
            addCriterion("maker_id in", values, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdNotIn(List<Integer> values) {
            addCriterion("maker_id not in", values, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdBetween(Integer value1, Integer value2) {
            addCriterion("maker_id between", value1, value2, "makerId");
            return (Criteria) this;
        }

        public Criteria andMakerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("maker_id not between", value1, value2, "makerId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andValidityCodeIsNull() {
            addCriterion("validity_code is null");
            return (Criteria) this;
        }

        public Criteria andValidityCodeIsNotNull() {
            addCriterion("validity_code is not null");
            return (Criteria) this;
        }

        public Criteria andValidityCodeEqualTo(Boolean value) {
            addCriterion("validity_code =", value, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeNotEqualTo(Boolean value) {
            addCriterion("validity_code <>", value, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeGreaterThan(Boolean value) {
            addCriterion("validity_code >", value, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("validity_code >=", value, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeLessThan(Boolean value) {
            addCriterion("validity_code <", value, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeLessThanOrEqualTo(Boolean value) {
            addCriterion("validity_code <=", value, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeIn(List<Boolean> values) {
            addCriterion("validity_code in", values, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeNotIn(List<Boolean> values) {
            addCriterion("validity_code not in", values, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeBetween(Boolean value1, Boolean value2) {
            addCriterion("validity_code between", value1, value2, "validityCode");
            return (Criteria) this;
        }

        public Criteria andValidityCodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("validity_code not between", value1, value2, "validityCode");
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