package com.hummerrisk.base.domain;

import java.io.Serializable;

public class CloudResource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.resource_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String resourceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.dir_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String dirName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.resource_status
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String resourceStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.resource_type
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String resourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.resources_sum
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private Long resourcesSum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.plugin_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String pluginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.plugin_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String pluginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.plugin_icon
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String pluginIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.account_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.region_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String regionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.region_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private String regionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.create_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.update_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private Long updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_resource
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.id
     *
     * @return the value of cloud_resource.id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.id
     *
     * @param id the value for cloud_resource.id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.resource_name
     *
     * @return the value of cloud_resource.resource_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.resource_name
     *
     * @param resourceName the value for cloud_resource.resource_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.dir_name
     *
     * @return the value of cloud_resource.dir_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getDirName() {
        return dirName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.dir_name
     *
     * @param dirName the value for cloud_resource.dir_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setDirName(String dirName) {
        this.dirName = dirName == null ? null : dirName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.resource_status
     *
     * @return the value of cloud_resource.resource_status
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getResourceStatus() {
        return resourceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.resource_status
     *
     * @param resourceStatus the value for cloud_resource.resource_status
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus == null ? null : resourceStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.resource_type
     *
     * @return the value of cloud_resource.resource_type
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.resource_type
     *
     * @param resourceType the value for cloud_resource.resource_type
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.resources_sum
     *
     * @return the value of cloud_resource.resources_sum
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public Long getResourcesSum() {
        return resourcesSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.resources_sum
     *
     * @param resourcesSum the value for cloud_resource.resources_sum
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setResourcesSum(Long resourcesSum) {
        this.resourcesSum = resourcesSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.plugin_id
     *
     * @return the value of cloud_resource.plugin_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.plugin_id
     *
     * @param pluginId the value for cloud_resource.plugin_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.plugin_name
     *
     * @return the value of cloud_resource.plugin_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.plugin_name
     *
     * @param pluginName the value for cloud_resource.plugin_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName == null ? null : pluginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.plugin_icon
     *
     * @return the value of cloud_resource.plugin_icon
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getPluginIcon() {
        return pluginIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.plugin_icon
     *
     * @param pluginIcon the value for cloud_resource.plugin_icon
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setPluginIcon(String pluginIcon) {
        this.pluginIcon = pluginIcon == null ? null : pluginIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.account_id
     *
     * @return the value of cloud_resource.account_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.account_id
     *
     * @param accountId the value for cloud_resource.account_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.region_id
     *
     * @return the value of cloud_resource.region_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.region_id
     *
     * @param regionId the value for cloud_resource.region_id
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.region_name
     *
     * @return the value of cloud_resource.region_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.region_name
     *
     * @param regionName the value for cloud_resource.region_name
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.create_time
     *
     * @return the value of cloud_resource.create_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.create_time
     *
     * @param createTime the value for cloud_resource.create_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.update_time
     *
     * @return the value of cloud_resource.update_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.update_time
     *
     * @param updateTime the value for cloud_resource.update_time
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}