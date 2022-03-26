package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WateringTask {

    private Integer id;

    private Integer times;

    private Integer tid;

    private TaskList taskList;

}