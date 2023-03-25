package com.spring.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showMyFirstView() {
        // file index.jsp перекрывает область видимости других файлов при переходе по ссылке "/"
        // чтобы по ссылке "/" переходить на другой файл, нужно удалить файл index.jsp
        return "index2.jsp";
    }
}
