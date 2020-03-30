package com.cyy.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVO implements Serializable {

    private  Integer id;
    private String username;
    private String birthday;
    private String sex;
    private String address;

}
