package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping можно указать так же на весь класс Контроллер.
//В таком случае url будет складывать со всеми последующими @RequestMapping'ами
@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        //Теперь все заполненеы данные будут связаны с моделью типа Employee
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    //@ModelAttribute("employee") Employee emp через данную конструкцию мы указываем какую модель необходимо
    //использовать
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee emp) {

        //Так же можно менятб значение полей модели
        //Отображаться будут уже изменные данные
        emp.setName("Mr." + emp.getName());
        return "show-emd-details-view";
    }
}
