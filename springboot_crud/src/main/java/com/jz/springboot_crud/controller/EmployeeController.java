package com.jz.springboot_crud.controller;

import com.jz.springboot_crud.dao.EmployeeDao;
import com.jz.springboot_crud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @param
 * @description
 * @Created by IntelliJ IDEA.
 * @author:
 * @Date: 2020/4/30
 * @return
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    @GetMapping("/emps")
    public String list(Model model){

        Collection<Employee> employees = employeeDao.getAll();
        //放在请求域中
        model.addAttribute("emps",employees);
        return "emp/list";
    }
}

