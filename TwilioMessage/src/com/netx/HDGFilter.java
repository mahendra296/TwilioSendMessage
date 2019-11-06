package com.netx;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HDGFilter implements Filter
{
	public HDGFilter()	{}
	public void init(FilterConfig filterConfig)	{}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException	{
		//response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");chain.doFilter(request, response);
		//response.setCharacterEncoding("UTF-8");
	}
	public void destroy(){}
}
