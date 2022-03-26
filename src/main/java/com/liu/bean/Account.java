package com.liu.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Integer id;

    private String usr;

    private String psw;

    private String loginType;

    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;
}