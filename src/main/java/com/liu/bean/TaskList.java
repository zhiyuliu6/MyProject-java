package com.liu.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskList {

    private Integer tid;

    private Integer leaderId;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    private String taskNote;

    private Integer timeRange;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    private Integer finished;

    private Map<String,Object> staffLeader;

    private List<String> picUil;
}