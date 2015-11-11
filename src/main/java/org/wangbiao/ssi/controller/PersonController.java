package org.wangbiao.ssi.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wangbiao.ssi.model.Person;
import org.wangbiao.ssi.service.PersonService;

import javax.annotation.Resource;

/**
 * Created by Wang Biao on 15/11/11.
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    private Logger log = Logger.getLogger(PersonController.class);
    @Resource
    private PersonService personService;

    @RequestMapping("/save")
    public String save() {
        Person person = new Person();
        person.setName("Steve Jobs");
        person.setAge(1212);

        personService.save(person);
        log.info("SUCCESS");
        return "success";
    }

}
