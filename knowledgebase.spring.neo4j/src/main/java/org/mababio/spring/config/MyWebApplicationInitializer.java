/*package org.mababio.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

	
	
	 * Here I am programactically added a servlet to the web app
	 * this servlet is the Dispatcher Servlet for Spring MVC
	 * Basically control is passed to Spring MVC framework
	 * This can be done via the web.xml --> in fact the code is there, but commented out
	 * 
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		 
		ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet());
	    registration.setLoadOnStartup(1);
	    registration.addMapping("/spring/*");

	}

}
*/