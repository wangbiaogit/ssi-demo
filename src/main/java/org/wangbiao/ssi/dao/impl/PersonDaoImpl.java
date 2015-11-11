package org.wangbiao.ssi.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.wangbiao.ssi.dao.PersonDao;
import org.wangbiao.ssi.model.Person;

import javax.annotation.Resource;

/**
 * Created by Wang Biao on 15/11/5.
 */
@Repository
public class PersonDaoImpl implements PersonDao {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
    private String namespace = "person.";

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(Person person) {
        return sqlSessionTemplate.insert(namespace + "insert", person);
    }

    public int insertSelective(Person record) {
        return 0;
    }

    public Person selectByPrimaryKey(Integer id) {
        return sqlSessionTemplate.selectOne(namespace + "selectByPrimaryKey", id);
    }

    public int updateByPrimaryKeySelective(Person record) {
        return 0;
    }

    public int updateByPrimaryKey(Person record) {
        return 0;
    }

}
