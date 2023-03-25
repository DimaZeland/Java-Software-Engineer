package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    //Через HttpServletRequest получаем и фнормацию о реквесте. В нашем случае введенное имя
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model) {
        //В параметре указали откуда мы хотим получить данные
        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;

        //Добавляем в модель - контейнер для любых данных - новую строку
        //Дальше используем уже attributeName
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - Udemy instructor");

        return "show-emd-details-view";
    }
}
