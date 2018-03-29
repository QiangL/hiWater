package com.hiwater.controller;

import com.hiwater.pojo.Action;
import com.hiwater.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("action/")
public class ActionController {

    @Autowired
    private ActionService actionService;

    @RequestMapping("listAction.mvc")
    public List<Action> listAction(){
        return  actionService.getActionList();
    }
}
