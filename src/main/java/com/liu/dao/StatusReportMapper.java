package com.liu.dao;

import com.liu.bean.StatusReport;

import java.util.List;

public interface StatusReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_report
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_report
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int insert(StatusReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_report
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    StatusReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_report
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    List<StatusReport> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_report
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int updateByPrimaryKey(StatusReport record);
}