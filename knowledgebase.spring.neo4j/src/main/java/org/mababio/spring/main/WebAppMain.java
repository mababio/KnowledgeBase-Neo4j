

package org.mababio.spring.main;


import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="org.mababio.spring")
public class WebAppMain {
	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebAppMain.class, args);
	}
	
	 @Bean
	    public ServletRegistrationBean servletRegistrationBean() {
	        FacesServlet servlet = new FacesServlet();
	        return new ServletRegistrationBean(servlet, "*.xhtml");
	    }

}
