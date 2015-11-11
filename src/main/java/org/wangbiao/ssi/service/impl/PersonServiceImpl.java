package org.wangbiao.ssi.service.impl;

import org.springframework.stereotype.Service;
import org.wangbiao.ssi.dao.PersonDao;
import org.wangbiao.ssi.model.Person;
import org.wangbiao.ssi.service.PersonService;

import javax.annotation.Resource;

/**
 * Created by Wang Biao on 15/11/5.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonDao personDao;

    public void save(Person person) {
        personDao.insert(person);
    }
}
