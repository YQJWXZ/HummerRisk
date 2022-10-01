package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.CloudResourceSyncItemLog;
import com.hummerrisk.base.domain.CloudResourceSyncItemLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloudResourceSyncItemLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    long countByExample(CloudResourceSyncItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int deleteByExample(CloudResourceSyncItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int insert(CloudResourceSyncItemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int insertSelective(CloudResourceSyncItemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    List<CloudResourceSyncItemLog> selectByExampleWithBLOBs(CloudResourceSyncItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    List<CloudResourceSyncItemLog> selectByExample(CloudResourceSyncItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    CloudResourceSyncItemLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudResourceSyncItemLog record, @Param("example") CloudResourceSyncItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") CloudResourceSyncItemLog record, @Param("example") CloudResourceSyncItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByExample(@Param("record") CloudResourceSyncItemLog record, @Param("example") CloudResourceSyncItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByPrimaryKeySelective(CloudResourceSyncItemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(CloudResourceSyncItemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync_item_log
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByPrimaryKey(CloudResourceSyncItemLog record);
}