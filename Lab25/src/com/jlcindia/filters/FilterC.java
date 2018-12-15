package com.jlcindia.filters;

import java.io.*;

import javax.servlet.*;

public class FilterC implements Filter {
	public void destroy() {
		System.out.println("FilterC destroy()");
	}
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterC doFilter() Started");
		chain.doFilter(req, res);
		System.out.println("FilterC doFilter() Completed");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterC init()");
	}

}
