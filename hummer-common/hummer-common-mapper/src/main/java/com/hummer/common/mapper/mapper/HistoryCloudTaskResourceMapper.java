package com.hummer.common.mapper.mapper;

import com.hummer.common.mapper.domain.HistoryCloudTaskResource;
import com.hummer.common.mapper.domain.HistoryCloudTaskResourceExample;
import com.hummer.common.mapper.domain.HistoryCloudTaskResourceWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryCloudTaskResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    long countByExample(HistoryCloudTaskResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int deleteByExample(HistoryCloudTaskResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int insert(HistoryCloudTaskResourceWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int insertSelective(HistoryCloudTaskResourceWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    List<HistoryCloudTaskResourceWithBLOBs> selectByExampleWithBLOBs(HistoryCloudTaskResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    List<HistoryCloudTaskResource> selectByExample(HistoryCloudTaskResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    HistoryCloudTaskResourceWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByExampleSelective(@Param("record") HistoryCloudTaskResourceWithBLOBs record, @Param("example") HistoryCloudTaskResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") HistoryCloudTaskResourceWithBLOBs record, @Param("example") HistoryCloudTaskResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByExample(@Param("record") HistoryCloudTaskResource record, @Param("example") HistoryCloudTaskResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByPrimaryKeySelective(HistoryCloudTaskResourceWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(HistoryCloudTaskResourceWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_task_resource
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByPrimaryKey(HistoryCloudTaskResource record);
}
