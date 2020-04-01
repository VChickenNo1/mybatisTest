package com.cyy.dao;

import com.cyy.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao  {

    List<UserVO> findAll();
}
