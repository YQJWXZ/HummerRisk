package com.hummer.common.mapper.mapper;

import com.hummer.common.mapper.domain.Image;
import com.hummer.common.mapper.domain.ImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    long countByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    int deleteByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    int insert(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    int insertSelective(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    List<Image> selectByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    Image selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    int updateByExampleSelective(@Param("record") Image record, @Param("example") ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    int updateByExample(@Param("record") Image record, @Param("example") ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    int updateByPrimaryKeySelective(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    int updateByPrimaryKey(Image record);
}
