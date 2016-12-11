package com.zheng.hz.service;

import com.zheng.hz.api.model.PersonVO;
import com.zheng.hz.api.service.PersonService;
import com.zheng.hz.dao.auto.PersonMapper;
import com.zheng.hz.model.auto.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/13/013.
 */
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    public PersonVO get(Long personId) {
        PersonVO personVO = new PersonVO();
        Person person = personMapper.selectByPrimaryKey(personId);
        BeanUtils.copyProperties(person,personVO);
        return personVO;
    }
}
