package com.jmz.qyyl.controller;

import com.jmz.qyyl.model.SystemDBbak;
import com.jmz.qyyl.service.SystemDBbakService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * controller
 * 袁宗宇
 */
@RestController
public class DbBackRestController {


    @Resource
    private SystemDBbakService systemDBbakService ;


    @RequestMapping(value = "/dbBak/save", method = RequestMethod.GET)
    public void findByName() throws Exception{
        SystemDBbak systemDBbak=new SystemDBbak();
        systemDBbak.setDbBakName("fs");
        systemDBbakService.insert(systemDBbak);
    }

}
