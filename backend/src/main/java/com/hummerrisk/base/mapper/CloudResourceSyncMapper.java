package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.CloudResourceSync;
import com.hummerrisk.base.domain.CloudResourceSyncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloudResourceSyncMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    long countByExample(CloudResourceSyncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int deleteByExample(CloudResourceSyncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int insert(CloudResourceSync record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int insertSelective(CloudResourceSync record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    List<CloudResourceSync> selectByExample(CloudResourceSyncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    CloudResourceSync selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudResourceSync record, @Param("example") CloudResourceSyncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByExample(@Param("record") CloudResourceSync record, @Param("example") CloudResourceSyncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByPrimaryKeySelective(CloudResourceSync record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_resource_sync
     *
     * @mbg.generated Sat Oct 01 14:57:31 CST 2022
     */
    int updateByPrimaryKey(CloudResourceSync record);
}