/*package org.mababio.spring.config;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsfConfig {

    @Bean
    public FacesServlet facesServlet() {
        return new FacesServlet();
    }

    @Bean
    public ServletRegistrationBean facesServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(facesServlet(), "*.xhtml");
        registration.setName("FacesServlet")
        return registration;
    }

    @Bean
    public ListenerRegistationBean jsfConfigureListener() {
        return new ListenerRegistrationBean(new ConfigureListener());           
    }       
}}
*/