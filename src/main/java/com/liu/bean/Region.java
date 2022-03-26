package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region {

    private Integer regionId;

    private String name;

    private List<RegionSoil> smallRegions;

    private int searchId;

    private Double latitude;

    private Double longitude;

}