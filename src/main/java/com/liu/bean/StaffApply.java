package com.liu.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffApply {

    private Integer id;

    private String applyType;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    private Integer staffId;

    private Integer number;

    private Integer applyStatus;

    private String note;

    private String staffName;
}