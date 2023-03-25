package com.spring.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showMyFirstView() {
        // file index.jsp ����������� ������� ��������� ������ ������ ��� �������� �� ������ "/"
        // ����� �� ������ "/" ���������� �� ������ ����, ����� ������� ���� index.jsp
        return "index2.jsp";
    }
}
