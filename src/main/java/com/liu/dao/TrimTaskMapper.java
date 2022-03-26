package com.liu.dao;

import com.liu.bean.TrimTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrimTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trim_task
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trim_task
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int insert(TrimTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trim_task
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    TrimTask selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trim_task
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    List<TrimTask> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trim_task
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int updateByPrimaryKey(TrimTask record);
}