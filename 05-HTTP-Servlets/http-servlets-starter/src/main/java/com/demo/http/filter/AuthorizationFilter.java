package com.demo.http.filter;

import com.demo.http.dto.UserDto;
import com.demo.http.util.UrlPath;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Set;

@WebFilter("/*")
public class AuthorizationFilter implements Filter {

    private static final Set<String> PUBLIC_PATH = Set.of(UrlPath.LOGIN, UrlPath.REGISTRATION, UrlPath.IMAGES, UrlPath.LOCALE);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         var uri = ((HttpServletRequest) servletRequest).getRequestURI();
        if(isPublicPath(uri) || isUserLoggedIn(servletRequest)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            var prevPage = ((HttpServletRequest) servletRequest).getHeader("referer");
            ((HttpServletResponse) servletResponse).sendRedirect(prevPage!= null ? prevPage : UrlPath.LOGIN);
        }
    }

    private boolean isUserLoggedIn(ServletRequest servletRequest) {
        var user = (UserDto)((HttpServletRequest) servletRequest).getSession().getAttribute("user");
        return user != null /*&& user.getRole() == Role.ADMIN*/;
    }

    private boolean isPublicPath(String uri) {
        return PUBLIC_PATH.stream().anyMatch(uri::startsWith);
    }
}
