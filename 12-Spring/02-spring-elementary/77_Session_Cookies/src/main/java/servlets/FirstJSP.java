package servlets;

import somePackage.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstJSP extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        getServletContext().getRequestDispatcher("/testJsp.jsp").forward(request, response);
    }
}
