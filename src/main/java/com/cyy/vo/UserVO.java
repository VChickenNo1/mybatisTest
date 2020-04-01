package com.cyy.vo;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class UserVO {

    private Integer id;
    private String username;
    private String birthday;
    private String sex;
    private String address;

}
