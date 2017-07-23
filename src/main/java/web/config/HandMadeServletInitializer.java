package web.config;

import org.springframework.web.WebApplicationInitializer;
import web.filter.HandmadeFilter;
import web.servlet.HandmadeServlet;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by dapa56 on 2017. 7. 22..
 */
public class HandmadeServletInitializer implements WebApplicationInitializer {
	public void onStartup(ServletContext servletContext) throws ServletException {
		//servlet initialize
		servletContext.addServlet("HandmadeServlet", HandmadeServlet.class)
		.addMapping("/handmade/*");

		//filter initialize
		FilterRegistration.Dynamic filter = servletContext.addFilter("HandmadeFilter", HandmadeFilter.class);
		filter.addMappingForServletNames(null, false, "HandmadeServlet");
	}

}
