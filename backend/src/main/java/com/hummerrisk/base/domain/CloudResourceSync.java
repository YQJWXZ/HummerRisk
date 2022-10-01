package com.hummerrisk.base.domain;

import java.io.Serializable;

public class CloudResourceSync implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.status
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.apply_user
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String applyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.create_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.account_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.plugin_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String pluginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.plugin_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String pluginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.plugin_icon
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String pluginIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.resource_types
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String resourceTypes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_sync.resources_sum
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private Long resourcesSum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.id
     *
     * @return the value of cloud_resource_sync.id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.id
     *
     * @param id the value for cloud_resource_sync.id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.status
     *
     * @return the value of cloud_resource_sync.status
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.status
     *
     * @param status the value for cloud_resource_sync.status
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.apply_user
     *
     * @return the value of cloud_resource_sync.apply_user
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.apply_user
     *
     * @param applyUser the value for cloud_resource_sync.apply_user
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser == null ? null : applyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.create_time
     *
     * @return the value of cloud_resource_sync.create_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.create_time
     *
     * @param createTime the value for cloud_resource_sync.create_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.account_id
     *
     * @return the value of cloud_resource_sync.account_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.account_id
     *
     * @param accountId the value for cloud_resource_sync.account_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.plugin_id
     *
     * @return the value of cloud_resource_sync.plugin_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.plugin_id
     *
     * @param pluginId the value for cloud_resource_sync.plugin_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.plugin_name
     *
     * @return the value of cloud_resource_sync.plugin_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.plugin_name
     *
     * @param pluginName the value for cloud_resource_sync.plugin_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName == null ? null : pluginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.plugin_icon
     *
     * @return the value of cloud_resource_sync.plugin_icon
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getPluginIcon() {
        return pluginIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.plugin_icon
     *
     * @param pluginIcon the value for cloud_resource_sync.plugin_icon
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setPluginIcon(String pluginIcon) {
        this.pluginIcon = pluginIcon == null ? null : pluginIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.resource_types
     *
     * @return the value of cloud_resource_sync.resource_types
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getResourceTypes() {
        return resourceTypes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.resource_types
     *
     * @param resourceTypes the value for cloud_resource_sync.resource_types
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes == null ? null : resourceTypes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_sync.resources_sum
     *
     * @return the value of cloud_resource_sync.resources_sum
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public Long getResourcesSum() {
        return resourcesSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_sync.resources_sum
     *
     * @param resourcesSum the value for cloud_resource_sync.resources_sum
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setResourcesSum(Long resourcesSum) {
        this.resourcesSum = resourcesSum;
    }
}