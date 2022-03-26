package com.liu.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRecords {

    private Integer id;

    private Integer regionId;

    private Double rainFell;

    @JSONField(format = "yyyy-MM-dd")
    private Date date;

}