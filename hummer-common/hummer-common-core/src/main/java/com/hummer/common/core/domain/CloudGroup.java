package com.hummer.common.core.domain;

import java.io.Serializable;

public class CloudGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.project_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.group_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.group_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.group_desc
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String groupDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.group_level
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String groupLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.group_flag
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private Boolean groupFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.status
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.account_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String accountName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.account_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.plugin_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String pluginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.plugin_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String pluginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.plugin_icon
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String pluginIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.creator
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.create_time
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.resources_sum
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private Long resourcesSum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.return_sum
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private Long returnSum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.job_type
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private String jobType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_group.xxl_job_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private Integer xxlJobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_group
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.id
     *
     * @return the value of cloud_group.id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.id
     *
     * @param id the value for cloud_group.id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.project_id
     *
     * @return the value of cloud_group.project_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.project_id
     *
     * @param projectId the value for cloud_group.project_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.group_id
     *
     * @return the value of cloud_group.group_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.group_id
     *
     * @param groupId the value for cloud_group.group_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.group_name
     *
     * @return the value of cloud_group.group_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.group_name
     *
     * @param groupName the value for cloud_group.group_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.group_desc
     *
     * @return the value of cloud_group.group_desc
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.group_desc
     *
     * @param groupDesc the value for cloud_group.group_desc
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.group_level
     *
     * @return the value of cloud_group.group_level
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getGroupLevel() {
        return groupLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.group_level
     *
     * @param groupLevel the value for cloud_group.group_level
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setGroupLevel(String groupLevel) {
        this.groupLevel = groupLevel == null ? null : groupLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.group_flag
     *
     * @return the value of cloud_group.group_flag
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public Boolean getGroupFlag() {
        return groupFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.group_flag
     *
     * @param groupFlag the value for cloud_group.group_flag
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setGroupFlag(Boolean groupFlag) {
        this.groupFlag = groupFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.status
     *
     * @return the value of cloud_group.status
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.status
     *
     * @param status the value for cloud_group.status
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.account_name
     *
     * @return the value of cloud_group.account_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.account_name
     *
     * @param accountName the value for cloud_group.account_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.account_id
     *
     * @return the value of cloud_group.account_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.account_id
     *
     * @param accountId the value for cloud_group.account_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.plugin_id
     *
     * @return the value of cloud_group.plugin_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.plugin_id
     *
     * @param pluginId the value for cloud_group.plugin_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.plugin_name
     *
     * @return the value of cloud_group.plugin_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.plugin_name
     *
     * @param pluginName the value for cloud_group.plugin_name
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName == null ? null : pluginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.plugin_icon
     *
     * @return the value of cloud_group.plugin_icon
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getPluginIcon() {
        return pluginIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.plugin_icon
     *
     * @param pluginIcon the value for cloud_group.plugin_icon
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setPluginIcon(String pluginIcon) {
        this.pluginIcon = pluginIcon == null ? null : pluginIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.creator
     *
     * @return the value of cloud_group.creator
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.creator
     *
     * @param creator the value for cloud_group.creator
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.create_time
     *
     * @return the value of cloud_group.create_time
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.create_time
     *
     * @param createTime the value for cloud_group.create_time
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.resources_sum
     *
     * @return the value of cloud_group.resources_sum
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public Long getResourcesSum() {
        return resourcesSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.resources_sum
     *
     * @param resourcesSum the value for cloud_group.resources_sum
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setResourcesSum(Long resourcesSum) {
        this.resourcesSum = resourcesSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.return_sum
     *
     * @return the value of cloud_group.return_sum
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public Long getReturnSum() {
        return returnSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.return_sum
     *
     * @param returnSum the value for cloud_group.return_sum
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setReturnSum(Long returnSum) {
        this.returnSum = returnSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.job_type
     *
     * @return the value of cloud_group.job_type
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.job_type
     *
     * @param jobType the value for cloud_group.job_type
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setJobType(String jobType) {
        this.jobType = jobType == null ? null : jobType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_group.xxl_job_id
     *
     * @return the value of cloud_group.xxl_job_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public Integer getXxlJobId() {
        return xxlJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_group.xxl_job_id
     *
     * @param xxlJobId the value for cloud_group.xxl_job_id
     *
     * @mbg.generated Fri Aug 11 15:18:52 CST 2023
     */
    public void setXxlJobId(Integer xxlJobId) {
        this.xxlJobId = xxlJobId;
    }
}