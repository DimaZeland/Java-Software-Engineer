package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SetCookiesServlet", value = "/SetCookiesServlet")
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("some_id", "123");
        Cookie cookie2 = new Cookie("some_name", "Tom");

        cookie1.setMaxAge(60 * 60 * 24);
        cookie2.setMaxAge(60 * 60 * 24);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
