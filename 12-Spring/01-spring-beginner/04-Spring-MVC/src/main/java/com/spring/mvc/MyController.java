package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        // file index.jsp перекрывает область видимости других файлов при переходе по ссылке "/"
        // чтобы по ссылке "/" переходить на другой файл, нужно удалить файл index.jsp
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    //Аннотация @Valid означает, что данный параметр будет подвергунт валидации
    //При помощи BindingResult узнаем удачно ли прошла валидация
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        //Если при валидации была ошибка, то возвращаем тот же view с которого получили ошибку валидации
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emd-details-view";
        }
    }
}
