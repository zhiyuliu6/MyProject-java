package com.liu.dao;

import com.liu.bean.Storages;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoragesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storages
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    void deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storages
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    void insert(Storages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storages
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    Storages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storages
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    List<Storages> selectAll();

    List<String> selectAllType();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storages
     *
     * @mbg.generated Sat Feb 19 10:18:30 CST 2022
     */
    int updateByPrimaryKey(Storages record);

    List<Storages> selectAllTree(String type);

    void deleteByList(List<Integer> idList);
}