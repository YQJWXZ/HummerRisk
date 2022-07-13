package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.PackageResultItem;
import com.hummerrisk.base.domain.PackageResultItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PackageResultItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    long countByExample(PackageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int deleteByExample(PackageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int insert(PackageResultItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int insertSelective(PackageResultItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    List<PackageResultItem> selectByExampleWithBLOBs(PackageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    List<PackageResultItem> selectByExample(PackageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    PackageResultItem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int updateByExampleSelective(@Param("record") PackageResultItem record, @Param("example") PackageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") PackageResultItem record, @Param("example") PackageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int updateByExample(@Param("record") PackageResultItem record, @Param("example") PackageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int updateByPrimaryKeySelective(PackageResultItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(PackageResultItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result_item
     *
     * @mbg.generated Tue Jun 28 11:44:06 CST 2022
     */
    int updateByPrimaryKey(PackageResultItem record);
}
