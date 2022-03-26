package com.liu.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffLeader {

    private Integer id;

    private Integer regionSoilId;

    private String name;

    private String phone;

    private Integer age;

    private String address;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date hiredate;

    private Integer accountId;

    private List<StaffMembers> members;

}