package com.hummerrisk.base.domain;

import java.util.ArrayList;
import java.util.List;

public class CloudResourceSyncExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public CloudResourceSyncExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNull() {
            addCriterion("apply_user is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNotNull() {
            addCriterion("apply_user is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEqualTo(String value) {
            addCriterion("apply_user =", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotEqualTo(String value) {
            addCriterion("apply_user <>", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThan(String value) {
            addCriterion("apply_user >", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user >=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThan(String value) {
            addCriterion("apply_user <", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThanOrEqualTo(String value) {
            addCriterion("apply_user <=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLike(String value) {
            addCriterion("apply_user like", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotLike(String value) {
            addCriterion("apply_user not like", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserIn(List<String> values) {
            addCriterion("apply_user in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotIn(List<String> values) {
            addCriterion("apply_user not in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserBetween(String value1, String value2) {
            addCriterion("apply_user between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotBetween(String value1, String value2) {
            addCriterion("apply_user not between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andPluginIdIsNull() {
            addCriterion("plugin_id is null");
            return (Criteria) this;
        }

        public Criteria andPluginIdIsNotNull() {
            addCriterion("plugin_id is not null");
            return (Criteria) this;
        }

        public Criteria andPluginIdEqualTo(String value) {
            addCriterion("plugin_id =", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotEqualTo(String value) {
            addCriterion("plugin_id <>", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdGreaterThan(String value) {
            addCriterion("plugin_id >", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_id >=", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdLessThan(String value) {
            addCriterion("plugin_id <", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdLessThanOrEqualTo(String value) {
            addCriterion("plugin_id <=", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdLike(String value) {
            addCriterion("plugin_id like", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotLike(String value) {
            addCriterion("plugin_id not like", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdIn(List<String> values) {
            addCriterion("plugin_id in", values, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotIn(List<String> values) {
            addCriterion("plugin_id not in", values, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdBetween(String value1, String value2) {
            addCriterion("plugin_id between", value1, value2, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotBetween(String value1, String value2) {
            addCriterion("plugin_id not between", value1, value2, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginNameIsNull() {
            addCriterion("plugin_name is null");
            return (Criteria) this;
        }

        public Criteria andPluginNameIsNotNull() {
            addCriterion("plugin_name is not null");
            return (Criteria) this;
        }

        public Criteria andPluginNameEqualTo(String value) {
            addCriterion("plugin_name =", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameNotEqualTo(String value) {
            addCriterion("plugin_name <>", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameGreaterThan(String value) {
            addCriterion("plugin_name >", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_name >=", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameLessThan(String value) {
            addCriterion("plugin_name <", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameLessThanOrEqualTo(String value) {
            addCriterion("plugin_name <=", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameLike(String value) {
            addCriterion("plugin_name like", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameNotLike(String value) {
            addCriterion("plugin_name not like", value, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameIn(List<String> values) {
            addCriterion("plugin_name in", values, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameNotIn(List<String> values) {
            addCriterion("plugin_name not in", values, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameBetween(String value1, String value2) {
            addCriterion("plugin_name between", value1, value2, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginNameNotBetween(String value1, String value2) {
            addCriterion("plugin_name not between", value1, value2, "pluginName");
            return (Criteria) this;
        }

        public Criteria andPluginIconIsNull() {
            addCriterion("plugin_icon is null");
            return (Criteria) this;
        }

        public Criteria andPluginIconIsNotNull() {
            addCriterion("plugin_icon is not null");
            return (Criteria) this;
        }

        public Criteria andPluginIconEqualTo(String value) {
            addCriterion("plugin_icon =", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconNotEqualTo(String value) {
            addCriterion("plugin_icon <>", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconGreaterThan(String value) {
            addCriterion("plugin_icon >", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_icon >=", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconLessThan(String value) {
            addCriterion("plugin_icon <", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconLessThanOrEqualTo(String value) {
            addCriterion("plugin_icon <=", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconLike(String value) {
            addCriterion("plugin_icon like", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconNotLike(String value) {
            addCriterion("plugin_icon not like", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconIn(List<String> values) {
            addCriterion("plugin_icon in", values, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconNotIn(List<String> values) {
            addCriterion("plugin_icon not in", values, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconBetween(String value1, String value2) {
            addCriterion("plugin_icon between", value1, value2, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconNotBetween(String value1, String value2) {
            addCriterion("plugin_icon not between", value1, value2, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andResourceTypesIsNull() {
            addCriterion("resource_types is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypesIsNotNull() {
            addCriterion("resource_types is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypesEqualTo(String value) {
            addCriterion("resource_types =", value, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesNotEqualTo(String value) {
            addCriterion("resource_types <>", value, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesGreaterThan(String value) {
            addCriterion("resource_types >", value, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesGreaterThanOrEqualTo(String value) {
            addCriterion("resource_types >=", value, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesLessThan(String value) {
            addCriterion("resource_types <", value, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesLessThanOrEqualTo(String value) {
            addCriterion("resource_types <=", value, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesLike(String value) {
            addCriterion("resource_types like", value, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesNotLike(String value) {
            addCriterion("resource_types not like", value, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesIn(List<String> values) {
            addCriterion("resource_types in", values, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesNotIn(List<String> values) {
            addCriterion("resource_types not in", values, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesBetween(String value1, String value2) {
            addCriterion("resource_types between", value1, value2, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourceTypesNotBetween(String value1, String value2) {
            addCriterion("resource_types not between", value1, value2, "resourceTypes");
            return (Criteria) this;
        }

        public Criteria andResourcesSumIsNull() {
            addCriterion("resources_sum is null");
            return (Criteria) this;
        }

        public Criteria andResourcesSumIsNotNull() {
            addCriterion("resources_sum is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesSumEqualTo(Long value) {
            addCriterion("resources_sum =", value, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumNotEqualTo(Long value) {
            addCriterion("resources_sum <>", value, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumGreaterThan(Long value) {
            addCriterion("resources_sum >", value, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumGreaterThanOrEqualTo(Long value) {
            addCriterion("resources_sum >=", value, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumLessThan(Long value) {
            addCriterion("resources_sum <", value, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumLessThanOrEqualTo(Long value) {
            addCriterion("resources_sum <=", value, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumIn(List<Long> values) {
            addCriterion("resources_sum in", values, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumNotIn(List<Long> values) {
            addCriterion("resources_sum not in", values, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumBetween(Long value1, Long value2) {
            addCriterion("resources_sum between", value1, value2, "resourcesSum");
            return (Criteria) this;
        }

        public Criteria andResourcesSumNotBetween(Long value1, Long value2) {
            addCriterion("resources_sum not between", value1, value2, "resourcesSum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated do_not_delete_during_merge Sat Oct 01 14:57:31 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
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