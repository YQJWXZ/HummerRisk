package com.hummer.common.mapper.mapper;

import com.hummer.common.mapper.domain.Favorite;
import com.hummer.common.mapper.domain.FavoriteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FavoriteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    long countByExample(FavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    int deleteByExample(FavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    int insert(Favorite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    int insertSelective(Favorite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    List<Favorite> selectByExample(FavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    Favorite selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    int updateByExampleSelective(@Param("record") Favorite record, @Param("example") FavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    int updateByExample(@Param("record") Favorite record, @Param("example") FavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    int updateByPrimaryKeySelective(Favorite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Fri Jul 08 03:35:11 CST 2022
     */
    int updateByPrimaryKey(Favorite record);
}
