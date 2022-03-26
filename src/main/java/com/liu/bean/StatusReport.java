package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusReport {

    private Integer id;

    private Date date;

    private String postscript;

    private String feedback;

    private Integer status;

    private Integer staffId;

}