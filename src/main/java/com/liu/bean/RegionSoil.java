package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionSoil {

    private Integer id;

    private Integer soilId;

    private Integer regionId;

    private String smallName;

    private Integer treeStateId;

    private StaffLeader staffLeader;

    private SoilQuality soilQuality;

    private TreeState treeState;

    private List<DrawPoint> points;
}