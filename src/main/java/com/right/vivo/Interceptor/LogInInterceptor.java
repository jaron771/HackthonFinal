package com.right.vivo.Interceptor;

import com.right.vivo.config.InterceptorConfiguration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author DW
 * @date 2019/5/27
 */
public class LogInInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        if (null != session && null != session.getAttribute(InterceptorConfiguration.SESSION_KEY)) {
            return true;
        }
        httpServletResponse.sendRedirect("/index");
        return false;
    }
}
