package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RequestMapping можно указать так же на весь класс Контроллер.
//В таком случае url будет складывать со всеми последующими @RequestMapping'ами
@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    //Так же вместо реквеста можно получить данные при помощи аннотации @RequestParam
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr. " + empName + "!";

        //Добавляем в модель - контейнер для любых данных - новую строку
        //Дальше используем уже attributeName
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - Udemy instructor");

        return "show-emd-details-view";
    }
}
