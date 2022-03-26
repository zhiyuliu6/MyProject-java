package com.liu.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeState {

    private Integer id;

    private Integer liTreeNum;

    private Integer deTreeNum;

    private Double height;

    private String treeRounds;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date plantingTime;

    private String type;
}