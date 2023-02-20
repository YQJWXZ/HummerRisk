package com.hummer.common.mapper.mapper;

import com.hummer.common.mapper.domain.CloudNativeResult;
import com.hummer.common.mapper.domain.CloudNativeResultExample;
import com.hummer.common.mapper.domain.CloudNativeResultWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudNativeResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    long countByExample(CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int deleteByExample(CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int insert(CloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int insertSelective(CloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    List<CloudNativeResultWithBLOBs> selectByExampleWithBLOBs(CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    List<CloudNativeResult> selectByExample(CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    CloudNativeResultWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudNativeResultWithBLOBs record, @Param("example") CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") CloudNativeResultWithBLOBs record, @Param("example") CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int updateByExample(@Param("record") CloudNativeResult record, @Param("example") CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int updateByPrimaryKeySelective(CloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(CloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Thu Dec 22 22:45:23 CST 2022
     */
    int updateByPrimaryKey(CloudNativeResult record);
}
