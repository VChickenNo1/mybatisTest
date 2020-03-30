package com.cyy.dao;

import com.cyy.vo.UserVO;

import java.util.List;

public interface IUserDao {

    List<UserVO> findAll();
}
