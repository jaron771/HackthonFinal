package com.right.vivo.Interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author DW
 * @date 2019/5/27
 */
public class LogInInterceptor implements HandlerInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogInInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
//        HttpSession session = httpServletRequest.getSession();
//        LOGGER.error("LOGGER!");
//        if (null != session && null != session.getAttribute(InterceptorConfiguration.SESSION_KEY)) {
        return true;
//        }
//        httpServletResponse.sendRedirect("/index");
//        return false;
    }
}
