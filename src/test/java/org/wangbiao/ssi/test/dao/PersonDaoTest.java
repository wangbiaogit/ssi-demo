package org.wangbiao.ssi.test.dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.wangbiao.ssi.dao.PersonDao;
import org.wangbiao.ssi.model.Person;

/**
 * Created by Wang Biao on 15/11/5.
 */
@ContextConfiguration({"classpath:spring-context.xml", "classpath:sqlMapConfig.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "txManager")
public class PersonDaoTest {
    private Logger log = Logger.getLogger(PersonDaoTest.class);

    @Autowired
    private PersonDao personDao;

    @Test
    public void testSave() {
        Person p = new Person();
        p.setName("Wang Biao");
        p.setAge(11);

        personDao.insert(p);
        log.info("SUCCESS");
    }

    @Test
    public void testSelectByPrimaryKey() {
        Person person = personDao.selectByPrimaryKey(1);
        System.out.println(person);
        log.info(person);
    }

}
