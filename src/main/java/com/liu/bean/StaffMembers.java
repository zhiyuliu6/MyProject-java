package com.liu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffMembers {

    private String id;

    private String mebName;

    private String mebAge;

    private String phone;

    private Integer staffLeaderId;
}