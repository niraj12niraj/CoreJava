package com.jlcindia.filters;

import java.io.*;
import javax.servlet.*;

public class FilterA implements Filter {
	public void destroy() {
		System.out.println("FilterA destroy()");
	}
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterA doFilter() Started");
		chain.doFilter(req, res);
		System.out.println("FilterA doFilter() Completed");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterA init()");
	}

}
