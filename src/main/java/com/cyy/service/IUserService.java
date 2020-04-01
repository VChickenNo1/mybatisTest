package com.cyy.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface IUserService {

    String findAll();

}
