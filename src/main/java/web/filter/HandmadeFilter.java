package web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by dapa56 on 2017. 7. 22..
 */
public class HandmadeFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("this is HandmadeFilter");
		chain.doFilter(request, response);
	}

	public void destroy() {

	}
}
