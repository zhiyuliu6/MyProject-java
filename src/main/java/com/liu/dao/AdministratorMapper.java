package com.liu.dao;

import com.liu.bean.Administrator;

import java.util.List;

public interface AdministratorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int insert(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    Administrator selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    List<Administrator> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int updateByPrimaryKey(Administrator record);
}