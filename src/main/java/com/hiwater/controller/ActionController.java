package com.hiwater.controller;

import com.hiwater.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("action/")
public class ActionController {

    @Autowired
    private ActionService actionService;

    @RequestMapping("listAction.mvc")
    public String listAction(){
        actionService.getActionList();
        return "this is a test";
    }
}
