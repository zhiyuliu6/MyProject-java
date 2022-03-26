package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlantingTask {

    private Integer id;

    private String treeType;

    private Integer treeNum;

    private Integer tid;

    private TaskList taskList;
}