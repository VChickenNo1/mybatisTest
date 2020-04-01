package com.cyy.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cyy.dao.IUserDao;
import com.cyy.service.IUserService;
import com.cyy.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public String findAll() {
        List<UserVO> users = userDao.findAll();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data", users);
        jsonObject.put("status", 200);
        jsonObject.put("msg", "success");
        return jsonObject.toJSONString();
    }
}
