package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.HistoryCloudNativeResultLog;
import com.hummerrisk.base.domain.HistoryCloudNativeResultLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryCloudNativeResultLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    long countByExample(HistoryCloudNativeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int deleteByExample(HistoryCloudNativeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int insert(HistoryCloudNativeResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int insertSelective(HistoryCloudNativeResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    List<HistoryCloudNativeResultLog> selectByExampleWithBLOBs(HistoryCloudNativeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    List<HistoryCloudNativeResultLog> selectByExample(HistoryCloudNativeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    HistoryCloudNativeResultLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByExampleSelective(@Param("record") HistoryCloudNativeResultLog record, @Param("example") HistoryCloudNativeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") HistoryCloudNativeResultLog record, @Param("example") HistoryCloudNativeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByExample(@Param("record") HistoryCloudNativeResultLog record, @Param("example") HistoryCloudNativeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByPrimaryKeySelective(HistoryCloudNativeResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(HistoryCloudNativeResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result_log
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByPrimaryKey(HistoryCloudNativeResultLog record);
}
