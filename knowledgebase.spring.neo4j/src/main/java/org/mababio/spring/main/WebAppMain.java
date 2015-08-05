
	
package org.mababio.spring.main;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="org.mababio.spring")
public class WebAppMain  extends SpringBootServletInitializer{
	
	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebAppMain.class);
	}*/

	public static void main(String[] args) throws Exception {

		SpringApplication.run(WebAppMain.class, args);
	}
	

}
