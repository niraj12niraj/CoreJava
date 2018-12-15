package com.jlcindia.filters;
import java.io.*;

import javax.servlet.*;

public class FilterB implements Filter {
	public void destroy() {
		System.out.println("FilterB destroy()");
	}
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterB doFilter() Started");
		chain.doFilter(req, res);
		System.out.println("FilterB doFilter() Completed");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterB init()");
	}

}
