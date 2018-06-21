package cn.overseachem.erp.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductCraftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCraftExample() {
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

        public Criteria andColorIdIsNull() {
            addCriterion("color_id is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("color_id is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(String value) {
            addCriterion("color_id =", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(String value) {
            addCriterion("color_id <>", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThan(String value) {
            addCriterion("color_id >", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(String value) {
            addCriterion("color_id >=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(String value) {
            addCriterion("color_id <", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(String value) {
            addCriterion("color_id <=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLike(String value) {
            addCriterion("color_id like", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotLike(String value) {
            addCriterion("color_id not like", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<String> values) {
            addCriterion("color_id in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<String> values) {
            addCriterion("color_id not in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(String value1, String value2) {
            addCriterion("color_id between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(String value1, String value2) {
            addCriterion("color_id not between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdIsNull() {
            addCriterion("sheet_machine_id is null");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdIsNotNull() {
            addCriterion("sheet_machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdEqualTo(String value) {
            addCriterion("sheet_machine_id =", value, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdNotEqualTo(String value) {
            addCriterion("sheet_machine_id <>", value, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdGreaterThan(String value) {
            addCriterion("sheet_machine_id >", value, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_machine_id >=", value, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdLessThan(String value) {
            addCriterion("sheet_machine_id <", value, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdLessThanOrEqualTo(String value) {
            addCriterion("sheet_machine_id <=", value, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdLike(String value) {
            addCriterion("sheet_machine_id like", value, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdNotLike(String value) {
            addCriterion("sheet_machine_id not like", value, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdIn(List<String> values) {
            addCriterion("sheet_machine_id in", values, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdNotIn(List<String> values) {
            addCriterion("sheet_machine_id not in", values, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdBetween(String value1, String value2) {
            addCriterion("sheet_machine_id between", value1, value2, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetMachineIdNotBetween(String value1, String value2) {
            addCriterion("sheet_machine_id not between", value1, value2, "sheetMachineId");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessIsNull() {
            addCriterion("sheet_thickness is null");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessIsNotNull() {
            addCriterion("sheet_thickness is not null");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessEqualTo(Float value) {
            addCriterion("sheet_thickness =", value, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessNotEqualTo(Float value) {
            addCriterion("sheet_thickness <>", value, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessGreaterThan(Float value) {
            addCriterion("sheet_thickness >", value, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessGreaterThanOrEqualTo(Float value) {
            addCriterion("sheet_thickness >=", value, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessLessThan(Float value) {
            addCriterion("sheet_thickness <", value, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessLessThanOrEqualTo(Float value) {
            addCriterion("sheet_thickness <=", value, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessIn(List<Float> values) {
            addCriterion("sheet_thickness in", values, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessNotIn(List<Float> values) {
            addCriterion("sheet_thickness not in", values, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessBetween(Float value1, Float value2) {
            addCriterion("sheet_thickness between", value1, value2, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetThicknessNotBetween(Float value1, Float value2) {
            addCriterion("sheet_thickness not between", value1, value2, "sheetThickness");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsIsNull() {
            addCriterion("sheet_meteringPump_revs is null");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsIsNotNull() {
            addCriterion("sheet_meteringPump_revs is not null");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsEqualTo(String value) {
            addCriterion("sheet_meteringPump_revs =", value, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsNotEqualTo(String value) {
            addCriterion("sheet_meteringPump_revs <>", value, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsGreaterThan(String value) {
            addCriterion("sheet_meteringPump_revs >", value, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_meteringPump_revs >=", value, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsLessThan(String value) {
            addCriterion("sheet_meteringPump_revs <", value, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsLessThanOrEqualTo(String value) {
            addCriterion("sheet_meteringPump_revs <=", value, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsLike(String value) {
            addCriterion("sheet_meteringPump_revs like", value, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsNotLike(String value) {
            addCriterion("sheet_meteringPump_revs not like", value, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsIn(List<String> values) {
            addCriterion("sheet_meteringPump_revs in", values, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsNotIn(List<String> values) {
            addCriterion("sheet_meteringPump_revs not in", values, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsBetween(String value1, String value2) {
            addCriterion("sheet_meteringPump_revs between", value1, value2, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMeteringpumpRevsNotBetween(String value1, String value2) {
            addCriterion("sheet_meteringPump_revs not between", value1, value2, "sheetMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameIsNull() {
            addCriterion("sheet_material_name is null");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameIsNotNull() {
            addCriterion("sheet_material_name is not null");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameEqualTo(String value) {
            addCriterion("sheet_material_name =", value, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameNotEqualTo(String value) {
            addCriterion("sheet_material_name <>", value, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameGreaterThan(String value) {
            addCriterion("sheet_material_name >", value, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_material_name >=", value, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameLessThan(String value) {
            addCriterion("sheet_material_name <", value, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("sheet_material_name <=", value, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameLike(String value) {
            addCriterion("sheet_material_name like", value, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameNotLike(String value) {
            addCriterion("sheet_material_name not like", value, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameIn(List<String> values) {
            addCriterion("sheet_material_name in", values, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameNotIn(List<String> values) {
            addCriterion("sheet_material_name not in", values, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameBetween(String value1, String value2) {
            addCriterion("sheet_material_name between", value1, value2, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMaterialNameNotBetween(String value1, String value2) {
            addCriterion("sheet_material_name not between", value1, value2, "sheetMaterialName");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandIsNull() {
            addCriterion("sheet_masterBatch_brand is null");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandIsNotNull() {
            addCriterion("sheet_masterBatch_brand is not null");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandEqualTo(String value) {
            addCriterion("sheet_masterBatch_brand =", value, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandNotEqualTo(String value) {
            addCriterion("sheet_masterBatch_brand <>", value, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandGreaterThan(String value) {
            addCriterion("sheet_masterBatch_brand >", value, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_masterBatch_brand >=", value, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandLessThan(String value) {
            addCriterion("sheet_masterBatch_brand <", value, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandLessThanOrEqualTo(String value) {
            addCriterion("sheet_masterBatch_brand <=", value, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandLike(String value) {
            addCriterion("sheet_masterBatch_brand like", value, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandNotLike(String value) {
            addCriterion("sheet_masterBatch_brand not like", value, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandIn(List<String> values) {
            addCriterion("sheet_masterBatch_brand in", values, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandNotIn(List<String> values) {
            addCriterion("sheet_masterBatch_brand not in", values, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandBetween(String value1, String value2) {
            addCriterion("sheet_masterBatch_brand between", value1, value2, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchBrandNotBetween(String value1, String value2) {
            addCriterion("sheet_masterBatch_brand not between", value1, value2, "sheetMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsIsNull() {
            addCriterion("sheet_masterBatch_revs is null");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsIsNotNull() {
            addCriterion("sheet_masterBatch_revs is not null");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsEqualTo(String value) {
            addCriterion("sheet_masterBatch_revs =", value, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsNotEqualTo(String value) {
            addCriterion("sheet_masterBatch_revs <>", value, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsGreaterThan(String value) {
            addCriterion("sheet_masterBatch_revs >", value, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_masterBatch_revs >=", value, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsLessThan(String value) {
            addCriterion("sheet_masterBatch_revs <", value, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsLessThanOrEqualTo(String value) {
            addCriterion("sheet_masterBatch_revs <=", value, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsLike(String value) {
            addCriterion("sheet_masterBatch_revs like", value, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsNotLike(String value) {
            addCriterion("sheet_masterBatch_revs not like", value, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsIn(List<String> values) {
            addCriterion("sheet_masterBatch_revs in", values, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsNotIn(List<String> values) {
            addCriterion("sheet_masterBatch_revs not in", values, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsBetween(String value1, String value2) {
            addCriterion("sheet_masterBatch_revs between", value1, value2, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchRevsNotBetween(String value1, String value2) {
            addCriterion("sheet_masterBatch_revs not between", value1, value2, "sheetMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionIsNull() {
            addCriterion("sheet_masterBatch_proportion is null");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionIsNotNull() {
            addCriterion("sheet_masterBatch_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionEqualTo(String value) {
            addCriterion("sheet_masterBatch_proportion =", value, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionNotEqualTo(String value) {
            addCriterion("sheet_masterBatch_proportion <>", value, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionGreaterThan(String value) {
            addCriterion("sheet_masterBatch_proportion >", value, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_masterBatch_proportion >=", value, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionLessThan(String value) {
            addCriterion("sheet_masterBatch_proportion <", value, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionLessThanOrEqualTo(String value) {
            addCriterion("sheet_masterBatch_proportion <=", value, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionLike(String value) {
            addCriterion("sheet_masterBatch_proportion like", value, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionNotLike(String value) {
            addCriterion("sheet_masterBatch_proportion not like", value, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionIn(List<String> values) {
            addCriterion("sheet_masterBatch_proportion in", values, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionNotIn(List<String> values) {
            addCriterion("sheet_masterBatch_proportion not in", values, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionBetween(String value1, String value2) {
            addCriterion("sheet_masterBatch_proportion between", value1, value2, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetMasterbatchProportionNotBetween(String value1, String value2) {
            addCriterion("sheet_masterBatch_proportion not between", value1, value2, "sheetMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandIsNull() {
            addCriterion("sheet_antiSticking_brand is null");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandIsNotNull() {
            addCriterion("sheet_antiSticking_brand is not null");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandEqualTo(String value) {
            addCriterion("sheet_antiSticking_brand =", value, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandNotEqualTo(String value) {
            addCriterion("sheet_antiSticking_brand <>", value, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandGreaterThan(String value) {
            addCriterion("sheet_antiSticking_brand >", value, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_antiSticking_brand >=", value, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandLessThan(String value) {
            addCriterion("sheet_antiSticking_brand <", value, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandLessThanOrEqualTo(String value) {
            addCriterion("sheet_antiSticking_brand <=", value, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandLike(String value) {
            addCriterion("sheet_antiSticking_brand like", value, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandNotLike(String value) {
            addCriterion("sheet_antiSticking_brand not like", value, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandIn(List<String> values) {
            addCriterion("sheet_antiSticking_brand in", values, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandNotIn(List<String> values) {
            addCriterion("sheet_antiSticking_brand not in", values, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandBetween(String value1, String value2) {
            addCriterion("sheet_antiSticking_brand between", value1, value2, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingBrandNotBetween(String value1, String value2) {
            addCriterion("sheet_antiSticking_brand not between", value1, value2, "sheetAntistickingBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsIsNull() {
            addCriterion("sheet_antiSticking_revs is null");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsIsNotNull() {
            addCriterion("sheet_antiSticking_revs is not null");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsEqualTo(String value) {
            addCriterion("sheet_antiSticking_revs =", value, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsNotEqualTo(String value) {
            addCriterion("sheet_antiSticking_revs <>", value, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsGreaterThan(String value) {
            addCriterion("sheet_antiSticking_revs >", value, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_antiSticking_revs >=", value, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsLessThan(String value) {
            addCriterion("sheet_antiSticking_revs <", value, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsLessThanOrEqualTo(String value) {
            addCriterion("sheet_antiSticking_revs <=", value, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsLike(String value) {
            addCriterion("sheet_antiSticking_revs like", value, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsNotLike(String value) {
            addCriterion("sheet_antiSticking_revs not like", value, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsIn(List<String> values) {
            addCriterion("sheet_antiSticking_revs in", values, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsNotIn(List<String> values) {
            addCriterion("sheet_antiSticking_revs not in", values, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsBetween(String value1, String value2) {
            addCriterion("sheet_antiSticking_revs between", value1, value2, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistickingRevsNotBetween(String value1, String value2) {
            addCriterion("sheet_antiSticking_revs not between", value1, value2, "sheetAntistickingRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandIsNull() {
            addCriterion("sheet_antiStatic_brand is null");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandIsNotNull() {
            addCriterion("sheet_antiStatic_brand is not null");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandEqualTo(String value) {
            addCriterion("sheet_antiStatic_brand =", value, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandNotEqualTo(String value) {
            addCriterion("sheet_antiStatic_brand <>", value, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandGreaterThan(String value) {
            addCriterion("sheet_antiStatic_brand >", value, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_antiStatic_brand >=", value, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandLessThan(String value) {
            addCriterion("sheet_antiStatic_brand <", value, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandLessThanOrEqualTo(String value) {
            addCriterion("sheet_antiStatic_brand <=", value, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandLike(String value) {
            addCriterion("sheet_antiStatic_brand like", value, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandNotLike(String value) {
            addCriterion("sheet_antiStatic_brand not like", value, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandIn(List<String> values) {
            addCriterion("sheet_antiStatic_brand in", values, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandNotIn(List<String> values) {
            addCriterion("sheet_antiStatic_brand not in", values, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandBetween(String value1, String value2) {
            addCriterion("sheet_antiStatic_brand between", value1, value2, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticBrandNotBetween(String value1, String value2) {
            addCriterion("sheet_antiStatic_brand not between", value1, value2, "sheetAntistaticBrand");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsIsNull() {
            addCriterion("sheet_antiStatic_revs is null");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsIsNotNull() {
            addCriterion("sheet_antiStatic_revs is not null");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsEqualTo(String value) {
            addCriterion("sheet_antiStatic_revs =", value, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsNotEqualTo(String value) {
            addCriterion("sheet_antiStatic_revs <>", value, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsGreaterThan(String value) {
            addCriterion("sheet_antiStatic_revs >", value, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_antiStatic_revs >=", value, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsLessThan(String value) {
            addCriterion("sheet_antiStatic_revs <", value, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsLessThanOrEqualTo(String value) {
            addCriterion("sheet_antiStatic_revs <=", value, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsLike(String value) {
            addCriterion("sheet_antiStatic_revs like", value, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsNotLike(String value) {
            addCriterion("sheet_antiStatic_revs not like", value, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsIn(List<String> values) {
            addCriterion("sheet_antiStatic_revs in", values, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsNotIn(List<String> values) {
            addCriterion("sheet_antiStatic_revs not in", values, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsBetween(String value1, String value2) {
            addCriterion("sheet_antiStatic_revs between", value1, value2, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andSheetAntistaticRevsNotBetween(String value1, String value2) {
            addCriterion("sheet_antiStatic_revs not between", value1, value2, "sheetAntistaticRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdIsNull() {
            addCriterion("plate_machine_id is null");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdIsNotNull() {
            addCriterion("plate_machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdEqualTo(String value) {
            addCriterion("plate_machine_id =", value, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdNotEqualTo(String value) {
            addCriterion("plate_machine_id <>", value, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdGreaterThan(String value) {
            addCriterion("plate_machine_id >", value, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdGreaterThanOrEqualTo(String value) {
            addCriterion("plate_machine_id >=", value, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdLessThan(String value) {
            addCriterion("plate_machine_id <", value, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdLessThanOrEqualTo(String value) {
            addCriterion("plate_machine_id <=", value, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdLike(String value) {
            addCriterion("plate_machine_id like", value, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdNotLike(String value) {
            addCriterion("plate_machine_id not like", value, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdIn(List<String> values) {
            addCriterion("plate_machine_id in", values, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdNotIn(List<String> values) {
            addCriterion("plate_machine_id not in", values, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdBetween(String value1, String value2) {
            addCriterion("plate_machine_id between", value1, value2, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMachineIdNotBetween(String value1, String value2) {
            addCriterion("plate_machine_id not between", value1, value2, "plateMachineId");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsIsNull() {
            addCriterion("plate_meteringPump_revs is null");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsIsNotNull() {
            addCriterion("plate_meteringPump_revs is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsEqualTo(String value) {
            addCriterion("plate_meteringPump_revs =", value, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsNotEqualTo(String value) {
            addCriterion("plate_meteringPump_revs <>", value, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsGreaterThan(String value) {
            addCriterion("plate_meteringPump_revs >", value, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsGreaterThanOrEqualTo(String value) {
            addCriterion("plate_meteringPump_revs >=", value, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsLessThan(String value) {
            addCriterion("plate_meteringPump_revs <", value, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsLessThanOrEqualTo(String value) {
            addCriterion("plate_meteringPump_revs <=", value, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsLike(String value) {
            addCriterion("plate_meteringPump_revs like", value, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsNotLike(String value) {
            addCriterion("plate_meteringPump_revs not like", value, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsIn(List<String> values) {
            addCriterion("plate_meteringPump_revs in", values, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsNotIn(List<String> values) {
            addCriterion("plate_meteringPump_revs not in", values, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsBetween(String value1, String value2) {
            addCriterion("plate_meteringPump_revs between", value1, value2, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMeteringpumpRevsNotBetween(String value1, String value2) {
            addCriterion("plate_meteringPump_revs not between", value1, value2, "plateMeteringpumpRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1IsNull() {
            addCriterion("plate_material_name1 is null");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1IsNotNull() {
            addCriterion("plate_material_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1EqualTo(String value) {
            addCriterion("plate_material_name1 =", value, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1NotEqualTo(String value) {
            addCriterion("plate_material_name1 <>", value, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1GreaterThan(String value) {
            addCriterion("plate_material_name1 >", value, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1GreaterThanOrEqualTo(String value) {
            addCriterion("plate_material_name1 >=", value, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1LessThan(String value) {
            addCriterion("plate_material_name1 <", value, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1LessThanOrEqualTo(String value) {
            addCriterion("plate_material_name1 <=", value, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1Like(String value) {
            addCriterion("plate_material_name1 like", value, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1NotLike(String value) {
            addCriterion("plate_material_name1 not like", value, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1In(List<String> values) {
            addCriterion("plate_material_name1 in", values, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1NotIn(List<String> values) {
            addCriterion("plate_material_name1 not in", values, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1Between(String value1, String value2) {
            addCriterion("plate_material_name1 between", value1, value2, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName1NotBetween(String value1, String value2) {
            addCriterion("plate_material_name1 not between", value1, value2, "plateMaterialName1");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2IsNull() {
            addCriterion("plate_material_name2 is null");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2IsNotNull() {
            addCriterion("plate_material_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2EqualTo(String value) {
            addCriterion("plate_material_name2 =", value, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2NotEqualTo(String value) {
            addCriterion("plate_material_name2 <>", value, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2GreaterThan(String value) {
            addCriterion("plate_material_name2 >", value, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2GreaterThanOrEqualTo(String value) {
            addCriterion("plate_material_name2 >=", value, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2LessThan(String value) {
            addCriterion("plate_material_name2 <", value, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2LessThanOrEqualTo(String value) {
            addCriterion("plate_material_name2 <=", value, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2Like(String value) {
            addCriterion("plate_material_name2 like", value, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2NotLike(String value) {
            addCriterion("plate_material_name2 not like", value, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2In(List<String> values) {
            addCriterion("plate_material_name2 in", values, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2NotIn(List<String> values) {
            addCriterion("plate_material_name2 not in", values, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2Between(String value1, String value2) {
            addCriterion("plate_material_name2 between", value1, value2, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName2NotBetween(String value1, String value2) {
            addCriterion("plate_material_name2 not between", value1, value2, "plateMaterialName2");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3IsNull() {
            addCriterion("plate_material_name3 is null");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3IsNotNull() {
            addCriterion("plate_material_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3EqualTo(String value) {
            addCriterion("plate_material_name3 =", value, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3NotEqualTo(String value) {
            addCriterion("plate_material_name3 <>", value, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3GreaterThan(String value) {
            addCriterion("plate_material_name3 >", value, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3GreaterThanOrEqualTo(String value) {
            addCriterion("plate_material_name3 >=", value, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3LessThan(String value) {
            addCriterion("plate_material_name3 <", value, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3LessThanOrEqualTo(String value) {
            addCriterion("plate_material_name3 <=", value, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3Like(String value) {
            addCriterion("plate_material_name3 like", value, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3NotLike(String value) {
            addCriterion("plate_material_name3 not like", value, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3In(List<String> values) {
            addCriterion("plate_material_name3 in", values, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3NotIn(List<String> values) {
            addCriterion("plate_material_name3 not in", values, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3Between(String value1, String value2) {
            addCriterion("plate_material_name3 between", value1, value2, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName3NotBetween(String value1, String value2) {
            addCriterion("plate_material_name3 not between", value1, value2, "plateMaterialName3");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4IsNull() {
            addCriterion("plate_material_name4 is null");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4IsNotNull() {
            addCriterion("plate_material_name4 is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4EqualTo(String value) {
            addCriterion("plate_material_name4 =", value, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4NotEqualTo(String value) {
            addCriterion("plate_material_name4 <>", value, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4GreaterThan(String value) {
            addCriterion("plate_material_name4 >", value, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4GreaterThanOrEqualTo(String value) {
            addCriterion("plate_material_name4 >=", value, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4LessThan(String value) {
            addCriterion("plate_material_name4 <", value, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4LessThanOrEqualTo(String value) {
            addCriterion("plate_material_name4 <=", value, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4Like(String value) {
            addCriterion("plate_material_name4 like", value, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4NotLike(String value) {
            addCriterion("plate_material_name4 not like", value, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4In(List<String> values) {
            addCriterion("plate_material_name4 in", values, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4NotIn(List<String> values) {
            addCriterion("plate_material_name4 not in", values, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4Between(String value1, String value2) {
            addCriterion("plate_material_name4 between", value1, value2, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMaterialName4NotBetween(String value1, String value2) {
            addCriterion("plate_material_name4 not between", value1, value2, "plateMaterialName4");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsIsNull() {
            addCriterion("plate_masterBatch_revs is null");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsIsNotNull() {
            addCriterion("plate_masterBatch_revs is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsEqualTo(String value) {
            addCriterion("plate_masterBatch_revs =", value, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsNotEqualTo(String value) {
            addCriterion("plate_masterBatch_revs <>", value, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsGreaterThan(String value) {
            addCriterion("plate_masterBatch_revs >", value, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsGreaterThanOrEqualTo(String value) {
            addCriterion("plate_masterBatch_revs >=", value, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsLessThan(String value) {
            addCriterion("plate_masterBatch_revs <", value, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsLessThanOrEqualTo(String value) {
            addCriterion("plate_masterBatch_revs <=", value, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsLike(String value) {
            addCriterion("plate_masterBatch_revs like", value, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsNotLike(String value) {
            addCriterion("plate_masterBatch_revs not like", value, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsIn(List<String> values) {
            addCriterion("plate_masterBatch_revs in", values, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsNotIn(List<String> values) {
            addCriterion("plate_masterBatch_revs not in", values, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsBetween(String value1, String value2) {
            addCriterion("plate_masterBatch_revs between", value1, value2, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchRevsNotBetween(String value1, String value2) {
            addCriterion("plate_masterBatch_revs not between", value1, value2, "plateMasterbatchRevs");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandIsNull() {
            addCriterion("plate_masterBatch_brand is null");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandIsNotNull() {
            addCriterion("plate_masterBatch_brand is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandEqualTo(String value) {
            addCriterion("plate_masterBatch_brand =", value, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandNotEqualTo(String value) {
            addCriterion("plate_masterBatch_brand <>", value, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandGreaterThan(String value) {
            addCriterion("plate_masterBatch_brand >", value, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandGreaterThanOrEqualTo(String value) {
            addCriterion("plate_masterBatch_brand >=", value, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandLessThan(String value) {
            addCriterion("plate_masterBatch_brand <", value, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandLessThanOrEqualTo(String value) {
            addCriterion("plate_masterBatch_brand <=", value, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandLike(String value) {
            addCriterion("plate_masterBatch_brand like", value, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandNotLike(String value) {
            addCriterion("plate_masterBatch_brand not like", value, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandIn(List<String> values) {
            addCriterion("plate_masterBatch_brand in", values, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandNotIn(List<String> values) {
            addCriterion("plate_masterBatch_brand not in", values, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandBetween(String value1, String value2) {
            addCriterion("plate_masterBatch_brand between", value1, value2, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchBrandNotBetween(String value1, String value2) {
            addCriterion("plate_masterBatch_brand not between", value1, value2, "plateMasterbatchBrand");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionIsNull() {
            addCriterion("plate_masterBatch_proportion is null");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionIsNotNull() {
            addCriterion("plate_masterBatch_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionEqualTo(String value) {
            addCriterion("plate_masterBatch_proportion =", value, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionNotEqualTo(String value) {
            addCriterion("plate_masterBatch_proportion <>", value, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionGreaterThan(String value) {
            addCriterion("plate_masterBatch_proportion >", value, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionGreaterThanOrEqualTo(String value) {
            addCriterion("plate_masterBatch_proportion >=", value, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionLessThan(String value) {
            addCriterion("plate_masterBatch_proportion <", value, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionLessThanOrEqualTo(String value) {
            addCriterion("plate_masterBatch_proportion <=", value, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionLike(String value) {
            addCriterion("plate_masterBatch_proportion like", value, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionNotLike(String value) {
            addCriterion("plate_masterBatch_proportion not like", value, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionIn(List<String> values) {
            addCriterion("plate_masterBatch_proportion in", values, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionNotIn(List<String> values) {
            addCriterion("plate_masterBatch_proportion not in", values, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionBetween(String value1, String value2) {
            addCriterion("plate_masterBatch_proportion between", value1, value2, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMasterbatchProportionNotBetween(String value1, String value2) {
            addCriterion("plate_masterBatch_proportion not between", value1, value2, "plateMasterbatchProportion");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameIsNull() {
            addCriterion("plate_membrane_name is null");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameIsNotNull() {
            addCriterion("plate_membrane_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameEqualTo(String value) {
            addCriterion("plate_membrane_name =", value, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameNotEqualTo(String value) {
            addCriterion("plate_membrane_name <>", value, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameGreaterThan(String value) {
            addCriterion("plate_membrane_name >", value, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameGreaterThanOrEqualTo(String value) {
            addCriterion("plate_membrane_name >=", value, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameLessThan(String value) {
            addCriterion("plate_membrane_name <", value, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameLessThanOrEqualTo(String value) {
            addCriterion("plate_membrane_name <=", value, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameLike(String value) {
            addCriterion("plate_membrane_name like", value, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameNotLike(String value) {
            addCriterion("plate_membrane_name not like", value, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameIn(List<String> values) {
            addCriterion("plate_membrane_name in", values, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameNotIn(List<String> values) {
            addCriterion("plate_membrane_name not in", values, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameBetween(String value1, String value2) {
            addCriterion("plate_membrane_name between", value1, value2, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateMembraneNameNotBetween(String value1, String value2) {
            addCriterion("plate_membrane_name not between", value1, value2, "plateMembraneName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameIsNull() {
            addCriterion("plate_embossing_name is null");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameIsNotNull() {
            addCriterion("plate_embossing_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameEqualTo(String value) {
            addCriterion("plate_embossing_name =", value, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameNotEqualTo(String value) {
            addCriterion("plate_embossing_name <>", value, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameGreaterThan(String value) {
            addCriterion("plate_embossing_name >", value, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameGreaterThanOrEqualTo(String value) {
            addCriterion("plate_embossing_name >=", value, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameLessThan(String value) {
            addCriterion("plate_embossing_name <", value, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameLessThanOrEqualTo(String value) {
            addCriterion("plate_embossing_name <=", value, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameLike(String value) {
            addCriterion("plate_embossing_name like", value, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameNotLike(String value) {
            addCriterion("plate_embossing_name not like", value, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameIn(List<String> values) {
            addCriterion("plate_embossing_name in", values, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameNotIn(List<String> values) {
            addCriterion("plate_embossing_name not in", values, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameBetween(String value1, String value2) {
            addCriterion("plate_embossing_name between", value1, value2, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andPlateEmbossingNameNotBetween(String value1, String value2) {
            addCriterion("plate_embossing_name not between", value1, value2, "plateEmbossingName");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdIsNull() {
            addCriterion("fk_operationRecords_id is null");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdIsNotNull() {
            addCriterion("fk_operationRecords_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdEqualTo(String value) {
            addCriterion("fk_operationRecords_id =", value, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdNotEqualTo(String value) {
            addCriterion("fk_operationRecords_id <>", value, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdGreaterThan(String value) {
            addCriterion("fk_operationRecords_id >", value, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdGreaterThanOrEqualTo(String value) {
            addCriterion("fk_operationRecords_id >=", value, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdLessThan(String value) {
            addCriterion("fk_operationRecords_id <", value, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdLessThanOrEqualTo(String value) {
            addCriterion("fk_operationRecords_id <=", value, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdLike(String value) {
            addCriterion("fk_operationRecords_id like", value, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdNotLike(String value) {
            addCriterion("fk_operationRecords_id not like", value, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdIn(List<String> values) {
            addCriterion("fk_operationRecords_id in", values, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdNotIn(List<String> values) {
            addCriterion("fk_operationRecords_id not in", values, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdBetween(String value1, String value2) {
            addCriterion("fk_operationRecords_id between", value1, value2, "fkOperationrecordsId");
            return (Criteria) this;
        }

        public Criteria andFkOperationrecordsIdNotBetween(String value1, String value2) {
            addCriterion("fk_operationRecords_id not between", value1, value2, "fkOperationrecordsId");
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