package cn.overseachem.erp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		System.out.println("拦截器");
		//登陆方法和注册方法,不拦截
		if(uri.indexOf("login1.action")>0||uri.indexOf("register.action")>0) {
			return true;
		}
		if(request.getSession().getAttribute("userId")!=null) {
			System.out.println("session值不为空");
			return true;
		}
		System.out.println("重定向到了login.jsp");
		response.sendRedirect("/login/2login");
		return false;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
