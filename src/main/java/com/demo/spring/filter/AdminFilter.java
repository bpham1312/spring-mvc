package com.demo.spring.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/admin/*")
public class AdminFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest)request).getSession();
		String value = (String)session.getAttribute("auth");
		if( value == null || !value.equals("ADMIN")) {
			String queryString = ((HttpServletRequest)request).getQueryString();
			if(queryString==null) {
				request.setAttribute("URL", ((HttpServletRequest) request).getRequestURI());
			}else {
				request.setAttribute("URL", ((HttpServletRequest) request).getRequestURI()+"?"+queryString);				
			}
			request.getRequestDispatcher("/account/login").forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
