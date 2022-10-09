package com.example.demopage.filter;

import com.example.demopage.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class CustomFilter implements Filter {

    @Autowired
    private CustomService customService;


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("intercepted request...");
        customService.method1();
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
