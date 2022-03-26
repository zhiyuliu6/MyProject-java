package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CapitalFlow {

    private Integer id;

    private String name;

    private String type;

    private Double number;

    private Date date;

    private String note;

    private Integer modifiedId;
}