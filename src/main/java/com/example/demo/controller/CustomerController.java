package com.example.demo.controller;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.db.DBManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO dao;

    public void setDao(CustomerDAO dao){
        this.dao = dao;
    }


    @RequestMapping("/hello")
    public void hello(){
        DBManager.test();
    }

    @RequestMapping("/list")
    public void list(Model model){
        model.addAttribute("list", dao.findAll());
    }
}