package com.bryan.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ClassName: HomeInterceptor
 * Package: com.kuang.interceptor
 * Description:
 *
 * @Author: Bryan Long
 * @Create: 2024/9/17 - 11:28
 * @Version: v1.0
 */
public class HomeInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("----------pre handle----------");

        HttpSession session = request.getSession();

        // 对于来自login的请求，放行
        if (request.getRequestURI().contains("login")){
            return true;
        }
        // 对于来自submit的请求，放行
        if(request.getRequestURI().contains("submit")){
            return true;
        }
        // 对于来自user的请求，放行
        if(session.getAttribute("user") != null) {
            return true;
        }

        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("----------post handle----------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("----------after completion----------");
    }
}
