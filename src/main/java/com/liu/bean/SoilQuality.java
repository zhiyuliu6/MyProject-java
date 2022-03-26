package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoilQuality {

    private Integer id;

    private Integer acreage;

    private Double ph;

    private Double wetness;

    private String nutrient;

}