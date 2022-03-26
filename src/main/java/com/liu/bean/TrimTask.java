package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrimTask {

    private Integer id;

    private String type;

    private Integer tid;

    private TaskList taskList;
}