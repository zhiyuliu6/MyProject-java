package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Storages {

    private Integer id;

    private String name;

    private String type;

    private Integer number;

    private String picUrl;

    private String note;
}