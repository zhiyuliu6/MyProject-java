package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class SystemRecord {
    private Integer id;

    private Date date;

    private String type;

    private Integer accountId;
}